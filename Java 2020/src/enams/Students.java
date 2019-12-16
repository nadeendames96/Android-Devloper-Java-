package enams;

public class Students {
	   
	public String firstname;
	public String lastname;
	gender type;
	
	public Students(String firstame,String lastname,gender type) {
		// TODO Auto-generated constructor stub
		this.firstname=firstame;
		this.lastname=lastname;
		this.type=type;
	}
	
	void Display() {
		System.out.println("FirstName: "+firstname+" "+"LastName: "+lastname+"Gender Type is: "+type);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students student=new Students("Nadeen"+" ","Dames"+" ",gender.female);
		student.Display();
         
	}

}
