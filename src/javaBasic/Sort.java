package javaBasic;
import java. util. Arrays;

public class Sort {

	public static void main(String[] args) {
		 int [] array = {9,1,5,7,4,6,3,2,8,0};
		   int temp;
		   for (int i = 1; i < array.length; i++) {
		    for (int j = i; j > 0; j--) {
		     if (array[j] < array [j - 1]) {
		      temp = array[j];
		      array[j] = array[j - 1];
		      array[j - 1] = temp;
		     }
		    }
		   }
		   for (int i = 0; i < array.length; i++) {
		     System.out.println(array[i]);
		   }
		  }
		}