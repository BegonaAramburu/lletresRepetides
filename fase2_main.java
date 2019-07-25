package lletres_repetides;
import java.util.ArrayList;

public class fase2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> nom = new ArrayList<Character>();
			nom.add('B');
			nom.add('E');
			nom.add('G');
			nom.add('O');
			nom.add('Ñ');
			nom.add('A');
		
			for (int i=0; i<nom.size(); i++) {
				if (nom.get(i)=='A' || nom.get(i) =='E' || nom.get(i) =='I' || nom.get(i) =='O' || nom.get(i) =='U') {
				
					System.out.println("VOCAL");
				}else {
					System.out.println("CONSONANTE");
				}
				
				if(Character.isDigit(nom.get(i))) {
					System.out.println("Els noms de persones no contenen números");
				}
			}
			
	}

}
