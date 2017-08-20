package java8.methodreferences;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.List;

public class MethodReferences {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		palavras.sort(comparing(String::toString));
		palavras.forEach(System.out::println);
		Runnable runnable = () -> {System.out.println("Executando um Runnable");};
		new Thread(runnable).start();
	}

}