package fr.iutval.puissance4.tpihm;

import javax.swing.SwingUtilities;

import fr.iutval.puissance4.tpjava.Grille;
import fr.iutval.puissance4.tpjava.Pion;

public class Controleur {

	private MettreAJourGrilleIHM ihm;

	private InteragirGrilleReelle grille;

	private Pion pionCourant;

	public static void main(final String... args) {

		InteragirGrilleReelle grille = new Grille();
		Controleur controleur = new Controleur();
		IHM ihm = new IHM(controleur);

		controleur.associerGrilleIhm(grille, ihm);

		SwingUtilities.invokeLater(ihm);
	}

	public Controleur() {
		this.pionCourant = Pion.PION_J1;
	}

	private void associerGrilleIhm(InteragirGrilleReelle grille,
			MettreAJourGrilleIHM ihm) {
		this.grille = grille;
		this.ihm = ihm;
	}

	public void insererPion(int colonne) {
		int ligne = this.grille.insererPion(colonne, this.pionCourant);
		if (ligne != -1) {
			this.ihm.placerPion(colonne, ligne + 1, this.pionCourant);
			if (this.pionCourant == Pion.PION_J1)
				this.pionCourant = Pion.PION_J2;
			else
				this.pionCourant = Pion.PION_J1;
		}
	}

	/** Victoire */
	public Pion estVictoire() {
		if (this.grille.estVictoire(Pion.PION_J1))
			return Pion.PION_J1;
		if (this.grille.estVictoire(Pion.PION_J2))
			return Pion.PION_J2;
		return null;
	}

}
