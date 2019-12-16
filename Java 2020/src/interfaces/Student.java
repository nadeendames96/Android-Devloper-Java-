package interfaces;

public class Student extends University implements info {
    public String firstname;
    public String lastname;
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return firstname+" "+lastname;
	}
    

    
}
