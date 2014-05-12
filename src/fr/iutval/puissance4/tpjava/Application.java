package fr.iutval.puissance4.tpjava;

import javax.swing.SwingUtilities;

import fr.iutval.puissance4.tpihm.IHM;

/**
 * "Launcher" du jeu.
 *

 * @version 1.0.1
 */
public final class Application {
    /** Méthode principale. */
    public static void main(final String... args) {
    	SwingUtilities.invokeLater(new IHM());
        //final Puissance4 partie = new Puissance4("Tom", "Jerry");
        //partie.jouer();
    }
}
