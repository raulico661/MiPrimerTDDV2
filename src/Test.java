import org.junit.Assert;

public class Test {
	
	@org.junit.Test
	public void test_crear_coche() {
		Coche nuevoCoche = new Coche();
		Assert.assertEquals(0, nuevoCoche.velocidad);
	}
	
	@org.junit.Test
	public void test_acelerar_un_coche_su_velocidad_aumenta() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.acelerar(30);
		Assert.assertEquals(30, nuevoCoche.velocidad);
	}
	
	@org.junit.Test
	public void test_decelerar_un_coche_su_velocidad_disminuye() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.velocidad = 50;
		nuevoCoche.decelerar(20);
		Assert.assertEquals(30, nuevoCoche.velocidad);
	}
	
	

}
