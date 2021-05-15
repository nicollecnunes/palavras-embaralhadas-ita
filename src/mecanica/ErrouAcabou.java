package mecanica;

import dados.BancoPalavras;

public class ErrouAcabou implements MecJogo{

    private boolean mErrou = false;
    private BancoPalavras mPalavras = new BancoPalavras();
    private int mPalavrasCertas = 0;
    
    @Override
    public String getNome() {
        return "Errou perdeu!";
    }

    @Override
    public String getDescricao() {
        return "Se você errar a palavra o jogo termina!";
    }

    @Override
    public boolean isAcabou() {
        return mErrou;
    }

    @Override
    public String getPalavra() {
        return mPalavras.getNext();
    }

    @Override
    public String tentativa(String palavra, String resposta) {
        if(palavra.equals(resposta)){
            mPalavrasCertas++;
            return "Voce acertou, parabens!";
        }else{
            mErrou = true;
            return "Errou acabou";
        }
    }

    @Override
    public String getResultadoFinal() {
        return "\n Fim de Jogo. Total de pontos: " + mPalavrasCertas;
    }
    
}
