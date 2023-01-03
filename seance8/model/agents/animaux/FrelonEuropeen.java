package model.agents.animaux;

import java.awt.Point;

import model.agents.Agent;
import model.agents.Sexe;

public class FrelonEuropeen extends Frelon {
	
	public FrelonEuropeen(Sexe s, Point p) {
		super(s, p);
		this.proies.add(FrelonAsiatique.class);
	}

	@Override
	public int compareTo(Agent o) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* inutile avec la liste de proies a partir des collections
	@Override
	public void rencontrer(Agent a) {
		//penser a reutiliser l'existant
		super.rencontrer(a);
		
		if(a instanceof FrelonAsiatique) {
			Animal b = (Animal)a;
			gestionProie(b);
		}

	}
	*/

}
