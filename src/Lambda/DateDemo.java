package Lambda;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate d= LocalDate.now();
		System.out.println("Today is "+d);
		LocalDate p= LocalDate.of(1991, Month.JULY, 14);
		System.out.println("DOB is" +p);
		
       LocalTime l=LocalTime.now();
       System.out.println("Local Time is "+l);
       
       for(String s : ZoneId.getAvailableZoneIds()){
    	   System.out.println(s);
       }

	}

}
