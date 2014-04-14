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
        this.grille[0][3] = Pion.PION_J1;
        this.grille[1][4] = Pion.PION_J1;
        this.grille[2][5] = Pion.PION_J1;
        this.grille[3][6] = Pion.PION_J1;
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
	public int insérerPion(int colonneChoisie) {
		for (int j = Puissance4.NB_LIGNES - 1; j >= 0; j--) {
			if (grille[j][colonneChoisie] == Pion.CASE_VIDE) {
				grille[j][colonneChoisie] = joueurCourant.obtenirPion();
				return j;
			}
/**
 * Méthode qui permet de déterminer si la case est vide ou occupée. Dans le cas où la case est occupée, on cherche quel joueur a posé son pion et on le renvoie.            
 */
			//Cas pour lequel la colonne est déjà remplie, mettre un pion supplémentaire est donc impossible.
			if (j == 0) {
				return -1;
			}
		}
		return -1;
	}
	
	/** Changement de joueur. */
	public void joueurSuivant() {
        joueurCourant = joueurCourant.equals(joueur1) ? joueur2 : joueur1;
	}
	
	/** Victoire en colonne.*/
	private boolean estVictoireEnColonne(int colonneChoisie) {
		int casesConsecutives=0;
		for(int i = 0; i < NB_LIGNES; i++) {
			casesConsecutives = (this.grille[i][colonneChoisie] == joueurCourant.pion) ? casesConsecutives + 1 : 0;
			if (casesConsecutives==4) {
				return true;
			}
		}
		return false;
	}
	
	/** Victoire en ligne.*/
	private boolean estVictoireEnLigne(int ligneUtilisee) {
		int casesConsecutives=0;
		for(int i = 0; i < NB_COLONNES; i++) {
			casesConsecutives = (this.grille[ligneUtilisee][i] == joueurCourant.pion) ? casesConsecutives + 1 : 0;
			if (casesConsecutives==4) {
				return true;
			}
		}
		return false;
	}
	
	/** Victoire en diagonale.*/
	private boolean estVictoireEnDiagonale() {

		for (int j = 0; j < NB_LIGNES; j++) {
			int casesConsecutives = 0;
			for (int i = 0; i < NB_LIGNES-j; i++) {
				casesConsecutives = (this.grille[j+i][i] == joueurCourant.pion) ? casesConsecutives + 1 : 0;
				if (casesConsecutives==4) {
					return true;
				}
			}
		}
		
		for (int j = 0; j < NB_LIGNES; j++) {
			int casesConsecutives = 0;
			for (int i = 0; i < NB_LIGNES-j; i++) {
				//this.grille[i][i+j+1] = joueur2.pion;
				casesConsecutives = (this.grille[i][i+j+1] == joueurCourant.pion) ? casesConsecutives + 1 : 0;
				if (casesConsecutives==4) {
					return true;
				}
			}
		}
		
		for (int j = 0; j < NB_LIGNES; j++) {
			int casesConsecutives = 0;
			for (int i = 0; i < NB_LIGNES-j; i++) {
				casesConsecutives = (this.grille[(NB_LIGNES - 1) - (i)][i+j] == joueurCourant.pion) ? casesConsecutives + 1 : 0;
				if (casesConsecutives == 4) {
					return true;
				}
			}
		}
		
		for (int j = 0; j < NB_LIGNES; j++) {
			int casesConsecutives = 0;
			for (int i = 0; i < NB_LIGNES-j; i++) {
				casesConsecutives = (this.grille[(NB_LIGNES - 1) - (i) - j][i] == joueurCourant.pion) ? casesConsecutives + 1 : 0;
				if (casesConsecutives == 4) {
					return true;
				}
			}
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
            	int ligneUtilisee = this.insérerPion(colonneChoisie - 1); 
                if (ligneUtilisee != -1) {
                	System.out.println(ligneUtilisee);
                    if (estVictoireEnColonne(colonneChoisie - 1) || estVictoireEnLigne(ligneUtilisee) || estVictoireEnDiagonale() ) {
                    	System.out.println("VICTOIRE");
                    }
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
