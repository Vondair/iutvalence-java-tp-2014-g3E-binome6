package fr.iutval.puissance4.tpjava;

/**
 * "Launcher" du jeu.
 * 
 * @author Antoine C, Marine C.
 * @version 1.0.0
 */
public class Application {
	/** Méthode principale. */
	public static void main(String[] args) {
		Puissance4 P4 = new Puissance4("Tom", "Jerry");
		P4.jouer();
	}
}
