package tp.model.agents;

import java.awt.Point;

/**
 * Cette classe modélise un Animal dans la simulation
 * @author bruno
 *
 */
public class Animal {
	/* attributs de classe */
	private static int currentId = 0;
	
	/* attributs d'instance*/
	/** identifiant unique de l'animal*/
	private int id;
	/** age en unité de temps*/
	private int age;
	/** position sur la carte*/
	private Point coord;
	/** état de santé de l'animal */
	private Etat etat=Etat.Normal;
	private Sexe sexe;
	
	/* 
	 * constructeurs 
	 */
	
	public Animal(Sexe sexe, Point coord) {
		age = 0;
		id = Animal.getUniqueId();
		this.sexe=sexe;
		//this.coord=coord;
		this.coord=new Point(coord);
	}
	
	public Animal(Sexe sexe) {
		/* crée un animal avec le sexe passé en paramètre, à la position (0;0), d'âge 0 et lui attribue un id unique
		 * une bonne manière de faire 
		 * en utilisant ce qui existe déjà, une moins bonne
		 */
		this(sexe, new Point());
	}
	
	public Animal() {
		/* crée un animal de sexe femelle, à la position (0;0), d'âge 0 et lui attribue un id unique
		 * une bonne manière de faire 
		 * en utilisant ce qui existe déjà, une moins bonne
		 */
		this(Sexe.Femelle);
	}
	
	/*
	 *  Accesseurs et mutateurs
	 */

	/**
	 * @return L'id de l'animal
	 * @author tancrede.lici
	 */
	public int getId() {
		return id;
	}

	public Etat getEtat() {
		return etat;
	}

	public Sexe getSexe() {
		return sexe;
	}

	public Point getCoord() {
		return coord;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		System.out.println(this.getClass().getName() + " n°" + Integer.toString(this.getId()) + "(" + this.getSexe() + ", (" + this.getCoord().x + ", " +this.getCoord().y +  ").");
		return "";
	}
	
	@Override
	public boolean equals(Object other) {
		
		Animal obj;
		if ( ! (other instanceof Animal) ) {
			return false;
		} // else {
		obj = (Animal) other;
		if (this.age == obj.getAge() && this.sexe == obj.getSexe() && this.etat == obj.getEtat()) {
			return true;
		}
		return false;
	}
	
	/*
	 * Redéfinitions de méthodes d'object
	 */
	//TODO
	

	/* 
	 * comportements d'instance
	 */
	
	

	public void seDeplacer() {
		//Utiliser Math.random() pour choisir une direction de déplacement
		int dx = (int) Math.round(2 * Math.random() - 1);
		int dy = (int) Math.round(2 * Math.random() - 1);
		coord.x += dx;
		coord.y += dy;
	}
	
	public void vieillir() {
		//Fait vieillir l'animal d'une unité de temps
		//une bonne manière de faire, une moins bonne.....
		age += 1;
	}
	
	public void rencontrer(Animal a) {
		//TODO
	}
	
	/* comportements de classe */ 
	/**
	 * Renvoie un identifiant unique non encore utilisé
	 * @return un identifiant entier unique d'animal
	 */
	private static int getUniqueId() { 
		return currentId++;
	}
	
	public static void main(String args[]) {
		//tests unitaires de la classe Animal
		//TODO décommentez les lignes pour approfondir le test unitaire
		//complétez la méthode pour tester les nouvelles fonctionnalités que vous allez implémenter
		Animal a = new Animal();
		Animal b = new Animal(Sexe.Male);
		//Animal c = new Animal(Sexe.Assexue);
		Animal d = new Animal(Sexe.Femelle,new Point(25,30));
		Animal e = new Animal(Sexe.Femelle,new Point(25,30));
		
		/*
		 * les lignes suivantes doivent afficher à terme: NomDeLaClasse n° id_animal(sexe, (position x; position y)).
		 * ex: 28 (FEMELLE, (25;30))
		 */
		System.out.println("*** Animaux créés: **********");
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
		System.out.println(d);
		
		System.out.println("*** Getters et setters **********");
		/*
		System.out.println(d.getSexe());
		Sexe ss = d.getSexe();
		ss=Sexe.Male;
		System.out.println(d.getSexe());
		
		//les lignes suivantes devraient afficher la même chose....
		
		System.out.println(d.getCoord());
		Point pt = d.getCoord();
		pt.x=50;
		System.out.println(d.getCoord());
		*/

		
		//TODO ajoutez vos propres tests de getters et setters
		
		//test vieillir
		a.vieillir();
		System.out.println(a.getAge());
		
		//test seDeplacer
		System.out.println(a.getCoord());
		a.seDeplacer();
		System.out.println(a.getCoord());
		
		//test id
		System.out.println(a.getId());
		System.out.println(b.getId());
		System.out.println(d.getId());
		
		/*
		 * Test comparaison
		 */

		System.out.println(d==e);
		System.out.println(d.equals(e));
		//System.out.println("Bonjour"=="Bonjour");
		//System.out.println("Bonjour".equals("Bonjour"));

	}

}
