package com.bat.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class MyDate {
	
	
	public static void main(String[] args) throws ParseException {
//		Date date = new Date();
//		date.toLocaleString();
//		
//		System.out.println(date.toLocaleString());
//		
//		
//		Date d = new Date();
//		LocalDate localDate = LocalDate.now();
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
//		String format = sdf.format(d);
		
//		final String stringPayload = String.format("{" + "\"TransactionTypeId\": 306," + "\"InputType\": \"1\"," + "\"Cards\": ["
//				+ "{" + "\"CardNumber\": \"%s\"" + "}" + "]" + "}", 1234567890);
//		System.out.println(stringPayload);
		
//		String date_string = "2023-09-27T17:37:02+05:30";
//		System.out.println("date_string : "+ date_string);
//				//Instantiating the SimpleDateFormat class
//				SimpleDateFormat formatter = new SimpleDateFormat("YYYY-mm-dd");
//				//Parsing the given String to Date object
//				Date dateObject = formatter.parse(date_string);
//				System.out.println("dateObject : "+ dateObject);
//				final SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
//				String formatted_Date = sdf.format(dateObject);
//				System.out.println("formatted_Date : "+formatted_Date);
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(dateObject);
//		System.out.println("Calendar.DATE : "+cal.get(Calendar.DATE));
//		System.out.println("Calendar.MONTH : "+cal.get(Calendar.MONTH));
//		cal.add(Calendar.MONTH, 3);
//		cal.add(Calendar.DATE, 20);
//		System.out.println("After ADDing.....................................");
//		System.out.println("Calendar.MONTH : "+cal.get(Calendar.MONTH));
//		System.out.println("Calendar.DATE : "+cal.get(Calendar.DATE));
				
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		System.out.println(calendar.getTimeInMillis());
		
		
		
		

		
		
	}
		

}
