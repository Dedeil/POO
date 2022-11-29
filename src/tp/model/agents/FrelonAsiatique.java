package tp.model.agents;

import java.awt.Point;

public class FrelonAsiatique extends Frelon{
	/* Classe modelisant un frelon asiatique
	 * @author Tancrede Lici
	 */
	public FrelonAsiatique(Sexe sexe, Point coord) {
		super(sexe, coord);
	}
	
	public FrelonAsiatique(Sexe sexe) {
		super(sexe);
	}

	public FrelonAsiatique() {
		super();
	}

	public void rencontrer(Agent a) {
		if (a instanceof FrelonEuropeen) {
			if (a.isFaim()) {
				this.etat = Etat.Mourant;
			}
			else {
				this.etat = Etat.EnDetresse;
			}
		}
	}
}
