import org.junit.Assert;

public class Test {
	
	@org.junit.Test
	public void test_crear_coche() {
		Coche nuevoCoche = new Coche();
		Assert.assertEquals(0, nuevoCoche.velocidad);
	}

}
