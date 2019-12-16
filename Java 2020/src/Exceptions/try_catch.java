package Exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class try_catch {

	
	  static void sum(double num1,double num2) {
		   try {
			   Scanner s=new Scanner(System.in);
		   num1=s.nextDouble();
		   num2=s.nextDouble();
		   int res=3/0;
		   System.out.println(num1+num2);
		   System.out.println(res);
		   return;
		   }
		  /* catch (ArithmeticException e) {
			// TODO: handle exception
			   System.out.println("Not define number/0");
		}*/
		   catch (InputMismatchException e) {
			// TODO: handle exception
			   System.out.println("Must be enter double number");
			   
		}
		  /* catch (Exception e) {
			// TODO: handle exception
		}*/
		   catch(Exception e) {
			   e.printStackTrace();
			   System.out.println("Exit");
		   }
		   finally{
			   System.out.println("Done!");
		   }
		   
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   sum(5, 6);
	}

}
