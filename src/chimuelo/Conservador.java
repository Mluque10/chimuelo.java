package chimuelo;

public class Conservador extends Vikingo{
	 
	
	
	public Conservador(int empatia, int edad, int peso, String tipo) {
		super(empatia, edad, peso, tipo);
	}

	public int empatia() {
		return 0;
	}
	
	public int capacidadMontar () {
		return 100 - getEdad() - getPeso();
		}
	
	public boolean puedeMontar () {
		if (capacidadMontar() >= 70) {
			return true;
		}else {
			return false;
		}
	}
}
