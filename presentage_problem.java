package myproject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.Period;

public class presentage_problem {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("YYYY: ");
        int year = scanner.nextInt();
        System.out.print("MM: ");
        int month = scanner.nextInt();
        System.out.print("DD: ");
        int day = scanner.nextInt();
        LocalDate birthDate = LocalDate.of(2006, 9, 9);
        System.out.println(birthDate);
        LocalDate currentDate = LocalDate.now();
        if (birthDate.isAfter(currentDate)) {
            System.out.println("Birthdate ");
        } else {
            Period age = Period.between(birthDate, currentDate);
            System.out.println(age);
                    
 
        }


       
	}

}
