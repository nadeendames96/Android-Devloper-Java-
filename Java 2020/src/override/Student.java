package override;

public class Student extends University {
    public String firstname;
    public String lastname;
    
    //override
    String getName() {
    	return (firstname+" "+lastname);
    }

}
