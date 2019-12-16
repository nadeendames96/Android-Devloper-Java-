package inested_classes;

public class vehicle {

	static class car{
		int speed;
		String color;
		public String getColor() {
			return color;
		}
		public int getSpeed() {
			return speed;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     car c=new car();
     c.speed=120;
     c.color="Black";
      System.out.println(c.getSpeed());
      System.out.println(c.getColor());
     
     
	}

}
