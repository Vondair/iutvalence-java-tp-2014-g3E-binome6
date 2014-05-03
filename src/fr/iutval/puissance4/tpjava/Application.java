package fr.iutval.puissance4.tpjava;

/**
 * "Launcher" du jeu.
 *

 * @version 1.0.1
 */
public final class Application {
    /** Méthode principale. */
    public static void main(final String... args) {
        final Puissance4 partie = new Puissance4("Tom", "Jerry");
        partie.jouer();
    }
}
