package fr.iutval.puissance4.tpjava;

import javax.swing.SwingUtilities;

import fr.iutval.puissance4.tpihm.IHM;
import fr.iutval.puissance4.tpihm.InteragirGrilleReelle;

/**
 * "Launcher" du jeu.
 *

 * @version 1.0.1
 */
public final class Application {
    /** Méthode principale. */
    public static void main(final String... args) {
    	
    	//final Puissance4 partie = new Puissance4("Tom", "Jerry");
    	final InteragirGrilleReelle grille = new Grille();
    	SwingUtilities.invokeLater(new IHM(grille));
    }
}
