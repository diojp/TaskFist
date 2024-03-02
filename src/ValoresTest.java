

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ValoresTest {
	
	private Valores valores;
	
	@Before
	public void setUp() {
		valores = new Valores()
;	}
	@Test
	public void testarInserir() {
		assertTrue(valores.ins(5));		
		assertTrue(valores.ins(10));
		assertFalse(valores.ins(-1));
//		assertTrue(valores.ins(30));
//		assertTrue(valores.ins(30));
//		assertTrue(valores.ins(30));
//		assertTrue(valores.ins(30));
//		assertTrue(valores.ins(30));
//		assertTrue(valores.ins(30));
//		assertTrue(valores.ins(30));
//		assertFalse(valores.ins(30));
	}
	
	@Test
	public void testarDeletar() {
		valores.ins(5);
		valores.ins(10);
		valores.ins(15);
		valores.ins(20);
		assertEquals(5, valores.del(0));
		assertEquals(10, valores.del(1));
		assertEquals(15, valores.del(2));
		assertEquals(20, valores.del(3));
		
		assertEquals(-1, valores.del(-1));
		assertEquals(-1, valores.del(5));
		assertEquals(-1, valores.del(10));
		
	}
	
	@Test
	public void testarSize() {
		assertEquals(0, valores.size());
		
		valores.ins(5);		
		assertEquals(1, valores.size());
		
		valores.ins(10);		
		assertEquals(2, valores.size());
		
		valores.ins(15);
		assertEquals(3, valores.size());
		
		valores.ins(20);		
		assertEquals(4, valores.size());
		
		valores.ins(0);		
		assertEquals(4, valores.size());
		
		
	}
	
	
	
	
	

}
