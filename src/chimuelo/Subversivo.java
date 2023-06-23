package chimuelo;

public class Subversivo extends Vikingo {
	
	
	
	public Subversivo(int empatia, int edad, int peso, String tipo) {
		super(empatia, edad, peso, tipo);
		
	}

	public int empatia() {
		return  100;
	}
	
	public int capacidadMontar () {
		return getEdad() * getPeso();
		}
	
	public boolean puedeMontar () {
		if (capacidadMontar() >= 70) {
			return true;
		}else {
			return false;
		}
			
		
	}
	
}
