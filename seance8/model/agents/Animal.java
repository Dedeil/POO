package model.agents;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
//pour l'exemple detaille de aggraverEtat
import java.util.List;
import java.util.ListIterator;

import model.comportements.Deplacable;
import model.comportements.Hebergeur;

/**
 * Cette classe modelise un Animal dans la simulation
 * @author bruno
 *
 */
/* 
 * abstract a  partir du TP2 + deplacement des methodes/attributs du TP1 concernant les agents dans la classe agent:
 * attributs de classe 
	private static int currentId = 0;
	
	attributs d'instance:
	private int id;
	protected int age;
	protected PointPositif coord; //question subsdiaire du tp2 + solution presentee au cours 4
	//protected Point coord;
	 
	methodes:
	public Agent(Point coord)
	public Agent()
	
	equals, hascode,tostring (sans le sexe)
	getCoord, setAge, vieillir
	
	getUniqueId
	
	Attention: rencontrer(Agent a) devient abstrait 
 */
public abstract class Animal extends Agent implements Deplacable {
	/*
	 * SeDeplacer: soit abstract, soit encore mieux faire une interface Deplacable
	 */
	
	/** etat de sante de l'animal */
	private Etat etat=Etat.Normal;
	/** sexe de l'animal */
	private Sexe sexe;
	/** hebergeur de l'animal */
	protected Hebergeur hebergeur;
	
	/* 
	 * constructeurs 
	 */
	public Animal(Sexe sexe, Point p) {
		super(p);
		this.sexe=sexe;
	}
	
	public Animal(Sexe sexe) {
		this(sexe,new Point(0,0));
		//TODO
		/* cree un animal avec le sexe passe en parama¨tre, a  la position (0;0), d'a¢ge 0 et lui attribue un id unique
		 * une bonne mania¨re de faire 
		 * en utilisant ce qui existe deja , une moins bonne
		 */
	}
	
	public Animal() {
		this(Sexe.Femelle);
		//TODO
		/* cree un animal de sexe femelle, a  la position (0;0), d'a¢ge 0 et lui attribue un id unique
		 * une bonne mania¨re de faire 
		 * en utilisant ce qui existe deja , une moins bonne
		 */
	}
	
	/*
	 *  Accesseurs et mutateurs
	 */
	public Sexe getSexe() {
		return sexe;
	}
	
	public Etat getNiveauSante() {return etat;}
	/**
	 * protected, car seul l'animal doit pouvoir changer son niveau de sante
	 * @return
	 */
	protected void setNiveauSante(Etat e) {etat = e;}

	public String toString() {
		//bien penser a  reutiliser l'existant de Agent avec le super.toString()
		/*
		 * (non-Javadoc)
		 * @see complet.model.agents.Agent#toString()
		 */
		return super.toString()+", "+sexe;
	}
	
	/* 
	 * comportements d'instance
	 */
	/*
	 * (non-Javadoc)
	 * @see complet.model.comportements.Deplacable#seDeplacer()
	 */
	/**
	 * deplacement aleatoire avec -1<=dx<=1 et  -1<=dy<=1
	 * @see model.comportements.Deplacable#seDeplacer()
	 */
	public void seDeplacer() {
		int aleaX = (int)(Math.random()*3)-1;
		int aleaY = (int)(Math.random()*3)-1;
		this.setCoord((int)(coord.getX()+aleaX),(int)(coord.getY()+aleaY));
	}
	
	/**
	 * condition d'installation d'un animal dans un hebergeur
	 * @param h
	 * @return
	 */
	protected final boolean sInstaller(Hebergeur h) {
		boolean ret=false;
		if(h!= null && h.accueillir(this)) {
			hebergeur = h;
			ret=true;
		}
		return ret;
	}
	
	public final void aggraverEtat() {
		/* detail sur plusieurs lignes de:
		 * 	LinkedList<Etat> liste = new LinkedList<Etat>(Arrays.asList(Etat.values()));

		Etat[] tableauEtat = Etat.values();
		List<Etat> listeEtat = Arrays.asList(tableauEtat);
		LinkedList<Etat> liste = new LinkedList<Etat>(listeEtat);
		*/
		LinkedList<Etat> liste = new LinkedList<Etat>(Arrays.asList(Etat.values()));
		// ArrayList<Etat> liste = new ArrayList<Etat>(Arrays.asList(Etat.values()));
		/* detail de
		 * Iterator<Etat> it = liste.listIterator(liste.indexOf(etat));
		 
		int indexEtatActuel = liste.indexOf(this.etat); (inutile avec l'algo suivant)
		Iterator<Etat> it = liste.listIterator();
		boolean trouve = false;
		while(it.hasNext() && !trouve) {
			if(it.next().equals(this.etat)) {trouve=true;}
		}
		*/
		Iterator<Etat> it = liste.listIterator(liste.indexOf(etat));
		etat = it.next();
		if(it.hasNext())
			etat = it.next();
	}
	
	public final void ameliorerEtat() {
		LinkedList<Etat> liste = new LinkedList<Etat>(Arrays.asList(Etat.values()));
		ListIterator<Etat> it = liste.listIterator(liste.indexOf(etat));
		if(it.hasPrevious())
			etat = it.previous();
	}


}
