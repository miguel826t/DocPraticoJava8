package testesUnitariosJUnit;

import org.junit.Assert;
import org.junit.Test;

public class AssertTest {
	
	@Test
	public void test() {
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
		Assert.assertEquals(1, 2);
		Assert.assertEquals(Math.PI, 3.14, 0.01 ); // Quando é Double temos que colocar a qtd de casas para comparacao
	
		Assert.assertSame(getClass(), getClass()); // Para comparar se os 2 objs são da mesma instancia
		
	}
	
	
	
	
}
