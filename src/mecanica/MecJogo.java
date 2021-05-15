
package mecanica;

public interface MecJogo {
    public String getNome();

    public String getDescricao();

    public boolean isAcabou();

    public String getPalavra();

    public String tentativa(String palavra, String resposta);

    public String getResultadoFinal();

    
}
