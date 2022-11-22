package tp.model.agents;

import java.awt.Point;

public class Agent {

	private static int currentId = 0;
	/** identifiant unique de l'animal*/
	protected int id;
	/** age en unité de temps*/
	protected int age;
	/** position sur la carte*/
	protected Point coord;
	/** état de santé de l'animal */
	protected Etat etat = Etat.Normal;
	/*
	 * @return un identifiant entier unique d'animal
	 */
	protected static int getUniqueId() { 
		return currentId++;
	}

	/*
	 * @return L'id de l'animal
	 * @author tancrede.lici
	 */
	public int getId() {
		return id;
	}

	public Etat getEtat() {
		return etat;
	}

	public Point getCoord() {
		return coord;
	}

	public int getAge() {
		return age;
	}

	public void vieillir() {
		//Fait vieillir l'animal d'une unité de temps
		age += 1;
	}

	public Agent() {
		super();
	}

}