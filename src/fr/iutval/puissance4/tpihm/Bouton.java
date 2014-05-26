package fr.iutval.puissance4.tpihm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Bouton extends JButton implements ActionListener{

	private int numColonne;
		
	private Controleur controleur;
	
	public Bouton(String text, int colonne, Controleur controleur) {
		super(text);
		this.numColonne = colonne;
		this.controleur = controleur;
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.controleur.insererPion(this.numColonne);
	}
}
