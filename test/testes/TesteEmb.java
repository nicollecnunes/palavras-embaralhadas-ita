

package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import embaralhar.PalavraInvertida;
import embaralhar.PalavraTrocaParImpar;

public class TesteEmb {
    
    @Test
	    public void tesInversor() {
	        PalavraInvertida palavras = new PalavraInvertida();
	        String resultado = palavras.embaralhar("TEST");
	        assertEquals("TSET", resultado);
	    }
	    
	    @Test
	    public void tesTrocaParImpar() {
	        PalavraTrocaParImpar palavras = new PalavraTrocaParImpar();
	        String resultado = palavras.embaralhar("TEST");
	        assertEquals("ETTS", resultado);
	    }
    
}
