package algo;
import java.util.Scanner;  // Import the Scanner class

/* L’objectif est de pouvoir alimenter une carte de restaurant avec des menus. Chaque menu
est composé d’une entrée, d’un plat principal et d’un dessert. L’utilisateur a la possibilité de
mettre un nom a son menu. 
*/

public class algo {
	public static void main(String[] args){
	// création d'un objet scanner sur l'entrée standard
	Scanner sc = new Scanner(System.in);
	System.out.println("Que faire ? 1. Creer une carte 2. Quitter");
	
	// si un chiffre a été rentré
	if(sc.hasNextInt()){
		int choix = sc.nextInt(); // on recupere le chiffre
		System.out.println(choix);
	}
	
	// Si c'est une chaine de caractère
	if(sc.hasNextLine()){
	String valeur = sc.nextLine(); // traitement
	}
	}
	
}
