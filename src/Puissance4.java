public class Puissance4 {
    /* TODO Est-ce que cet attribut va changer en cours de partie ? final ? */
    /** Représente la grille de jeu. */
    public int[][] grille;
    /* TODO Est-ce que cet attribut va changer en cours de partie ? final ? */
    /** Nom du joueur 1. */
    public String  J1;
    /* TODO Est-ce que cet attribut va changer en cours de partie ? final ? */
    /** Nom du joueur 2. */
    public String  J2;
    /* TODO Est-ce que cet attribut peut être différent de 1 ? constante ? */
    /** Pion du joueur 1. */
    public int pionJ1 = 1;
    /* TODO Est-ce que cet attribut peut être différent de 1 ? constante ? */
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
