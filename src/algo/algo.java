package algo;

import java.util.ArrayList;
import java.util.Scanner;  // Import the Scanner class

/* L’objectif est de pouvoir alimenter une carte de restaurant avec des menus. Chaque menu
est composé d’une entrée, d’un plat principal et d’un dessert. L’utilisateur a la possibilité de
mettre un nom a son menu. 
*/

public class algo {
	//empty list
	ArrayList<String> la_carte = new ArrayList<String>();
	
	public void topMenu() {
        System.out.println("######################");
        System.out.println("# LA CARTE #");
        System.out.println("#--------------------#");
    }
	
	public void heartMenu(String n, String e, String p, String d) {
        System.out.println("#" + n + "#");
        System.out.println("#-" + e + "#");
        System.out.println("#-" + p + "#");
        System.out.println("#-" + d + "#");
        System.out.println("#--------------------#");
    }
	
	public ArrayList<String> add_something(String element) {
		la_carte.add(element);
		return la_carte;
	}
	
	public void level1() {
		System.out.println("Que faire ?");
		System.out.println("1. Creer une carte");
		System.out.println("2. Quitter");
		// création d'un objet scanner sur l'entrée standard
		Scanner sc = new Scanner(System.in);
		// si un chiffre a été rentré
		if(sc.hasNextInt()){
			int choix = sc.nextInt(); // on recupere le chiffre
			while(choix != 2) {
				algo l = new algo();
				l.level2();
				if (choix == 0 || choix > 2 ) { break; }
			}
			
		}
    }
	
	public void level2() {
		
		System.out.println("1. Ajouter un menu");
		System.out.println("2. Voir la carte");
		System.out.println("3. Quitter");
		Scanner level2 = new Scanner(System.in);
			if(level2.hasNextInt()){
        		int level_2 = level2.nextInt(); // traitement
        		if(level_2 == 1) {
        			algo l = new algo();
    				l.level3();
        		}
    			else if(level_2 == 2){
    				System.out.println("D'accord. Voici la carte actuelle :");
    				topMenu();
    				System.out.println(la_carte);
    			}
    			else {
    				algo l = new algo();
    				l.level1();
    			}
			}
		}
	
    public void level3() {
    	System.out.println("Vous ajoutez un menu.");
		System.out.println("Veuillez choisir le nom du menu.");
		Scanner menu_name = new Scanner(System.in);
		String name_menu = menu_name.nextLine();
		System.out.println("Nom du menu : " + name_menu);
		System.out.println("Choisir le nom de l'entree");
		if(!name_menu.isEmpty()){
			Scanner entree = new Scanner(System.in);
			String amuses_gueules = entree.nextLine();
			System.out.println("Nom de l'entree : " + amuses_gueules);
			System.out.println("Choisir le nom du plat principal");
			if(!amuses_gueules.isEmpty()) {
				Scanner plat = new Scanner(System.in);
    			String hors_d_oeuvre = plat.nextLine();
    			System.out.println("Nom du plat principal : " + hors_d_oeuvre);
    			System.out.println("Choisir le nom du dessert");
    			if(!hors_d_oeuvre.isEmpty()) {
    				Scanner dessert = new Scanner(System.in);
        			String gateau = dessert.nextLine();
        			System.out.println("Nom du dessert : " + gateau);
        			if(!gateau.isEmpty()) {
        				System.out.println("Ok. Souhaitez-vous vraiment ajouter ce menu sur la carte ?");
        				System.out.println("1. oui");
        				System.out.println("2. non");
        				Scanner level3 = new Scanner(System.in);
        				if(level3.hasNextInt()){
        	        		int level_3 = level3.nextInt(); // traitement
        	        		if(level_3 == 1) {
        	        			add_something(name_menu);
        	        			add_something(amuses_gueules);
        	        			add_something(hors_d_oeuvre);
        	        			add_something(gateau);
        	        			topMenu();
        	        			heartMenu(name_menu, amuses_gueules, hors_d_oeuvre, gateau);
        	        		}
        				}
        			}
	        	}
			}
		}
    }
    
	public static void main(String[] args){
		algo l = new algo();
		l.level1();
	}
  
}
