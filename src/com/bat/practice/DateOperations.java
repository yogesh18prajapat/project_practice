package com.bat.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateOperations {
	
	private static Calendar CALENDAR = Calendar.getInstance();
	public static void main(String[] args) throws ParseException {

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

		execute();
		validateDate();

	}

	private static void execute() {

//		final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
		Date date = new Date();
		CALENDAR.setTime(date);
		CALENDAR.add(Calendar.YEAR, -1);
		CALENDAR.add(Calendar.MONTH, -6);
		CALENDAR.add(Calendar.HOUR, -10);
		Date ACTIVATION_DATE = CALENDAR.getTime();
		CALENDAR.setTime(ACTIVATION_DATE);
		CALENDAR.add(Calendar.YEAR, 1);
		Date EXPIRY_DATE = CALENDAR.getTime();
		Date NEW_EXPIRY_DATE = null;
		Date CURRENT_DATE = new Date();

//		print("EXPIRY_DATE", sdf.format(EXPIRY_DATE));
//		print("ACTIVATION_DATE", sdf.format(ACTIVATION_DATE));
//		print("CURRENT_DATE", sdf.format(CURRENT_DATE));

//		Calendar cal = Calendar.getInstance();
		CALENDAR.setTime(ACTIVATION_DATE);
		CALENDAR.add(Calendar.MONTH, 24);
		Date MAX_EXPIRY_DATE = CALENDAR.getTime();
		NEW_EXPIRY_DATE = getUpdateExpiryDate(EXPIRY_DATE,MAX_EXPIRY_DATE);

		print("CURRENT_DATE",CURRENT_DATE);
		print("ACTIVATION_DATE",ACTIVATION_DATE);
		print("EXPIRY_DATE",EXPIRY_DATE);
		print("MAX_EXPIRY_DATE",MAX_EXPIRY_DATE);
		print("NEW_EXPIRY_DATE",NEW_EXPIRY_DATE);
			
	}

	private static void print(final String message,Object object) {
//		if(object.getClass().equals(Date.class)) {
//			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
//			object = formatter.format(object);
//		}
		System.out.println(message + " : " + object);
	}
	
	private static Date getUpdateExpiryDate(Date expiryDate, Date maxExpiryDate) {
		Date newExpiryDate = expiryDate;
		CALENDAR.setTime(expiryDate);
		CALENDAR.add(Calendar.MONTH, 3);
		newExpiryDate = CALENDAR.getTime();
	
		if(newExpiryDate.compareTo(maxExpiryDate) >= 0) {
			newExpiryDate = maxExpiryDate;
			print("Can't extend 3 months, you card validity has been update upto max expiry","");
		}
		return newExpiryDate;
	}
	
	private static Date getDateByString(final String date_string) {
	       SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");      
	      try {
			return formatter.parse(date_string);
		} catch (ParseException e) {
			e.printStackTrace();
			return new Date();
		}      
	}
	
	private static void validateDate() {
	// Validating for different time zone but same date
		Date date = new Date();
		CALENDAR.setTime(date);
		CALENDAR.add(Calendar.HOUR, 2);
		Date newDate = CALENDAR.getTime();
		
		System.out.println("Difference of date.compareTo(newDate): " + date.compareTo(newDate));

	}
	
}
