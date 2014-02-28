/**
 * Classe définissant ce qu'est un joueur.
 * 
 * @author Antoine C, Marine C.
 *
 */

public class Joueur {
	/** Nom du joueur. */
	public final String nom;

	/** Pion du joueur. */
	public final int pion;

	public Joueur(String nom, int pion) {
		this.nom = nom;
		this.pion = pion;
	}

	public int obtenirPion() {
		return this.pion;
	}
}
