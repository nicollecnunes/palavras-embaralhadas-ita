
package mecanica;

import dados.BancoPalavras;

public class Vidas implements MecJogo{

    private int mQtdPalavrasErradas = 3;
    private BancoPalavras mPalavras = new BancoPalavras();
    private int mPontos = 0;
    
    @Override
    public String getNome() {
        return "Acertar o maior número de palavras antes que a vida acabe";
    }

    @Override
    public String getDescricao() {
        return "O jogo inicia com 3 vidas. A cada erro voce perde uma vida.";
    }

    @Override
    public boolean isAcabou() {
        if(mQtdPalavrasErradas <= 0){
            return true;
        }
       return false;
    }

    @Override
    public String getPalavra() {
        return mPalavras.getNext();
    }

    @Override
    public String tentativa(String palavra, String resposta) {
        if(palavra.equals(resposta)){
            mPontos++;
            return "Voce acertou!!";
        }else{
            mQtdPalavrasErradas--;
            return "Voce errou, mas ainda tem " + mQtdPalavrasErradas + " vidas.";
        }
    }

    @Override
    public String getResultadoFinal() {
        
        String result = "Fim de Jogo. Total de pontos: " + mPontos;
        
        return result;
    }
    
}
