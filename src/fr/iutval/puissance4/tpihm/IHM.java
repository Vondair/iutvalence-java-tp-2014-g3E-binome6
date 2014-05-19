package fr.iutval.puissance4.tpihm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import fr.iutval.puissance4.tpjava.Grille;
import fr.iutval.puissance4.tpjava.Puissance4;


public class IHM implements Runnable, MettreAJourGrilleIHM {

	public InteragirGrilleReelle jeu;
	
	public IHM (InteragirGrilleReelle partie) {
		Grille grille = new Grille();
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
		for (int i = 0; i < 6*7; i++) {
			JButton bouton = new JButton();
			bouton.setEnabled(false);
			bouton.setBackground(Color.MAGENTA);
			grille.add(bouton);
		}
		frame.getContentPane().add(grille,BorderLayout.CENTER);
		
		JPanel boutons = new JPanel();
		boutons.setLayout(new GridLayout(1,7));
		boutons.add(new Bouton("↓",0,this,jeu));
		boutons.add(new JButton("↓"));
		boutons.add(new JButton("↓"));
		boutons.add(new JButton("↓"));
		boutons.add(new JButton("↓"));
		boutons.add(new JButton("↓"));
		boutons.add(new JButton("↓"));
		frame.getContentPane().add(boutons,BorderLayout.NORTH);
		
		frame.setVisible(true);
	}

	@Override
	public void placerPion(int colonne, int ligne) {
		// XXX
	}
}




