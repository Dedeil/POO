package tp.model.agents;

import java.awt.Point;

public class Varroa extends Animal{
	/* Classe modelisant un Varroa Destructor
	 * @author Tancrede Lici
	 */
	public Varroa(Sexe sexe, Point coord) {
		super(sexe, coord);
	}
	
	public Varroa(Sexe sexe) {
		super(sexe);
	}

	public Varroa() {
		super();
	}
	
	@Override
	public void seDeplacer() {
		if (this.hebergeur == null) {
			super.seDeplacer();
		}
		else {
			this.coord = this.hebergeur.getCoord();	
		}
	}

	public void rencontrer(Agent a) {
		if (a instanceof Abeille) {
			this.setHebergeur(a);
			Abeille abeille = (Abeille) a;
			abeille.accueillir(this);
		}
	}
}
