package estudos.methodsReference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrgenaStrings {

	/*
	 * Method reference
	 * 
	 * Exemplo  s -> s.length(). Dada uma String, invoque e retorne o método length. 
	 * 
	 * Há uma forma de escrever esse tipo de lambda de uma forma ainda mais reduzida.
	 * 
	 * Ao invés de fazer:
	 * 
	 * palavras.sort(Comparator.comparing(s -> s.length()));
	 * 
	 * Usar method reference:
	 * 
	 * palavras.sort(Comparator.comparing(String::length));
	 */
	
	public static void main(String[] args) {		

		List<String> palavras = new ArrayList<String>();

		palavras.add("VPS");
		palavras.add("Java");
		palavras.add("Spring");
		palavras.add("Maven");
		palavras.add("DevOps");		
						
		
		palavras.sort(Comparator.comparing(String::length));
		
		System.out.println(palavras);
		
		palavras.forEach(System.out::println);
		
		
	}

}
