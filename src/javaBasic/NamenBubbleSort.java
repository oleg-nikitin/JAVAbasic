package javaBasic;

public class NamenBubbleSort {

	public static void main(String[] args) {
		 String str[] = { "Oleg", "Fedor", "Leo", "David", "Martin" , "Bastie" , "Victor" , "Chemmy"};
	      String temp;

	      for (int j = 0; j < str.length; j++) {
	         for (int i = j + 1; i < str.length; i++) {
	            if (str[i].compareTo(str[j]) < 0) {
	               temp = str[j];
	               str[j] = str[i];
	               str[i] = temp;
	            }
	         }
	         System.out.println(str[j]);
	      }

	}

}
