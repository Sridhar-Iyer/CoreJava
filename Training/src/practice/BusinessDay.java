package practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


// Netflix interview question

/*
 * 
 * Write a business_day_from_now method which takes number as an input
 * and returns a date object which is that many days from now.
 * for this business day is only a weekday and not a weekend.
 * 
 */
public class BusinessDay {

	public static void main(String[] args) {
		
		Date date = new Date(); 
		SimpleDateFormat finalDate = new SimpleDateFormat("MM/dd/YYYY");
		date = businessDayFromNow(16);
		System.out.println(finalDate.format(date));

	}
	
	
	public static Date businessDayFromNow( Integer days) {
		
		Calendar calendar = Calendar.getInstance();
		Date date = new Date();
		calendar.setTime(date);

        for(Integer day = 0; day < days; day++) {
        	calendar.add(Calendar.DAY_OF_WEEK, 1);
        	while(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ){
        		calendar.add(Calendar.DAY_OF_WEEK, 1);
        	}
        }
		
        return calendar.getTime();
	}

}
