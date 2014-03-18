/* TODO Package. */

/**
 * Implémentation d'un joueur lui associant un nom et un pion.
 * 
 * @author Antoine C, Marine C.
 * @version TODO
 */
public class Joueur {
	/** Nom du joueur. */
	public final String nom;

	/** Pion du joueur. */
	public final Pion pion;

	public Joueur(String nom, Pion pionJ1) {
		this.nom = nom;
		this.pion = pionJ1;
	}

	public Pion obtenirPion() {
		return this.pion;
	}
}
