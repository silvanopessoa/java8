package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Random;

public class ParallelStream {

    public static void main(String[] args) {
        List<Long> numeros = new ArrayList<>();
 
        Random random = new Random();
        for (int i = 0; i < 10000000; i++) {
            numeros.add(random.nextLong());
        }
 
        LongSummaryStatistics stats = numeros.parallelStream().mapToLong((x) -> x ).summaryStatistics();
        System.out.println("Maior n�mero na lista: " + stats.getMax());
        System.out.println("Menor n�mero na lista: " + stats.getMin());
        System.out.println("Soma de todos os n�meros: " + stats.getSum());
        System.out.println("M�dia de todos os n�meros: " + stats.getAverage());
    }
}
