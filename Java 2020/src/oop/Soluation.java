package oop;

public class Soluation {

	public Soluation() {
		// TODO Auto-generated constructor stub
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    OOP oop=new OOP();
    oop.setName("Nadeen");
    //oop.age=25;    //Error Because It's Private
   oop.setAge(23);
   oop.first_char='N';
   oop.id=5558;
   System.out.println("Your Name's: "+oop.getName());
   System.out.println("Your Age's: "+oop.getAge());
   System.out.println("Your First Character: "+oop.first_char);
   System.out.println("Your ID's: "+oop.id);
 	}

}
