package overload;

import java.util.Scanner;

public class Number {

	//Overload The Same Data Type but smae operartor but the differand number of parameters
	
	  public static int Num1(int num1,int num2,int num4){
		  //System.out.println(num1-num2);
		  return num1-num2-num4;
		  
		  
	  }
	  public static int Num1() {
		// TODO Auto-generated method stub
		  Scanner s=new Scanner(System.in);
		  System.out.println("Enter Num1 & Num2");
		  int num1=s.nextInt();
		  int num2=s.nextInt();
        //System.out.println(num1*num2);
		  int res=num1*num2;
		  return res;
	}
	  public static int Num1(int num) {
		  return (int)num;
	  }
	  public static int Num1(int num1,int num2,int num3,int num4) {
		  return ((int)num1+(int)num2+(int)num3)+(int)num4;
	  }
	  
	public static void main(String[] args) {
		 int sum=Num1(3,5,6,98);
		 Num1(10,5,4);
		 int mult=Num1();
		 
	}

}
