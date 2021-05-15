
package mecanica;

import dados.BancoPalavras;

public class TodasPalavras implements MecJogo{

    private static int mQtdPalavras = 0;
    private BancoPalavras mPalavras = new BancoPalavras();
    private String mPalavraVez = mPalavras.getNext();
    private int mPontos = 0;
    private int mResta = mPalavras.getTamanho();
    
    @Override
    public String getNome() {
        return "Acerte o maior número de palavras possiveis, todas serao mostradas.";
    }

    @Override
    public String getDescricao() {
        return "Palavra certa: +10pts. Palavra errada: -5pts";
    }

    @Override
    public boolean isAcabou() {
       return mQtdPalavras == mPalavras.getTamanho() ? true : false;
    }

    @Override
    public String getPalavra() {
        return mPalavraVez;
    }

    @Override
    public String tentativa(String palavra, String resposta) {
        if(palavra.equals(resposta)){
            mPontos += 10;
            mQtdPalavras++;
            mPalavraVez = mPalavras.getNext();
            return "Voce ACERTOU e agora esta com. " + (mPontos)+" pontos. Faltam " + (mResta -mQtdPalavras) + " palavras.";
        }else{
            mPontos -= 5;
            mQtdPalavras++;
            return "Voce ERROU e agora esta com. " + (mPontos)+" pontos. Faltam " + (mResta - mQtdPalavras) + " palavras. Tente novamente:";
        }
    }

    @Override
    public String getResultadoFinal() {
        
        String result = "Fim de Jogo. Total de pontos: " + mPontos;
        
        return result;
    }
    
}

