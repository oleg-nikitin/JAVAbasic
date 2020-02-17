package javaBasic;

import java.util.ArrayList;
import java.util.Scanner;



public class Sort {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		String line = "";
				
				ArrayList<String> namen = new ArrayList<String>();
				while (! line.contentEquals("x")) {
					line = eingabe.nextLine();
					namen.add(line);
				}
				for (String s : namen);
		
				System.out.print(namen);
		}
}
