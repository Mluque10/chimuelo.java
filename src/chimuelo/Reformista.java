package chimuelo;

public class Reformista extends Vikingo {
	
	private int tibieza;
	
	public Reformista(int empatia, int edad, int peso,int tibieza, String tipo) {
		super(empatia, edad, peso, tipo);
		this.tibieza = tibieza;
	}

		public int empatia () {
			return  tibieza / 2;
		}
	
		
	public int capacidadMontar () {
		return  100 - getEdad() - getPeso();
		}
	
	public boolean puedeMontar () {
		if (capacidadMontar() >= 70) {
			return true;
		}else {
			return false;
		}
	}
	public int getTibieza() {
		return tibieza;
	}

	public void setTibieza(int tibieza) {
		this.tibieza = tibieza;
	}
}
