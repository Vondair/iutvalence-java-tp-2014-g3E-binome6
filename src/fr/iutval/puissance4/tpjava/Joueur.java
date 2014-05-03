package fr.iutval.puissance4.tpjava;

/**
 * Implémentation d'un joueur lui associant un m_nom et un m_pion.
 * 
 * @author Antoine C, Marine C.
 * @version 1.0.0
 */
public final class Joueur {
	/** Nom du joueur. */
	private final String m_nom;
    /** Pion du joueur. */
    private final Pion m_pion;

    public Joueur(final String nom, final Pion pion) {
        m_nom = nom;
        m_pion = pion;
    }

    public Pion pion() {
        return m_pion;
    }

    @Override
    public String toString() {
        return String.format("Joueur{m_nom='%s', m_pion=%s}", m_nom, m_pion);
    }
}
