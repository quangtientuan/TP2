package donjon;

import physique.Position;
import physique.Direction;

public class Case {
	
	// ***
	// * Variables membres.

	// La position de la case.
	private Position position = new Position(0, 0);
	
	private boolean decouvertParHero;
	private boolean finDeNiveau;
	private boolean devParLabyrinthe;
	private Case[] caseVoisin = new Case[4];
	
	// ************************************************************************
	// * Les constructeurs.
	// ************************************************************************
	public Case(Position pos) {
		if ( pos != null ) {
			this.position = pos;
			this.decouvertParHero = false;
			this.finDeNiveau = false;
			this.devParLabyrinthe = false;
		}
	}

	// ************************************************************************
	// * Retourne une copie de la position.

	public Position copiePosition() {
		Position copie = new Position(this.position);
		return copie;
	}
	

	
	// ************************************************************************
	// * Getters/Setters.
	// ************************************************************************

	// direction : [0..3]
	// 
	public void setVoisin (int direction, Case caseVoisin ) {
		if ((direction >= Direction.HAUT ) && (direction <= Direction.DROITE))
			this.caseVoisin[direction] = caseVoisin;
	}
	
	// ***
	// * Le tableau caseVoisin doit être remplir.
	public Case getVoisin(int direction) {
		Case caseReturn = null;
		if (this.caseVoisin != null) {
		if ((direction >= Direction.HAUT ) && (direction <= Direction.DROITE))
			caseReturn = this.caseVoisin[direction];
		}
		return caseReturn;
	}
	
	public boolean getDecouverte() {
		return decouvertParHero;
	}

	public void setDecouverte(boolean decouvertParHero) {
		this.decouvertParHero = decouvertParHero;
	}

	public boolean getFin() {
		return finDeNiveau;
	}

	public void setFin(boolean finDeNiveau) {
		this.finDeNiveau = finDeNiveau;
	}

	public boolean getDeveloppeLabyrinthe() {
		return devParLabyrinthe;
	}

	public void setDeveloppeLabyrinthe(boolean devParLabyrinthe) {
		this.devParLabyrinthe = devParLabyrinthe;
	}
	
	public Position getPos() {
		return this.position;
	}
}
