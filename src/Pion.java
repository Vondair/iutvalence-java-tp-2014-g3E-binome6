/* TODO JavaDoc. */
/* TODO Package. */

public enum Pion {
    CASE_VIDE(" ", 0),
    PION_J1("O", 1),
    PION_J2("X", 2);

    private final String representation;
    private final int    valeurDuPion;

    Pion(String repr, int pion) {
        this.representation = repr;
        this.valeurDuPion = pion;
    }

    public int valeur() {
        return this.valeurDuPion;
    }

    @Override
    public String toString() {
        return representation;
    }
}
