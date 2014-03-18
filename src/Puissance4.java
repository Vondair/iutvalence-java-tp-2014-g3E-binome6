/* TODO Package. */

import java.util.Scanner;

/**
 * Jeu Puissance 4.
 * 
 * @author Antoine C, Marine C.
 * @version TODO
 */
public class Puissance4 {
	/** Nombre de lignes */
	public static final int NB_LIGNES = 6;
	/** Nombre de colonnes */
	public static final int NB_COLONNES = 7;

	/* TODO Private ? Final ? */
    /** Premier joueur. */
	public Joueur J1;
	/* TODO Private ? Final ? */
    /** Second joueur. */
	public Joueur J2;
    /* TODO Private ? Final ? */
    /** Joueur courant. */
	public Joueur joueurCourant;
    /* TODO Private ? Final ? */
    /** Représente la grille de jeu. */
	public Pion[][] grille;
	/* TODO Ce n'est pas un attribut ! */
    /** Colonne choisie par l'utilisateur. */
	public int résultat;

	/** Constructeur initialisant une grille vide et retenant le nom des joueurs. */
	public Puissance4(String joueur1, String joueur2) {
		this.grille = new Pion[Puissance4.NB_LIGNES][Puissance4.NB_COLONNES];
		for (int i = 0; i < Puissance4.NB_LIGNES; i++) {
			for (int j = 0; j < Puissance4.NB_COLONNES; j++) {
				this.grille[i][j] = Pion.CASE_VIDE;
            }
        }
		this.J1 = new Joueur(joueur1, Pion.PION_J1);
		this.J2 = new Joueur(joueur2, Pion.PION_J2);
		this.joueurCourant = this.J1;
	}

	/** Afficher l'état des cases de la grille. */
	public void afficher() {
		System.out.println("========");
		for (int i = 0; i < Puissance4.NB_LIGNES; i++) {
			System.out.print("|");
			for (int j = 0; j < Puissance4.NB_COLONNES; j++) {
				System.out.print(grille[i][j]);
            }
			System.out.println("|");
		}
		System.out.println("========");
	}

    /** Inserer un pion dans la grille. */
	public void insérerPion(int colonne) {
		/* TODO Pourquoi ne pas utiliser directement le paramètre ? */
        int i = colonne;
		/* TODO Pourquoi déclarer la variable ici ? */
        int j;
		for (j = Puissance4.NB_LIGNES - 1; j >= 0; j--) {
			if (grille[i][j] == Pion.CASE_VIDE) {
				grille[i][j] = this.joueurCourant.obtenirPion();
				break;
			}
		}
	}
	
	/** Lancer le jeu. */
	public void jouer() {
		this.afficher();
		Scanner sc = new Scanner(System.in);
		résultat=sc.nextInt();
		if ((résultat >= 0) && (résultat <= 6)) {
            this.insérerPion(résultat);
        }
        else {
            System.out.println("Valeur incorrecte.");
        }
		this.afficher();
	}
}
