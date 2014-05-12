package fr.iutval.puissance4.tpihm;

import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import fr.iutval.puissance4.tpjava.Grille;


public class IHM implements Runnable {
	public IHM () {
		Grille grille = new Grille();
	}

	@Override
	public void run() {
		JFrame frame = new JFrame();
		frame.setTitle("Puissance4 #aucalme");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.setLayout(new GridBagLayout());
		
		JButton Col1 = new JButton("Colonne 1");
		frame.getContentPane().add(Col1);
		
		JButton Col2 = new JButton("Colonne 2");
		frame.getContentPane().add(Col2);
		
		JButton Col3 = new JButton("Colonne 3");
		frame.getContentPane().add(Col3);
		
		JButton Col4 = new JButton("Colonne 4");
		frame.getContentPane().add(Col4);
		
		JButton Col5 = new JButton("Colonne 5");
		frame.getContentPane().add(Col5);
		
		JButton Col6 = new JButton("Colonne 6");
		frame.getContentPane().add(Col6);
		
		JButton Col7 = new JButton("Colonne 7");
		frame.getContentPane().add(Col7);
		
		frame.setVisible(true);
	}
}




