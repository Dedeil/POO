package model.decor;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

import model.agents.Animal;
import model.agents.animaux.AbeilleDomestique;
import model.agents.animaux.FrelonAsiatique;
import model.agents.animaux.FrelonEuropeen;
import model.comportements.Hebergeur;

public class Ruche extends Decor implements Hebergeur{
	
	// Set des abeilles de la ruche 
	private Set<Animal> population = new HashSet<Animal>();
	// Set des animaux acceptables dans la ruche
	private Set<Class<? extends Animal>> acceptable = new HashSet<Class<? extends Animal>>();
	// Constante taille maximale de la ruche
	private static int populationMax = 1000;
	
	public Ruche(Point p) { 
		super(p);
		this.acceptable.add(AbeilleDomestique.class);
		//this.acceptable.add(FrelonAsiatique.class);
		//this.acceptable.add(FrelonEuropeen.class);
	}

	@Override
	public boolean peutAccueillir(Animal a) {
		//TODO: Penser a mettre en private
		if (this.acceptable.contains(a.getClass()) && this.population.size() < populationMax) {
			System.out.println("Peut etre accueuillit");
			return true;
		}
		System.out.println("Ne peut etre accueuillit");
		return false;
	}

	@Override
	public boolean accueillir(Animal a) {
		if(peutAccueillir(a)) {
			/* 
			 * Ne pas faire ca ici: c'est a l'animal de mettre a jour ses attributs
			 * a.setHebergeur(this);
			 */
			this.population.add(a);
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		String ret ="Ruche (" + this.getCoord().getX() + ", " + this.getCoord().getY() + ") population: "
					+ Integer.toString(this.population.size()) + " abeilles" ;
		for (int i = 0; i < this.population.size(); i++)
			ret += "*" + this.population;
		return ret;
	}
	
	public static void main(String[] a) {
		/*
		Ruche r = new Ruche(new Point(0,0));
		new AbeilleDomestique(Sexe.Assexue, new Point(10,20),r);
		System.out.println(r);
		new AbeilleDomestique(Sexe.Assexue, new Point(10,20),r);
		System.out.println(r);
		new AbeilleDomestique(Sexe.Femelle, new Point(5,10),r);
		System.out.println(r);
		*/
	}
}
