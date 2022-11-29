package tp.model.agents;

import java.awt.Point;

/**
 * Cette classe modélise un Animal dans la simulation
 * @author bruno
 *
 */
public class Animal extends Agent{
	protected Agent hebergeur;
	protected Sexe sexe;
	
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

	public Sexe getSexe() {
		return sexe;
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

	public void seDeplacer() {
		//Utiliser Math.random() pour choisir une direction de déplacement
		int dx = (int) Math.round(2 * Math.random() - 1);
		int dy = (int) Math.round(2 * Math.random() - 1);
		coord.x += dx;
		coord.y += dy;
	}
	
	public void rencontrer(Animal a) {
		//TODO
	}
	
	public void setHebergeur(Agent a) {
		//TODO Supprimer cette fonction de test
		this.hebergeur = a;
	}

}
