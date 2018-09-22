package estudos.defaultMethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;


public class OrdenaStrings {

	/*
	 * 
	 * Defaul Methods: Recurso que surgiu no java8 e que possibilita adicionar métodos concretos em interfaces.
	 * 
	 * Ex.: sort e foreach da interface List  
	 * 
	 */
	
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		
		palavras.add("VPS");
		palavras.add("Java");
		palavras.add("Spring");
		palavras.add("Maven");
		palavras.add("DevOps");		
		
		ComparadorPorTamanho comparadorPorTamanho = new ComparadorPorTamanho();
		
		System.out.println(palavras);
		
		palavras.sort(comparadorPorTamanho);
		
		System.out.println(palavras);	
		
		Consumer<String> consumidor = new ImprimeNaLinha(); 
		palavras.forEach(consumidor);

	}
}

class ImprimeNaLinha implements Consumer<String> {
	public void accept(String s) {
		System.out.println(s);		
	}
}

class ComparadorPorTamanho implements Comparator<String>{
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length())
			return -1;
		
		if(s1.length() > s2.length())
			return 1;
		return 0;
	}	
}
