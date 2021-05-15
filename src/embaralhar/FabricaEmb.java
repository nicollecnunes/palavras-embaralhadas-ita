package embaralhar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class FabricaEmb {
    private static List<Embaralhar> mEmbaralhadores = new ArrayList<>();
    
    static{
        mEmbaralhadores.add(new PalavraTrocaParImpar());
        mEmbaralhadores.add(new PalavraInvertida());
    }
    
    public static Embaralhar getRandom(){
        Random random = new Random(System.currentTimeMillis());
        int referencia = random.nextInt();
        int indice = (referencia + 1) % mEmbaralhadores.size();
        
        return  mEmbaralhadores.get(Math.abs(indice));
    }
}
