package lletres_repetides;

import java.util.ArrayList;

public class fase4_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Character> cognom = new ArrayList<Character>();
		cognom.add('A');
		cognom.add('R');
		cognom.add('A');
		cognom.add('M');
		cognom.add('B');
		cognom.add('U');
		cognom.add('R');
		cognom.add('U');
		
		ArrayList<Character> nom = new ArrayList<Character>();
		nom.add('B');
		nom.add('E');
		nom.add('G');
		nom.add('O');
		nom.add('Ñ');
		nom.add('A');
		
		nom.addAll(cognom);
		//System.out.println(nom);
	
		ArrayList<Character> nomCognom = new ArrayList<Character>();
		nomCognom = nom;
		nomCognom.add(6,' ');		
		System.out.println(nomCognom);
		
		
		
	}

}
