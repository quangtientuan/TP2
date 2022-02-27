package physique;
import java.util.Random;

// **
// * Cette classe contient seulement ses méthodes utilitaures.

public class Direction {
	// ***
	// * Définir les constantes.
	public static final int HAUT 	= 0;
	public static final int BAS 	= 1;
	public static final int GAUCHE	= 2;
	public static final int DROITE	= 3;
	
	// ***
	// * Variables membres.
	private static Random randomDirection = new Random();

	
	// ***
	// * Les méthodes de services.
	
	public static int directionOpposee( int direction ) {
		int directionOppose;
		switch (direction) {
			case Direction.HAUT:
				directionOppose = Direction.BAS;
			break;

			case Direction.BAS:
				directionOppose = Direction.HAUT;
			break;

			case Direction.GAUCHE:
				directionOppose = Direction.DROITE;
			break;
			
			case Direction.DROITE:
				directionOppose = Direction.GAUCHE;
			break;
			default:
				directionOppose = -1;
			break;
		}
		return directionOppose;
	}
	
	// ***
	// * Retourne la position absolue à une direction donnée.
	
	public static Position directionAPosition( int direction ) {
		Position pos = new Position(0,0);
		switch (direction) {
			case Direction.HAUT:
				pos.setI(-1);
				pos.setJ(0);
			break;

			case Direction.BAS:
				pos.setI(1);
				pos.setJ(0);
			break;

			case Direction.GAUCHE:
				pos.setI(0);
				pos.setJ(-1);
			break;
			
			case Direction.DROITE:
				pos.setI(0);
				pos.setJ(1);
			break;
		}
		return pos;
	}
	
	public static int positionADirection (Position pos) {
		int direction;
		if ( (pos.getI() == -1) && (pos.getJ() == 0) )
			direction = Direction.HAUT;
		else if ( (pos.getI() == 1) && (pos.getJ() == 0) )
			direction = Direction.BAS;
		else if ( (pos.getI() == 0) && (pos.getJ() == -1) )
			direction = Direction.GAUCHE;
		else if ( (pos.getI() == 0) && (pos.getJ() == 1) )
			direction = Direction.DROITE;
		else
			direction = -1;
		return direction;
	}
	
	// ***
	// * Retourne une direction aléatoire entre [ HAUT..DROITE] = [0..3].
	public static int obtenirDirAlea() {
		return randomDirection.nextInt(Direction.HAUT,Direction.DROITE+1);
	}
}
