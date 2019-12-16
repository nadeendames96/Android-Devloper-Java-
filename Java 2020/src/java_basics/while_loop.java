package java_basics;

import java.util.Scanner;

public class while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s=new Scanner(System.in);
		  System.out.println("Enter Your Name:");
		String name=s.nextLine();
		while(name.length()==6) {
			int l=name.length();
			System.out.println("Welcome "+name+" "+l);
			break;
		}
		
	}

}
