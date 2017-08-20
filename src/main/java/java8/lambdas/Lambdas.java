package java8.lambdas;

import static java.lang.Integer.compare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Lambdas {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		palavras.sort((s1, s2) -> compare(s1.length(), s2.length()));
		palavras.forEach(s -> System.out.println(s));
		new Thread(new Runnable() {
		    @Override
		    public void run() {
		        System.out.println("Executando um Runnable");
		    }
		}).start();
		Runnable runnable = () -> {System.out.println("Executando um Runnable");};
		new Thread(runnable).start();
	}

	class StringCompareLength implements Comparator<String> {
		@Override
		public int compare(String o1, String o2) {
			if (o1.length() < o2.length()) {
				return -1;
			}
			if (o1.length() > o2.length()) {
				return 1;
			}
			return 0;
		}
	}

	class ImprimirString implements Consumer<String> {
		@Override
		public void accept(String t) {
			System.out.println(t);
		}
	}
}