package tp.model.agents;

import java.awt.Point;

import tp.model.comportements.Hebergeur;

public class Abeille extends Animal implements Hebergeur{
	/* Classe modelisant une abeille
	 * @author Tancrede Lici
	 */
	
	private Animal parasite;
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
		if (a instanceof Varroa) 
			return true;
		return false;
	}

	@Override
	public boolean accueillir(Animal a) {
		if (this.parasite==a) return true;
		return false;
	}

}
