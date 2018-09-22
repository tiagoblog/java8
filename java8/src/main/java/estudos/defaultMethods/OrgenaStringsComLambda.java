package estudos.defaultMethods;

import java.util.ArrayList;
import java.util.List;

public class OrgenaStringsComLambda {

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
	}

}
