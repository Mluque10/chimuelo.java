package chimuelo;

public class Vikingo {
	
	private int empatia;
	private  int edad; 
	private int peso;
	private String tipo;
	
	public Vikingo(int empatia,int edad, int peso, String tipo) {
		this.empatia = empatia;
		this.edad = edad;
		this.peso = peso;
		this.tipo = tipo;
	}
	

	public int empatia() {
		return 0;
	}
	
	public int capacidadMontar () {
		return 0;
	}

	
	public boolean puedeMontar () {
		return capacidadMontar() > 70;
		
	}
	
	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getEmpatia() {
		return empatia;
	}
	public void setEmpatia(int empatia) {
		this.empatia = empatia;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
}
