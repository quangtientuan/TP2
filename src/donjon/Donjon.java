package donjon;
import java.util.Random;
import donjon.Configuration;
import physique.Direction;
import physique.Position;
import donjon.Case;

public class Donjon {
	// ***
	// * Variables membres.
	private Case caseDepart;
	private Case caseFin;
	private Case[][] tabCase;
	private Random rand = new Random();
	private Configuration config;
	
	
	// ************************************************************************
	// * Les constructeurs.
	// ************************************************************************
	public Donjon() {
		config = Configuration.getInstance();
		// Vérifier.
		tabCase = new Case[10][10];
		// TODO :
		caseDepart = getCaseAlea();
	}

	// ************************************************************************
	// * Getters/Setters.
	// ************************************************************************

	public Case getCaseDepart() {
		return caseDepart;
	}

	public void setCaseDepart(Case caseDepart) {
		this.caseDepart = caseDepart;
	}


	public Case getCaseFin() {
		return caseFin;
	}


	public void setCaseFin(Case caseFin) {
		this.caseFin = caseFin;
	}

	public Case[][] getCases() {
		return tabCase;
	}

	public void setTabCase(Case[][] tabCase) {
		this.tabCase = tabCase;
	}

	// ***
	// * Retourne une position choisie aléatoirement du donjon.

	public Position getPositionAlea() {
		Case caseRand = getCaseAlea();
		Position posRand = caseRand.copiePosition();
		return posRand; 
	}
	
	// ************************************************************************
	// * Retourne le nombre de cases voisins non-développée.
	// ************************************************************************
	// * Paramètre entrée : la position courante.
	public int getNbVoisinsNonDeveloppe(Position posCourant) {
		int cptVoisinNonDeveloppe = 0;
		for (int i = Direction.HAUT; i < Direction.DROITE; i++) {
			
			
		}
		return cptVoisinNonDeveloppe;
		
	}
	

	// ***
	// * Retourne une case choisie aléatoirement du donjon.
	public Case getCaseAlea() {
		int iRand = rand.nextInt(0,11);
		int jRand = rand.nextInt(0,11);
		return tabCase[iRand][jRand];
	}
}
