package fr.iutval.puissance4.tpjava;

import java.util.Scanner;

/**
 * Jeu Puissance 4.
 *
 * @author Antoine C, Marine C.
 * @version 1.0
 */
@SuppressWarnings("HardCodedStringLiteral")
public final class Puissance4 {

    /** Premier joueur. */
    private final Joueur m_joueur1;

    /** Second joueur. */
    private final Joueur m_joueur2;

    /** Joueur courant. */
    private Joueur m_joueurCourant;

    /** Grille de jeu. */
    private final Grille m_grille;

    /** Constructeur initialisant une grille vide et retenant le m_nom des joueurs. */
    public Puissance4(final String joueur1, final String joueur2) {
        m_grille = new Grille();
        m_joueur1 = new Joueur(joueur1, Pion.PION_J1);
        m_joueur2 = new Joueur(joueur2, Pion.PION_J2);
        m_joueurCourant = m_joueur1;
    }

    /** Changement de joueur. */
    public void joueurSuivant() {
        m_joueurCourant = m_joueurCourant.equals(m_joueur1) ? m_joueur2 : m_joueur1;
    }

    /** Lancer le jeu. */
    public void jouer() {
        final Scanner sc = new Scanner(System.in, "UTF-8");
        /* TODO Implémenter le match nul. */
        while (true) {
            System.out.println(m_grille);
            final int colonneChoisie = sc.nextInt();
            if ((colonneChoisie > 0) && (colonneChoisie <= 7)) {
                final Pion pionCourant = m_joueurCourant.pion();
                final int ligneUtilisee = m_grille.insererPion(colonneChoisie - 1, pionCourant);
                if (ligneUtilisee == -1) {
                    System.err.println("Colonne pleine");
                    continue;
                }
                if (m_grille.estVictoireEnColonne(colonneChoisie - 1, pionCourant) || m_grille.estVictoireEnLigne(ligneUtilisee, pionCourant) || m_grille.estVictoireEnDiagonale(pionCourant)) {
                    System.out.println("VICTOIRE");
                    break;
                }
                joueurSuivant();
            }
            else {
                System.err.println("Valeur incorrecte.");
            }
        }
    }


    @Override
    public String toString() {
        return String.format("Puissance4{m_joueur1=%s, m_joueur2=%s, m_joueurCourant=%s, m_grille=%s}", m_joueur1, m_joueur2, m_joueurCourant, m_grille);
    }
}
