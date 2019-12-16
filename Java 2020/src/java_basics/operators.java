package java_basics;

public class operators {
   public static void main(String[]args) {
    	int num1=5;
    	int num2=10;
    	int res=num1+num2;
    	System.out.println("Sum ="+res);
    
    	res=num1-num2;
    	System.out.println("Subtract ="+res);
    	
    	
    	res=num1*num2;
    	System.out.println("Multpel = "+res);
    	
    	res=num1/num2;
    	System.out.println("Divide = "+res);
    	
    	res=num1%num2;
    	System.out.println("Module = "+res);
    	System.out.println();
    	
    	res+=num1;
    	System.out.println(res);
    	res-=num2;
        System.out.println(res);
        System.out.println();
        
    	num1++;
    	num2--;
    	System.out.println(num1);
    	System.out.println(num2);
    	System.out.println();
    	
    	System.out.println(++num1);
    	System.out.println(num1++);
    	System.out.println(--num2);
    	System.out.println(num2--);
    	System.out.println();
    	System.out.println(num1);
    	System.out.println(num2);
    	
    	
    	System.out.println();
    	int res2=(num1+num2)/(num1^2)*(num2^3)%10+num1-num2;
    	System.out.println(res2);
    	
    	//Pariotes
    	/*
    	 * (                )
    	 *           ^
    	 * /    *       %
    	 * + -
    	 * from left to right in english 
    	 * from right to left in arabic
    	 */
    	
    
    }
}
