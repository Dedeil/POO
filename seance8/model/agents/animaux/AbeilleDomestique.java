package model.agents.animaux;

import java.awt.Point;

import model.decor.Ruche;
import model.agents.Agent;
import model.agents.Sexe;

public class AbeilleDomestique extends Abeille {

	public AbeilleDomestique(Sexe s, Point p, Ruche r) {
		super(s, p);
		this.hebergeur = r;
	}

	@Override
	public int compareTo(Agent o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
