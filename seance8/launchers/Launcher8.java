package launchers;

import java.awt.Point;

import model.agents.Sexe;
import model.agents.animaux.AbeilleDomestique;
import model.decor.Ruche;
import model.world.Monde;

public class Launcher8 {

	public static void main(String[] args) {
		//Monde m = new Monde(50);
		//System.out.println(m);
		//m.cycle();
		//System.out.println(m);
		
		AbeilleDomestique a = new AbeilleDomestique(Sexe.Femelle, new Point(), new Ruche(new Point()));

		a.aggraverEtat();
		a.aggraverEtat();
		a.aggraverEtat();
		a.aggraverEtat();
		a.aggraverEtat();
		a.aggraverEtat();
		a.aggraverEtat();
		a.aggraverEtat();
		a.aggraverEtat();
		a.aggraverEtat();
		a.aggraverEtat();
		a.aggraverEtat();
		a.aggraverEtat();
		a.aggraverEtat();
		System.out.println(a.getNiveauSante());
		//a.ameliorerEtat();
		//System.out.println(a.getNiveauSante());
	}

}
