package estudos.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ExemploCursos {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		
		System.out.println("Todos os cursos: ");		
		cursos.forEach(c -> System.out.println(c.getNome()));
		System.out.println("===============================");
		
		System.out.println("Cursos com 50 alunos ou mais: ");
		cursos.stream()
			  .filter( c -> c.getAlunos() >= 50)
			  .forEach(c -> System.out.println(c.getNome()));
		
		System.out.println("Quantidade de alunos: ");
		cursos.stream()
		  .filter( c -> c.getAlunos() >= 50)
		  .map(Curso::getAlunos)
		  .forEach(System.out::println);
		
	    System.out.println("===============================");
	    
	    Stream<String> streamDeString = cursos.stream().map(Curso::getNome);
	    
	    streamDeString.forEach(System.out::println);
	    
	    int totalDeAlunos = cursos.stream().mapToInt(Curso::getAlunos).sum();
	    
	    System.out.println("===============================");
	    
	    System.out.println("Total de Alunos: "+totalDeAlunos);
	    
	    
	}	

}

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}
