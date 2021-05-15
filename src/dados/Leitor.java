
package dados;

import classes.JavaUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Leitor {
    
    private FileReader mArquivo;
    private List<String> mList;

    public List<String> getPalavraArquivo() throws IOException{
        
        mList = new ArrayList<>();
        
        try{
            File f = new File("lista_palavras.txt");
            mArquivo = new FileReader(f);
            BufferedReader lerArq = new BufferedReader(mArquivo);

            String linha = lerArq.readLine(); 
            
            while (linha != null) {
                mList.add(linha);
                linha = lerArq.readLine(); 
            }
        }catch (IOException e) {
            System.out.print("Erro ao ler arquivo contendo as palavras");
        }finally{
            mArquivo.close();
        }  
        return  mList;
    
    }
}
