package java8.streams;

import static java.lang.System.out;
import static java.util.Comparator.comparingInt;

import java.util.ArrayList;
import java.util.List;

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
    	//cursos.stream().sorted(comparing(Curso::getAlunos)).forEach(c->out.println(c.getAlunos()));
    	cursos.sort(comparingInt(c -> c.getAlunos()));
    	//cursos.sort(comparingInt(Curso::getAlunos));
    	cursos.forEach(c->out.println(c.getAlunos()));
	}
}
