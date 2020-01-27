package javaBasic;
import java.util.ArrayList;
import java.util.Collections;

public class NamenSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> colleges = new ArrayList<String>();
		 colleges.add("Chemmy");
		 colleges.add("Victor");
		 colleges.add("Bastie");
		 colleges.add("Martin");
		 colleges.add("David");
		 colleges.add("Leo");
		 colleges.add("Fedor");
		 colleges.add("Oleg");



		    
		    Collections.sort(colleges);

		    for (String i : colleges) {
		      System.out.println(i);
		    }
		  } 
		}

	