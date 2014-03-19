package fr.iutval.puissance4.tpjava;

/** Enumération définissant le type pion.*/
public enum Pion {
    CASE_VIDE(" ", 0),
    PION_J1("O", 1),
    PION_J2("X", 2);

    /** Représentation du pion.*/
    private final String representation;
    
    /** Valeur du pion.*/
    private final int    valeurDuPion;

    /** Constructeur de pion.*/
    Pion(String repr, int pion) {
        this.representation = repr;
        this.valeurDuPion = pion;
    }

    /** Méthode retournant la valeur du pion.*/
    public int valeur() {
        return this.valeurDuPion;
    }

    /** Affichage de la représentation de la grille.
     * @Override
     */
    public String toString() {
        return representation;
    }
}
