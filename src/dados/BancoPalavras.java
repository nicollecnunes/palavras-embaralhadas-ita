
package dados;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BancoPalavras {
    
    private Leitor mDados = new Leitor();
    private List<String> mListPalavras = new ArrayList<>();
    
    public String getNext(){
        try {
            mListPalavras = mDados.getPalavraArquivo();
        } catch (IOException ex) {
            Logger.getLogger(BancoPalavras.class.getName()).log(Level.SEVERE, null, ex);
        }
        Random random = new Random(System.currentTimeMillis());
        int referencia = random.nextInt();
        int indice = referencia % (mListPalavras.size());
        
        return  mListPalavras.get(Math.abs(indice));
    }
    
    public int getTamanho(){
        return mListPalavras.size();
    }
    
}
