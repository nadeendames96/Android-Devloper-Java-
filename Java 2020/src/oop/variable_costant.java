package oop;

import java.util.Scanner;

public class variable_costant {
   
	static final  double pi=3.14;    //constant number(not change value) correct
	 final  static double pi2=3.14;    //constant number(not change value) correct
	 final double pi3=3.14;

	//pi=45.5;
	/* static*/ void Display() { //Function
		//method is static because main method is static
		Scanner s=new Scanner(System.in);
		System.out.println("Enter R:");
		int r=s.nextInt();
		double area=(r*r)*pi;
		System.out.println("Area = "+area);
		return;
	}
	int Sum(int num) {
		return num+(int)pi; //Casting
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Display(); //
		new variable_costant().Display();
		//System.out.println(num); Error Becuase Number Is Local Vailable In The Method
		System.out.println(new variable_costant(). pi); //Not Erroe Because Pi is global Veriable And Public
System.out.println(pi2);
//System.out.println(pi3); //Error Because is non staic
  System.out.println(new variable_costant().pi3);
	}

}
