package tp.model.agents;

import java.awt.Point;

public class AbeilleSolitaire extends Abeille{
	/* Classe modelisant un abeille solitaire
	 * @author Tancrede Lici
	 */
	public AbeilleSolitaire(Sexe sexe, Point coord) {
		super(sexe, coord);
	}

	public AbeilleSolitaire(Sexe sexe) {
		super(sexe);
	}

	public AbeilleSolitaire() {
		super();
	}

}
