import org.junit.Assert;

public class Test {
	
	@org.junit.Test
	public void test_crear_cocheRaulSempere() {
		Coche nuevoCoche = new Coche();
		Assert.assertEquals(0, nuevoCoche.velocidad);
	}
	
	@org.junit.Test
	public void test_acelerar_un_coche_su_velocidad_aumentaRaulSempere() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.acelerarRaulSempere(30);
		Assert.assertEquals(30, nuevoCoche.velocidad);
	}
	
	@org.junit.Test
	public void test_decelerar_un_coche_su_velocidad_disminuyeRaulSempere() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.velocidad = 50;
		nuevoCoche.decelerarRaulSempere(20);
		Assert.assertEquals(30, nuevoCoche.velocidad);
	}
	
	@org.junit.Test
	public void test_decelerar_un_coche_su_velocidad_no_puede_ser_ceroRaulSempere() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.velocidad = 50;
		nuevoCoche.decelerarRaulSempere(80);
		Assert.assertEquals(0, nuevoCoche.velocidad);
	}

}
