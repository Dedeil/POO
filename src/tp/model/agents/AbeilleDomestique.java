package tp.model.agents;

import java.awt.Point;

public class AbeilleDomestique extends Abeille{
	/* Classe modelisant un abeille domestique
	 * @author Tancrede Lici
	 */
	public AbeilleDomestique(Sexe sexe, Point coord) {
		super(sexe, coord);
	}

	public AbeilleDomestique(Sexe sexe) {
		super(sexe);
	}

	public AbeilleDomestique() {
		super();
	}
	
}
