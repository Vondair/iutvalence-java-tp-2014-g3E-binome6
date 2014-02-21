public class Puissance4 {
    /** Représente la grille de jeu. */
    public int[][] grille;
    /** Nom du joueur 1. */
    public String  J1;
    /** Nom du joueur 2. */
    public String  J2;
    /** Pion du joueur 1. */
    public int pionJ1 = 1;
    /** Pion du joueur 2. */
    public int pionJ2 = 2;

    /** Constructeur initialisant une grille vide et retenant le nom des joueurs. */
    public Puissance4(String joueur1, String joueur2) {
        this.grille = new int[6][7];
        this.J1 = joueur1;
        this.J2 = joueur2;

    }

    public void jouer() {
    }
}
