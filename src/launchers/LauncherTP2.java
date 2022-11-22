package launchers;

import java.awt.Point;

import tp.model.agents.Abeille;
import tp.model.agents.Agent;
import tp.model.agents.Animal;
import tp.model.agents.Arbre;
import tp.model.agents.Ruche;
import tp.model.agents.Sexe;


public class LauncherTP2 {
	
	public static void main(String [] args) {
		Animal a = new Animal(Sexe.Femelle, new Point(25,30));
		Animal b = new Abeille(Sexe.Male, new Point(23,12));

		System.out.println(b.getAge());
		b.vieillir();
		System.out.println(b.getAge());

		//System.out.println(a.getId());
		System.out.println(b.getId());
		
		System.out.println(b.getCoord());
		
		Agent arbre = new Arbre();
		Agent ruche = new Ruche();
		a.setHebergeur(arbre);
		b.setHebergeur(ruche);
	}

}
