package pile;

public class PileSChainee {
	Noeud sommet;
	int nbElements;

	// ***
	// * Les constructeurs.
	
	public PileSChainee() {
		this.sommet = null;
		this.nbElements = 0;
	}
	
	// ***
	// * Empiler un élément dans la pile.
	public void empiler(Object obj) {
		Noeud nouveau = new Noeud(sommet,obj); 
		this.sommet = nouveau;
		this.nbElements++;
	}

	// ***
	// * Dépiler un élément de la pile.
	public Object depiler() {
		Object elemRetire = null;
		if (this.sommet != null ) {
			// Récupère les données du noeud sommet.
			Noeud temp = this.sommet;
			elemRetire = temp.donnee;
			// On pointe le sommet au élément suivant.
			if (temp.suivant != null ) {
				this.sommet = temp.suivant;
				this.nbElements--;
				temp.suivant = null;
			}
		}
		return elemRetire;
	}
	
	// ***
	// * Retourne une référence sur le prochaine élément de la pile.
	public Object regarder (Noeud noeudCourant) {
		Object objRetourne = null;
		if ( (noeudCourant != null) && (noeudCourant.suivant != null) )
			objRetourne = noeudCourant.suivant.donnee;
		return objRetourne;
	}
	
	
	// ***
	// * Vérifie si la pile est vide.
	public boolean estVide() {
		return ( (this.nbElements == 0) || (this.sommet == null) );
	}
	// ***
	//  Classe noeud, réprésente un noeau de la liste.

	public class Noeud {
		public Object donnee;
		public Noeud suivant;
		
		// ***
		// * Les constructeurs.
		private Noeud(Noeud next, Object data) {
			this.donnee		= data;
			this.suivant 	= next;
		}
	}
}
