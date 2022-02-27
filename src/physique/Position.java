package physique;

public class Position {
	private int i,j;

	// ************************************************************************
	// * Les constructeurs.
	// ************************************************************************
	
	// Constructeur qui reçoit des valeurs i et j.
	public Position(int i, int j) {
		this.i = i;
		this.j = j;
	}

	// Constructeur de copie.
	public Position(Position refPosition) {
		// Est ce que c'est le même copie.
		// Même référence.
		if (this != refPosition ) {
			this.i = refPosition.i;
			this.j = refPosition.j;
		}
	}
	
	// ************************************************************************
	// * Accesseur.
	// ************************************************************************

	public int getI() {
		return this.i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return this.j;
	}

	public void setJ(int j) {
		this.j = j;
	}
	
	// ***
	// * Retourne un nouveau position avec l'information de l'objet courant.
	@Override
	public Position clone() {
		Position newPos = new Position(this.i, this.j);
		return newPos;
	}

	// ***
	// * Vérifie si 2 positions sont égaux.
	@Override
	public boolean equals(Object obj) {
		boolean estEgal = true;
		if (this != obj) {//les 2 objets sont en fait le même 
			if (obj == null) {
				estEgal =  false;
			}
			else {
				// Vérifie si l'objet est la même nature que Position.
				if (obj instanceof Position) {
					Position posCompare = (Position) obj;
					estEgal = (this.i == posCompare.i) && (this.j == posCompare.j);
				}
				else
					estEgal = false;
			}
		}
		return estEgal;
	}
	
	// ***
	// * Avance la position courante selon la position en paramètre.
	public void additionnerPos (Position pos) {
		if ( pos != null ) {
			this.i = this.i + pos.i;
			this.j = this.j + pos.j;
		}
	}

	// ***
	// * Recule la position courante selon la position en paramètre.
	public void soustrairePos (Position pos) {
		//if ( pos != null ) {
		try {
			this.i = this.i - pos.i;
			this.j = this.j - pos.j;
		}
		catch (NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
	}

	// ***
	// * Recule la position courante selon la position en paramètre.
	public void multiplierPos (double posI, double posJ) {
		this.i = (int) (this.i * posI);
		this.j = (int) (this.j * posJ);
	}
}
