package fr.iutval.puissance4.tpjava;

import java.awt.Color;

/**
 * Enumération définissant le type m_pion.
 *
 * @author Antoine C, Marine C.
 * @version 1.0.0
 */
@SuppressWarnings("HardCodedStringLiteral")
public enum Pion {
    CASE_VIDE(" ", 0, Color.WHITE),
    PION_J1("O", 1, Color.YELLOW),
    PION_J2("X", 2, Color.RED);

    /** Représentation. */
    private final String m_representation;
    /** Valeur. */
    private final int m_valeur;
    private final Color m_couleur;
    
    Pion(final String repr, final int pion, final Color color) {
        m_representation = repr;
        m_valeur = pion;
        m_couleur = color;
    }

    /** Valeur du pion. */
    public int valeur() {
        return m_valeur;
    }

    public Color color() {
    	return m_couleur;
    }
    /** Représentation du pion. */
    @Override
    public String toString() {
        return m_representation;
    }
}
