
package main;

import classes.JavaUtils;
import embaralhar.Embaralhar;
import embaralhar.FabricaEmb;
import mecanica.TodasPalavras;
import mecanica.FabricaMec;
import mecanica.MecJogo;
import mecanica.ErrouAcabou;
import mecanica.Vidas;
import java.util.Scanner;

public class principal extends JavaUtils{
		
    private static Scanner mOpcao;
        private static Scanner scanner;
        
        public static void main(String[] args){
            
            mOpcao = new Scanner(System.in);
        scanner = new Scanner(System.in);
        
        printLN("==================== ESCOLHA A MECÂNICA DO JOGO ===============");
        printLN("1 - Errou acabou.");
        printLN("2 - O maior número de acertos.");
        printLN("3 - Três vidas.");
        printT("->");
        int opcao = mOpcao.nextInt();
	    switch(opcao){
	         case 1:
	            FabricaMec.set(new ErrouAcabou());
	            break;
	         case 2: 
	            FabricaMec.set(new TodasPalavras());
	            break;
	         case 3: 
	            FabricaMec.set(new Vidas());
	            break;
	         default:
	            printLN("Número Inválido");
	            System.exit(0);
	         break;
	   } 


        MecJogo mecanicaDoJogo = FabricaMec.get();

        printLN("*=============================================================*");
        printLN("*=====================COMEÇAR=================================*");
        printLN("O modo selecionado foi: " + mecanicaDoJogo.getNome());
        printLN(mecanicaDoJogo.getDescricao());
        
        espaco();
        
        while(!mecanicaDoJogo.isAcabou()){
            String palavra = mecanicaDoJogo.getPalavra();
            Embaralhar embaralhador = FabricaEmb.getRandom();
            String embaralhada = embaralhador.embaralhar(palavra);
            
            printLN("PALAVRA: " + embaralhada);
            printT("-> ");
            String resposta = scanner.nextLine().toUpperCase();
            String resultado = mecanicaDoJogo.tentativa(palavra, resposta);
            printLN("Resultado: " + resultado);
        }
        
        printLN(mecanicaDoJogo.getResultadoFinal());
    
    }
}
