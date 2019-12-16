package find_age;
import java.util.Calendar;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Your Year Birthday:");
		int year=in.nextInt();
		int year_cal=Calendar.getInstance().get(Calendar.YEAR);
	System.out.println("Enter Your Month Birthday:");
		int month=in.nextInt();
		int month_cal=Calendar.getInstance().get(Calendar.MONTH);
		System.out.println("Enter Your Day Birthday:");
		int day=in.nextInt();
		int day_cal=Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		System.out.println("Your Age: "+Math.abs(year_cal-year)+" Years and "+Math.abs(month_cal-month)+" Monthes and "+Math.abs(day_cal-day)+" Days");
		System.out.println("Thank you");
		
	}

}
