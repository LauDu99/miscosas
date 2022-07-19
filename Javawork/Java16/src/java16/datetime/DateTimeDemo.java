package java16.datetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {

		LocalTime time = LocalTime.parse("17:30:09.7654");
		//h nos da las horas y B el momento del d�a
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h B");
		System.out.println(time.format(formatter));
	}

}
