package tp.model.agents;

public enum Etat {
	PleineForme, EnForme, Normal, EnDifficulte, EnDetresse, Mourant;
    
	// Fonction next tire de
	// https://stackoverflow.com/questions/17006239/whats-the-best-way-to-implement-next-and-previous-on-an-enum-type
    private static final Etat[] vals = values();
    
    public Etat next() {
        return vals[(this.ordinal() + 1) % vals.length];
    }
}
