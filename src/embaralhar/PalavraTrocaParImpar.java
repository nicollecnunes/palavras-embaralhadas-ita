
package embaralhar;

public class PalavraTrocaParImpar implements Embaralhar{

    @Override
    public String embaralhar(String palavra) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < palavra.length(); i++){
            if(i % 2 != 0){
                builder.append(palavra.charAt(i));
                builder.append(palavra.charAt(i-1));
            }else if(i == palavra.length()){
                builder.append(palavra.charAt(i));
            }
        }
        //int l = palavra.length();
        if (palavra.length()%2 != 0){
            builder.append(palavra.charAt(palavra.length()-1));
        }
        return builder.toString();
        
    }
}
    

