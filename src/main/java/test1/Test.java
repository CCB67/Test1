package test1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello user!");
		System.out.println("What is your name?");
		String name = new Scanner( System.in ).nextLine();
		System.out.println("Hello " + name + " geht es Dir gut?\n");
		String state = new Scanner( System.in ).nextLine();
		if (state.toUpperCase().equals("JA"))
			System.out.println("Das ist schön :-)");
		else if (state.toUpperCase().equals("NEIN"))
			System.out.println("Oh das tut mir leid!");
		else 
			System.out.println("Das habe ich nicht verstanden!");

		System.out.println("Tschüss bis bald...*");
	}

}