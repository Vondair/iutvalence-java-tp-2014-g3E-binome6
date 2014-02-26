public class Puissance4 {
    /** Représente la grille de jeu. */
    public int[][] grille;

    /** Nom du joueur 1. */
    public final String  J1;

    /** Nom du joueur 2. */
    public final String  J2;
    
    /** Joueur courant. */
    public String joueurCourant;
    
    /** Joueur suivant */
    public String joueurSuivant;

    /** Pion du joueur 1. */
    public static final int PION_J1 = 1;

    /** Pion du joueur 2. */
    public static final int PION_J2 = 2;
    
    /** Case vide. */
    public static final int CASE_VIDE = 0;
    
    /** Nombre de lignes */
    public static final int NB_LIGNES = 6;
    
    /** Nombre de colonnes */
    public static final int NB_COLONNES = 7;
    

    /** Constructeur initialisant une grille vide et retenant le nom des joueurs. */
    public Puissance4(String joueur1, String joueur2) {
        this.grille = new int[NB_LIGNES][NB_COLONNES];
        this.J1 = joueur1;
        this.J2 = joueur2;
        this.joueurSuivant = joueur1;
    }   
     
    /** Méthode permettant d'afficher l'état des cases de la grille. */    
    public void afficher(){
    	int i;
    	int j;
    	int testNbCases = 0;
    	for (i = 0; i < NB_LIGNES; i++) {
    		for (j = 0; j < NB_COLONNES; j++) {
    			if (this.grille[i][j] == CASE_VIDE)
    				System.out.println(CASE_VIDE);
    			else if (this.grille[i][j] == PION_J1)
    				System.out.println(PION_J1);
    			else if (this.grille[i][j] == PION_J2)
    				System.out.println(PION_J2);
    			testNbCases++;
    		}
    	}
    	System.out.println(testNbCases);
    }

    /** Méthode permettant d'obtenir une colonne parmi celles de la grille */
    public void obtenirColonne() {
    	int i;
    	for (i = 0; i < NB_COLONNES; i++) {
    		
    	}
    }
    
    /** Méthode permettant au joueur courant de choisir la colonne dans laquelle il veut placer son pion. */
    public void  choisirColonne() {
    	int i;
    }
    
    /** Méthode permettant l'insertion d'un pion dans la grille */
    public void insérerPion() {
    	
    }
    
    /** Méthode permettant de lancer le jeu */
    public void jouer() {
    	this.afficher();
    }
}
