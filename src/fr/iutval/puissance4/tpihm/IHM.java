package fr.iutval.puissance4.tpihm;

import java.awt.GridLayout;
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
		frame.setTitle("Puissance4");
		frame.setSize(750, 750);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		frame.setLayout(new GridLayout(6,7));
			frame.add(new JButton("1"));
			frame.add(new JButton("2"));
			frame.add(new JButton("3"));
			frame.add(new JButton("4"));
			frame.add(new JButton("5"));
			frame.add(new JButton("6"));
			frame.add(new JButton("7"));
			frame.add(new JButton("8"));
			frame.add(new JButton("9"));
			frame.add(new JButton("10"));
			frame.add(new JButton("11"));
			frame.add(new JButton("12"));
			frame.add(new JButton("13"));
			frame.add(new JButton("14"));
			frame.add(new JButton("15"));
			frame.add(new JButton("16"));
			frame.add(new JButton("17"));
			frame.add(new JButton("18"));
			frame.add(new JButton("19"));
			frame.add(new JButton("20"));
			frame.add(new JButton("21"));
			frame.add(new JButton("22"));
			frame.add(new JButton("23"));
			frame.add(new JButton("24"));
			frame.add(new JButton("25"));
			frame.add(new JButton("26"));
			frame.add(new JButton("27"));
			frame.add(new JButton("28"));
			frame.add(new JButton("29"));
			frame.add(new JButton("30"));
			frame.add(new JButton("31"));
			frame.add(new JButton("32"));
			frame.add(new JButton("33"));
			frame.add(new JButton("34"));
			frame.add(new JButton("35"));
			frame.add(new JButton("36"));
			frame.add(new JButton("37"));
			frame.add(new JButton("38"));
			frame.add(new JButton("39"));
			frame.add(new JButton("40"));
			frame.add(new JButton("41"));
			frame.add(new JButton("42"));
		
//		frame.setLayout(new GridBagLayout());
//			JButton Col1 = new JButton("Colonne 1");
//				frame.getContentPane().add(Col1);		
//			JButton Col2 = new JButton("Colonne 2");
//				frame.getContentPane().add(Col2);		
//			JButton Col3 = new JButton("Colonne 3");
//				frame.getContentPane().add(Col3);		
//			JButton Col4 = new JButton("Colonne 4");
//				frame.getContentPane().add(Col4);		
//			JButton Col5 = new JButton("Colonne 5");
//				frame.getContentPane().add(Col5);		
//			JButton Col6 = new JButton("Colonne 6");
//				frame.getContentPane().add(Col6);		
//			JButton Col7 = new JButton("Colonne 7");
//				frame.getContentPane().add(Col7);
		
		frame.setVisible(true);
	}
}




