package fr.iutval.puissance4.tpihm;

import fr.iutval.puissance4.tpjava.Pion;

public interface InteragirGrilleReelle {

	/**
	 * Inserer un pion dans la grille.
	 * 
	 * @return boolean.
	 */
	public int insererPion(final int colonne, final Pion pion);

	/** Victoire */
	public Boolean estVictoire(Pion pion);

	/** Reinitialisation de la grille*/
	public void reinitialiserGrille();

}