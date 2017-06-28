import static org.junit.Assert.*;

import org.junit.Test;

import com.arquiteto.web.data.Data;


public class TesteData {

	@Test
	public void testAnoBissexto() {
		Data data = new Data(01,10,2000);
		assertTrue("Sucesso",data.anoBissesto());
	}
	
	@Test
	public void testAnoNaoBissexto() {
		Data data = new Data(01,10,2000);
		assertFalse("Sucesso",data.anoBissesto());
	}

}
