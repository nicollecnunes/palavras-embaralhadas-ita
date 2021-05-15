package embaralhar;

public class PalavraInvertida implements Embaralhar{
    
    @Override
    public String embaralhar(String palavra) {
        StringBuilder builder = new StringBuilder();
        for(int i = palavra.length(); i > 0; i--){
            builder.append(palavra.charAt(i-1));
        }
        return builder.toString();
    }
}