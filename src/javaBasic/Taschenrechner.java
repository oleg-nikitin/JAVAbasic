package javaBasic;

import java.util.Locale;
import java.util.Scanner;

public class Taschenrechner {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Please enter first number");
        double a = in.nextDouble();
        System.out.println("Please enter second number");
        double b = in.nextDouble();
        System.out.println("Please choose action:\n1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division");
        int action = in.nextInt();
        switch (action) {
        case 1:
            System.out.print(a + b);
            break;
        case 2:
            System.out.print(a - b);
            break;
        case 3:
            System.out.print(a * b);
            break;
        case 4:
            System.out.print(a / b);
            break;


        }


    }


}