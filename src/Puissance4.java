import java.util.Scanner;

/**
 * Classe définissant le jeu puissance 4.
 * 
 * @author Antoine C, Marine C.
 *
 */

public class Puissance4 {
	/** Joueur1. */
	public Joueur J1;

	/** Joueur2. */
	public Joueur J2;

	/** Joueur courant. */
	public Joueur joueurCourant;


	/** Représente la grille de jeu. */
	public Pion[][] grille;

	/** Nombre de lignes */
	public static final int NB_LIGNES = 6;

	/** Nombre de colonnes */
	public static final int NB_COLONNES = 7;
	
	/** Colonne choisie par l'utilisateur. */
	public int résultat;
	
	/**
	 * Constructeur initialisant une grille vide et retenant le nom des joueurs.
	 */
	public Puissance4(String joueur1, String joueur2) {
		this.grille = new Pion[NB_LIGNES][NB_COLONNES];
		for (int i = 0; i < NB_LIGNES; i++) 
			for (int j = 0; j < NB_COLONNES; j++)
				this.grille[i][j] = Pion.CASE_VIDE;
		this.J1 = new Joueur(joueur1, Pion.PION_J1);
		this.J2 = new Joueur(joueur2, Pion.PION_J2);
		this.joueurCourant = this.J1;
	}

	/** Méthode permettant d'afficher l'état des cases de la grille. */
	public void afficher() {
		System.out.println("========");
		for (int i = 0; i < NB_LIGNES; i++) {
			System.out.print("|");
			for (int j = 0; j < NB_COLONNES; j++)
				System.out.print(grille[i][j]);
			System.out.println("|");
		}
		System.out.println("========");

	}

    /** Méthode permettant l'insertion d'un pion dans la grille */
	public void insérerPion(int colonne) {
		int i = colonne;
		int j;
		for (j = NB_LIGNES - 1; j >= 0; j--) {
			if (grille[i][j] == Pion.CASE_VIDE) {
				grille[i][j] = this.joueurCourant.obtenirPion();
				break;
			}
		}
	}
	
	/** Méthode permettant de lancer le jeu */
	public void jouer() {
		this.afficher();
		Scanner sc = new Scanner(System.in);
		résultat=sc.nextInt();
		if ((résultat >= 0) && (résultat <= 6))
			this.insérerPion(résultat);
		else System.out.println("Valeur incorrecte.");
		this.afficher();
	}
}
