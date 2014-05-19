package fr.iutval.puissance4.tpihm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Bouton extends JButton implements ActionListener{

	private int numColonne;
	private MettreAJourGrilleIHM ihm;
	public Bouton(String text, int colonne, MettreAJourGrilleIHM ihm) {
		super(text);
		this.numColonne = colonne;
		this.ihm = ihm;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// XXX Placer le pion
		ihm.placerPion(numColonne, ligne);
	}

}
