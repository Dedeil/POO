package tp.model.agents;

import java.awt.Point;

import tp.model.comportements.Hebergeur;

public class Abeille extends Animal implements Hebergeur{
	/* Classe modelisant une abeille
	 * @author Tancrede Lici
	 */
	
	private Animal parasite = null;
	private int qteMiel;
	private int qteMax;
	
	public Abeille(Sexe sexe, Point coord) {
		super(sexe, coord);
	}
	
	public Abeille(Sexe sexe) {
		super(sexe);
	}

	public Abeille() {
		super();
	}

	@Override
	public boolean peutAccueillir(Animal a) {
		/*if (a instanceof Varroa) 
			return true;
		return false;*/
		return a instanceof Varroa;
	}

	@Override
	public boolean accueillir(Animal a) {
		if (this.peutAccueillir(a) && this.parasite == null) {
			this.parasite = a;
			this.etat = this.etat.next();
			a.setHebergeur(this);
			return true;
		}
		return false;
	}
	
	public void rencontrer(Agent a) {
		//TODO Finir le 7.2 a partir du 3
		if (a instanceof Frelon) {
			if (a.isFaim()) {
				this.etat = Etat.Mourant;
			}
			else {
				this.etat = Etat.EnDetresse;
			}
		}
		else if (a instanceof Animal) {
			Animal animal = (Animal) a;
			this.accueillir(animal);
		}
	}
}
