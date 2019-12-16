package java_basics;

import java.util.Scanner;

public class datatype {

	public static void main(String[] args) {
         System.out.println("Welcome Al Balqa University System...");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Teacher Name:");
		String name_teacher=s.nextLine();
		System.out.println("Enter Teacher ID:");
		long id_teacher=s.nextLong();
		System.out.println("Welcome "+name_teacher);
		System.out.println("Enter Student Name:");
		String name_student=s.next();
		System.out.println("Enter Student ID:");
		 long id_student=s.nextLong();
		 System.out.println("System Of Student "+name_student);
		 System.out.println("Enter First Mark Of Student From 20:");
		double first=s.nextDouble();
		System.out.println("Enter Second Mark Of Student From 20:");
		double second=s.nextDouble();
		System.out.println("Enter Final Mark Of Student From 40:");
		double third=s.nextDouble();
		System.out.println("Enter Fourth Mark From 20:");
		double fourth=s.nextDouble();
		int mark=(Math.round((int)first)+Math.round((int)second)+Math.round((int)third)+Math.round((int)fourth)); 	//convert from double to int
		int avg=mark/3;
		String welcome="Welcome Program...!";
		System.out.println(welcome);
		System.out.println("The Avrage Mark For Student:"+" "+avg);
		int final_mark=(Math.round((int)first)+Math.round((int)second)+Math.round((int)third)+Math.round((int)fourth));	//convert from double to int
		System.out.println("The Final Mark OF Student: "+final_mark);
		System.out.println("Thank You "+name_teacher);
		
		

	}

	

}
