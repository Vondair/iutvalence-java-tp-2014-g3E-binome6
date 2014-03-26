package fr.iutval.puissance4.tpjava;

import java.util.Scanner;

/**
 * Jeu Puissance 4.
 * 
 * @author Antoine C, Marine C.
 * @version 1.0
 */
public class Puissance4 {
	/** Nombre de lignes. */
	public static final int NB_LIGNES = 6;
	/** Nombre de colonnes. */
	public static final int NB_COLONNES = 7;

    /** Premier joueur. */
	private final Joueur joueur1;

    /** Second joueur. */
    private final Joueur joueur2;

    /** Joueur courant. */
    private Joueur joueurCourant;

    /** Grille de jeu. */
    private final Pion[][] grille;
   
    /** Constructeur initialisant une grille vide et retenant le nom des joueurs. */
    public Puissance4(String joueur1, String joueur2) {
        this.grille = new Pion[Puissance4.NB_LIGNES][Puissance4.NB_COLONNES];
        for (int i = 0; i < Puissance4.NB_LIGNES; i++) {
            for (int j = 0; j < Puissance4.NB_COLONNES; j++) {
                this.grille[i][j] = Pion.CASE_VIDE;
            }
        }

        this.joueur1 = new Joueur(joueur1, Pion.PION_J1);
		this.joueur2 = new Joueur(joueur2, Pion.PION_J2);
		this.joueurCourant = this.joueur1;
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

    /**
     * Inserer un pion dans la grille.
     *
     * @return boolean.
     */
	public boolean insérerPion(int colonneChoisie) {
		for (int j = Puissance4.NB_LIGNES - 1; j >= 0; j--) {
			if (grille[j][colonneChoisie] == Pion.CASE_VIDE) {
				grille[j][colonneChoisie] = joueurCourant.obtenirPion();
				return true;
			}
/**
 * Méthode qui permet de déterminer si la case est vide ou occupée. Dans le cas où la case est occupée, on cherche quel joueur a posé son pion et on le renvoie.            
 */
			//Cas pour lequel la colonne est déjà remplie, mettre un pion supplémentaire est donc impossible.
			if (j == 0) {
				return false;
			}
		}
		return false;
	}
	
	/** Changement de joueur. */
	public void joueurSuivant() {
        joueurCourant = joueurCourant.equals(joueur1) ? joueur2 : joueur1;
	}
	
	/** Victoire en colonne.*/
	public boolean estVictoireEnColonne(int colonneChoisie) {
		for (int i=0; i < NB_LIGNES; i++) {
			if (this.grille[i][colonneChoisie] == joueurCourant.pion) {
				return true;
			}
		return false;
		}
		return false;
			
	}
	
	
	
	
	

    /** Lancer le jeu. */
    public void jouer() {
        this.afficher();
        while (true) {
            Scanner sc = new Scanner(System.in);
            int colonneChoisie = sc.nextInt();
            if ((colonneChoisie > 0) && (colonneChoisie <= 7)) {
                if (this.insérerPion(colonneChoisie - 1)) {
                    // TODO Vérification de victoire : nécessitera certainement (pour être plus propre) de passer la grille dans une classe dédiée.
                    joueurSuivant();
                }
                else {
                    System.err.println("Colonne pleine");
                }
            }
            else {
                System.err.println("Valeur incorrecte.");
            }
            this.afficher();
        }
    }
}
