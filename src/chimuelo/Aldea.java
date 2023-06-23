package chimuelo;

import java.util.ArrayList;


public class Aldea {
	
	private int empatiaTotal;
	
	private ArrayList<Vikingo> aldea = new ArrayList<>();{
		aldea.add(new Vikingo(0,20,25, "Conservador"));
		aldea.add(new Vikingo(100,20,25, "Subversivo"));
		aldea.add(new Vikingo(0,20,25, "Conservador"));
		aldea.add(new Vikingo(15,20,25, "Subversivo"));
	}
	
	ArrayList<Vikingo> vikingos = new ArrayList<Vikingo>();
	
	public int empatiaTotal () {
		 for (Vikingo v : vikingos) {
	            empatiaTotal += v.getEmpatia();
	        }
	        return empatiaTotal;
		
	}
	
	public int cantidadvikingos() {
		return vikingos.size();
	}
	
	
}
