package java8.localdate;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Java8Date {

	public static void main(String[] args) {
		
		LocalDate localdate2 = LocalDate.parse("2099-01-25");
		System.out.println(localdate2);
		
		
		LocalDate localdate = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(localdate);
		Period periodo = Period.between(LocalDate.now(), localdate);
		System.out.println(periodo.getYears());
		System.out.println(periodo.getMonths());
		System.out.println(periodo.getDays());
		
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(LocalDate.now().format(formatador));
	}
}
