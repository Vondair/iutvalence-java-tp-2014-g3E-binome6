package fr.iutval.puissance4.tpjava;

/**
 * Enumération définissant le type m_pion.
 *
 * @author Antoine C, Marine C.
 * @version 1.0.0
 */
@SuppressWarnings("HardCodedStringLiteral")
public enum Pion {
    CASE_VIDE(" ", 0),
    PION_J1("O", 1),
    PION_J2("X", 2);

    /** Représentation. */
    private final String m_representation;
    /** Valeur. */
    private final int m_valeur;

    Pion(final String repr, final int pion) {
        m_representation = repr;
        m_valeur = pion;
    }

    /** Valeur du pion. */
    public int valeur() {
        return m_valeur;
    }

    /** Représentation du pion. */
    @Override
    public String toString() {
        return m_representation;
    }
}
