package fr.iutval.puissance4.tpihm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import fr.iutval.puissance4.tpjava.Pion;


public class IHM implements Runnable, MettreAJourGrilleIHM {

	private Controleur controleur;
	
	private JButton[][] boutons;
	
	public IHM(Controleur controleur) {
		this.controleur = controleur;
	}
	
	@Override
	public void run() {
		JFrame frame = new JFrame();
		frame.setTitle("Puissance4");
		frame.setSize(600, 700);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());

		JPanel grille = new JPanel();
		grille.setLayout(new GridLayout(6,7));

		this.boutons = new JButton[7][7];
		
		for (int i = 1; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				this.boutons[i][j] = new JButton();
				this.boutons[i][j].setEnabled(false);
				this.boutons[i][j].setBackground(Color.WHITE);
				grille.add(this.boutons[i][j]);
			}
		}
		frame.getContentPane().add(grille,BorderLayout.CENTER);
		
		JPanel boutons = new JPanel();
		boutons.setLayout(new GridLayout(1,7));
		
		for (int j = 0; j < 7; j++) {
			this.boutons[0][j] = new Bouton("↓", j, this.controleur);
			boutons.add(this.boutons[0][j]);
		}
		
		frame.getContentPane().add(boutons,BorderLayout.NORTH);
		
		frame.setVisible(true);
	}

	@Override
	public void placerPion(int colonne, int ligne, Pion pion) {
		this.boutons[ligne][colonne].setBackground(pion.color());
		if ((this.controleur.estVictoire() == Pion.PION_J1) || (this.controleur.estVictoire() == Pion.PION_J2)) {
			System.out.println("Partie Terminée");
		}
	}
}




