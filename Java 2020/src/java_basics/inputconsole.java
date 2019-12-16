package java_basics;

  import java.util.*;
public class inputconsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     System.out.println("Please Enter Your FullName:");
     String name=s.nextLine();
     System.out.println("Please Enter Your Age:");
     String age=s.nextLine();
     int age_parse=Integer.parseInt(age);
     System.out.println("Please Enter Your ID Number:");
     long id=s.nextLong();
     System.out.println("Will Print Your Information...");
     System.out.println("Your Name's:"+name);
     System.out.println("Your Age's:"+age_parse+" Years");
     System.out.println("Your ID Number's:"+id);
     System.out.println("Thank You...!");
	}

}
