package lab03.exercise09;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("d/MM/yyyy");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the date");
		String dateStr = input.next();
		input.close();
		LocalDate date = LocalDate.parse(dateStr, format);
		Period p = Period.between(date, LocalDate.now());
		System.out.println("Days: "+p.getDays()+" Months: "+p.getMonths()+" Years: "+p.getYears());
	}

}
