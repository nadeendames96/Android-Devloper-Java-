package polymorephism;

import java.util.Scanner;

public class Slouation {
	//Diffeants DataTypes and Parameters but the same number of elements parameters
	  public static void Num1(int num1,int num2,int num4){
		  System.out.println(num1-num2);
		  return;   
	  }
	  public static void Num1(double num1,int num2,String name){
		  System.out.println(num1-num2);
		  return; 
	  }
	  public static double Num1() {
		// TODO Auto-generated method stub
		  Scanner s=new Scanner(System.in);
		  System.out.println("Enter Num1 & Num2");
		  int num1=s.nextInt();
		  int num2=s.nextInt();
        //System.out.println(num1*num2);
		  int res=num1*num2;
		  return res;
	}
	  public static double  Num1(float num) {
		
		  return num;  
	  }
	  public static int Num1(double num1,double num2,double num3) {
		  return ((int)num1+(int)num2+(int)num3);
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=Num1(3.5,5.00,6.96);
		 Num1(10,5,4);
		 double mult=Num1();
		 double num=Num1(10.4f);

	}

}
