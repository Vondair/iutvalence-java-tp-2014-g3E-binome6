package fr.iutval.puissance4.tpihm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import fr.iutval.puissance4.tpjava.Pion;


public class IHM implements Runnable, MettreAJourGrilleIHM {

	private Controleur controleur;
	
	private JButton[][] boutons;

	private JFrame frame;
	
	public IHM(Controleur controleur) {
		this.controleur = controleur;
	}
	
	@Override
	public void run() {
		this.frame = new JFrame();
		this.frame.setTitle("Puissance4");
		this.frame.setSize(600, 700);
		this.frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.frame.getContentPane().setLayout(new BorderLayout());

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
			String resultat = null;
			if (this.controleur.estVictoire() == Pion.PION_J1)
				resultat= "Joueur 1 ";
			else
				if (this.controleur.estVictoire() == Pion.PION_J2)
					resultat = "Joueur 2 ";
			else
				resultat = "Aucun des deux joueurs n'";
		
		String possiblites[] = {"Nouvelle Partie", "Quitter le Jeu"};
		int options = JOptionPane.showOptionDialog(this.frame, resultat + "a gagné la partie !", "Partie terminée", 0, JOptionPane.INFORMATION_MESSAGE, null, possiblites, possiblites[0]);
		if (options == 0)
			this.controleur.recommencerPartie();
		else
			System.exit(0);
		}
	}

	public void remettreGrilleAZero() {
		for (int i=0; i<7; i++)
			for (int j=0; j<6; j++)
				this.boutons[i][j].setBackground(Color.WHITE);
	}


}






