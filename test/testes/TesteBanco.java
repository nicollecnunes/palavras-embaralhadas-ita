
package testes;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dados.BancoPalavras;
import dados.Leitor;


import org.junit.Test;

public class TesteBanco {
        
        @Test
    public void tesLerDados() {
        List<String> list = new ArrayList<String>();
        Leitor dados = new Leitor();
        try {
            list = dados.getPalavraArquivo();
        } catch (IOException ex) {
            
        }
        assertEquals("PROCESSADOR", list.get(1));
    }
	
	@Test
    public void testGetTamanho() {
		BancoPalavras mPalavras = new BancoPalavras();
        mPalavras.getNext();
        assertEquals(34, mPalavras.getTamanho());
    }
    
}
