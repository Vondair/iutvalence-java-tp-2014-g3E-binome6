package fr.iutval.puissance4.tpjava;

import java.util.Arrays;

import fr.iutval.puissance4.tpihm.InteragirGrilleReelle;

/**
 * TODO Comments.
 * 
 * @author Antoine C, Marine C.
 * @version 1.0.0
 */
public final class Grille implements InteragirGrilleReelle {
	/** Nombre de lignes. */
	public static final int NB_LIGNES = 6;
	/** Nombre de colonnes. */
	public static final int NB_COLONNES = 7;
	/** Grille de jeu. */
	private final Pion[][] m_grille;

	/** Constructeur initialisant une grille vide. */
	public Grille() {
		m_grille = new Pion[NB_LIGNES][NB_COLONNES];
		for (int i = 0; i < NB_LIGNES; i++) {
			Arrays.fill(m_grille[i], Pion.CASE_VIDE);
		}
	}

	/** Afficher l'état des cases de la grille. */
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("========\n");
		for (int i = 0; i < NB_LIGNES; i++) {
			sb.append('|');
			for (int j = 0; j < NB_COLONNES; j++) {
				sb.append(m_grille[i][j]);
			}
			sb.append("|\n");
		}
		return sb.append("========\n").toString();
	}

	/**
	 * Inserer un pion dans la grille.
	 * 
	 * @return boolean.
	 */
	public int insererPion(final int colonne, final Pion pion) {
		for (int j = NB_LIGNES - 1; j >= 0; j--) {
			if (m_grille[j][colonne] == Pion.CASE_VIDE) {
				m_grille[j][colonne] = pion;
				return j;
			}
			// Cas pour lequel la colonne est déjà remplie, mettre un pion
			// supplémentaire est donc impossible.
			if (j == 0) {
				return -1;
			}
		}
		return -1;
	}

	/** Victoire en colonne. */
	public boolean estVictoireEnColonne(final int colonne, final Pion pion) {
		int casesConsecutives = 0;
		for (int i = 0; i < NB_LIGNES; i++) {
			casesConsecutives = (m_grille[i][colonne] == pion) ? casesConsecutives + 1
					: 0;
			if (casesConsecutives == 4) {
				return true;
			}
		}
		return false;
	}

	/** Victoire en ligne. */
	public boolean estVictoireEnLigne(final int ligne, final Pion pion) {
		int casesConsecutives = 0;
		for (int i = 0; i < NB_COLONNES; i++) {
			casesConsecutives = (m_grille[ligne][i] == pion) ? casesConsecutives + 1
					: 0;
			if (casesConsecutives == 4) {
				return true;
			}
		}
		return false;
	}

	/** Victoire en diagonale. */
	public boolean estVictoireEnDiagonale(final Pion pion) {
		for (int j = 0; j < NB_LIGNES; j++) {
			int casesConsecutives = 0;
			for (int i = 0; i < (NB_LIGNES - j); i++) {
				casesConsecutives = (m_grille[j + i][i] == pion) ? casesConsecutives + 1
						: 0;
				if (casesConsecutives == 4) {
					return true;
				}
			}
		}

		for (int j = 0; j < NB_LIGNES; j++) {
			int casesConsecutives = 0;
			for (int i = 0; i < (NB_LIGNES - j); i++) {
				casesConsecutives = (m_grille[i][i + j + 1] == pion) ? casesConsecutives + 1
						: 0;
				if (casesConsecutives == 4) {
					return true;
				}
			}
		}

		for (int j = 0; j < NB_LIGNES; j++) {
			int casesConsecutives = 0;
			for (int i = 0; i < (NB_LIGNES - j); i++) {
				casesConsecutives = (m_grille[NB_LIGNES - 1 - i][i + j] == pion) ? casesConsecutives + 1
						: 0;
				if (casesConsecutives == 4) {
					return true;
				}
			}
		}

		for (int j = 0; j < NB_LIGNES; j++) {
			int casesConsecutives = 0;
			for (int i = 0; i < (NB_LIGNES - j); i++) {
				casesConsecutives = (m_grille[NB_LIGNES - 1 - i - j][i] == pion) ? casesConsecutives + 1
						: 0;
				if (casesConsecutives == 4) {
					return true;
				}
			}
		}

		return false;
	}

	/** Victoire */
	public boolean estVictoire(final Pion pion) {
		for (int i = 0; i < NB_COLONNES; i++) {
			if (estVictoireEnColonne(i, pion))
				return true;
		}
		for (int i = 0; i < NB_LIGNES; i++) {
			if (estVictoireEnLigne(i, pion))
				return true;
		}
		return estVictoireEnDiagonale(pion);
	}
}