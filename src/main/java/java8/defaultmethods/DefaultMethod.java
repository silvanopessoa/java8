package java8.defaultmethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethod {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		palavras.sort(new StringCompareLength());
		palavras.forEach(new ImprimirString());
	}

}

class ImprimirString implements Consumer<String> {
	@Override
	public void accept(String t) {
		System.out.println(t);
	}
}

class StringCompareLength implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		if(o1.length()<o2.length()){
			return -1;
		}
		if(o1.length()>o2.length()){
			return 1;
		}
		return 0;
	}
}