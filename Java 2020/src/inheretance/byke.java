package inheretance;

public class byke extends vehicle {
	int speed=40;
	String color="red";
	
	
	   public void getSpeed() {
		System.out.println(super.speed+"  SuperClass(Vehicle)");
		System.out.println(this.speed+"   Subclass(Byke)");
	}

}
