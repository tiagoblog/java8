package estudos.lambda;

import java.util.ArrayList;
import java.util.List;

public class OrgenaStrings {

	/*
	 * 
	 * Lambdas se aplicam as chamadas interfaces funcionais, 
	 * ou seja, interfaces que possuem apenas um único metodo abstrato,
	 * dessa forma o compilador consegue inferir que a expressão lambda
	 * é a implementação daquele único metódo abstrato da interface funcional. 
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Lambda");

		List<String> palavras = new ArrayList<String>();

		palavras.add("VPS");
		palavras.add("Java");
		palavras.add("Spring");
		palavras.add("Maven");
		palavras.add("DevOps");		

		System.out.println(palavras);
		
		palavras.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));
		
		System.out.println(palavras);
		
		palavras.forEach( s -> System.out.println(s));
		
		new Thread(() -> System.out.println("Executando um Runnable")).run();
		
		
	}

}
