/** 
	 * Création de la classe Puissance4.
*/
public class Puissance4 {
	
	
	/**
	 * On définit un tableau.
	 * Ce tableau représente la grille de jeu
	 */
	public int[][] grille;

	/**
	 * On définit la méthode qui prend pour arguments J1 et J2 quand on l'appelle dans la classe Application.
	 * @param string
	 * @param string2
	 */
	public Puissance4(String string, String string2) {
		this.grille = new int[6][7];
		this.J1 = string;
		this.J2 = string2;

	}
	/** On associe les attributs String et string aux joueurs.
	 *  
	 */
	

	/**
	 * On définit l'attribut J1 en tant que chaine de caractères.
	 */
	public String J1;
	
	/**
	 * On définit l'attribut J2 en tant que chaine de caractères.
	 */
	public String J2;

	/**
	 * On définit l'entier pionJ1.
	 * On l'initialise à 1
	 */
	public int pionJ1 = 1;
	
	/**
	 * On définit l'entier pionJ2.
	 * On l'initialise à 2
	 */
	public int pionJ2 = 2;
	


	/**
	 * On définit la méthode jouer.
	 * Cette méthode permettra de jouer au puissance 4
	 */
	public void jouer(){
	
	}

}
