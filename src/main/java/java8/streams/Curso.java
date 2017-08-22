package java8.streams;

import static java.lang.System.out;
import static java.util.Comparator.comparingInt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Curso {
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
    
    public static void main(String[] args) {
    	List<Curso> cursos = new ArrayList<Curso>();
    	cursos.add(new Curso("Python", 45));
    	cursos.add(new Curso("JavaScript", 150));
    	cursos.add(new Curso("Java 8", 113));
    	cursos.add(new Curso("C", 55));
    	
    	Stream<Curso> stream = cursos.stream()
    			   .filter(c -> c.getAlunos() > 50);
    	stream.collect(Collectors.toList());
    	
    	double media = cursos.stream().mapToInt(c -> c.getAlunos()).average().getAsDouble();
    	System.out.println(media);
    	
    	//cursos.stream().sorted(comparing(Curso::getAlunos)).forEach(c->out.println(c.getAlunos()));
    	cursos.sort(comparingInt(c -> c.getAlunos()));
    	//cursos.sort(comparingInt(Curso::getAlunos));
    	cursos.forEach(c->out.println(c.getAlunos()));
    	cursos.stream().filter(c -> c.getAlunos() > 50).forEach(c->out.println(c.getAlunos()));
    	
    	cursos.stream().map(c -> c.getNome()).forEach(x -> System.out.println(x));
    	Stream<String> nomes = cursos.stream().map(Curso::getNome);
    	
    	System.out.println("-----------------------------------------------------------");
    	cursos.stream()
    	   .filter(c -> c.getAlunos() > 50)
    	   .map(c -> c.getAlunos())
    	   .forEach(x -> System.out.println(x));
    	System.out.println("-----------------------------------------------------------");
    	cursos.stream()
    	   .filter(c -> c.getAlunos() > 50)
    	   .map(Curso::getAlunos)
    	   .forEach(System.out::println);
    	System.out.println("-----------------------------------------------------------");
    	
    	cursos.stream()
    	   .filter(c -> c.getAlunos() > 50).findFirst().ifPresent(c -> System.out.println(c.alunos));
    	System.out.println("-----------------------------------------------------------");

	}
}
