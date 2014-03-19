package fr.iutval.puissance4.tpjava;

import java.util.Scanner;

/**
 * Jeu Puissance 4.
 * 
 * @author Antoine C, Marine C.
 * @version 1.0
 */
public class Puissance4 {
	/** Nombre de lignes */
	public static final int NB_LIGNES = 6;
	/** Nombre de colonnes */
	public static final int NB_COLONNES = 7;

    /** Premier joueur. */
	private final Joueur J1;

    /** Second joueur. */
	private final Joueur J2;

    /** Joueur courant. */
	private final Joueur joueurCourant;

    /** Représente la grille de jeu. */
	private final Pion[][] grille;


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
	public boolean insérerPion(int colonneChoisie) {
		for (int j = Puissance4.NB_LIGNES - 1; j >= 0; j--) {
			if (grille[j][colonneChoisie] == Pion.CASE_VIDE) {
				grille[j][colonneChoisie] = this.joueurCourant.obtenirPion();
				return true;
			}
			if (j == 0) {
				return false;
			}
		}
		return false;
	}
	
	/** Lancer le jeu. */
	public void jouer() {
		int colonneChoisie;
		this.afficher();
		while (true) {
			Scanner sc = new Scanner(System.in);
		colonneChoisie=sc.nextInt();
		if ((colonneChoisie > 0) && (colonneChoisie <= 7)) {
            if (!this.insérerPion(colonneChoisie-1)) {
            	System.err.println("Colonne pleine");
            }
            else {
            	// XXX Vérification de victoire
            	// XXX Changement de joueur
            }
            
        }
        else {
            System.out.println("Valeur incorrecte.");
        }
		this.afficher();
		}
	}
}
