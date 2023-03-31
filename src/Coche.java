
public class Coche {

	public int velocidad;

	public void acelerarRaulSempere(int aceleracion) {
		velocidad+=aceleracion;
		
	}

	public void decelerarRaulSempere(int deceleracion) {
		velocidad-=deceleracion;
		if(velocidad<0) velocidad=0;
	}

}
