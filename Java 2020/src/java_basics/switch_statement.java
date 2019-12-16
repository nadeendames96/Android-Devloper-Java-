package java_basics;

import java.util.Scanner;

public class switch_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
    System.out.println("Enter Number1:");
		   int num1=s.nextInt();
		   System.out.println("Enter Number2:");
		   int num2=s.nextInt();
		   System.out.println("Enter Operartor:");
		   char operator=s.next().charAt(0);
		   
			switch(operator) {
			case '+': System.out.println("Operator Sum: "+(num1+num2));break;
			case '-':System.out.println("Operator Subtract: "+((Math.abs(num1))-(Math.abs(num2))));break;
			case '*':System.out.println("Operator Mutilple: "+(num1*num2));
			case '/':System.out.println("Operator Divide: "+(num1/num2));break;
			case '%':System.out.println("Operator Module: "+(num1%num2));break;
			default:System.out.println("This Is Not Operator");
			
			}
			


	}

}
