import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Borsa;

public class BorsaTest {

	Borsa b= new Borsa();
	Attrezzo falce;
	Attrezzo sega;
	
	@Before
	public void setUp() {
		falce= new Attrezzo("falce", 2);
		sega= new Attrezzo("sega", 16);
	}
	
	@Test
	public void testAddAttezzoMinoreDiDieci() {
		assertTrue(b.addAttrezzo(falce));
	}
	
	@Test
	public void testAddAttrezzoPesoMaggioreDiDieci() {
		assertFalse(b.addAttrezzo(sega));
	}
	
	@Test
	public void testGetPeso() {
		b.addAttrezzo(falce);
		assertEquals(2, b.getPeso());
	}
}
