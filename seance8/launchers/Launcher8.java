package launchers;

import java.awt.Point;

import model.agents.Sexe;
import model.agents.animaux.AbeilleDomestique;
import model.agents.animaux.FrelonAsiatique;
import model.agents.animaux.FrelonEuropeen;
import model.agents.animaux.Varroa;
import model.decor.Ruche;
import model.world.Monde;

public class Launcher8 {

	public static void main(String[] args) {
		Monde m = new Monde(50);
		System.out.println(m);
		//m.cycle();
		//System.out.println(m);
	
		int nbAbeilles = 5;
	
		Ruche ruche = new Ruche(new Point());
		Varroa varroa = new Varroa(Sexe.Femelle, new Point());
		FrelonAsiatique frelonasiatique = new FrelonAsiatique(Sexe.Male, new Point());
		FrelonEuropeen freloneuropeen = new FrelonEuropeen(Sexe.Femelle, new Point());

		for(int i=0;i<nbAbeilles;i++) {
			AbeilleDomestique abeille = new AbeilleDomestique(Sexe.Femelle, new Point(), ruche);
			//ruche.peutAccueillir(abeille);
			ruche.accueillir(abeille);
		}

		ruche.peutAccueillir(varroa);
		ruche.peutAccueillir(frelonasiatique);
		ruche.peutAccueillir(freloneuropeen);
		
		String trukaprint = ruche.toString();
		System.out.println(trukaprint);
	}
}
