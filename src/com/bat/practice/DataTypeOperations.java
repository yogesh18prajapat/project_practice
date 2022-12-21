package com.bat.practice;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class DataTypeOperations {
	
	private static Locale INDIA = new Locale("en","IN");
	private static Locale USA = new Locale("en","US");
	private static Locale GERMANY = new Locale("de","DE");
	private static Locale  JAPAN = new Locale("jp","JP");

	
	public static void main(String[] args) {
		
		
//		Double d = 100.05;
		BigDecimal b = BigDecimal.valueOf(100);
		
		Double d = Double.valueOf(100);
		
		System.out.println("BigDecimal b : "+b);
		System.out.println("Double d : "+d);
		
//		 String india = NumberFormat.getCurrencyInstance(USA).format(10);
//		 System.out.println(india);
		
		
		printFormattedValue(1000.0,INDIA);
		printFormattedValue(1000.0,USA);
		printFormattedValue(1000.0,GERMANY);
		printFormattedValue(1000.0,JAPAN);
		
				
		
 }
	private static void printFormattedValue(final Double amount, final Locale locale) {
//		DecimalFormat deciamlFormat = (DecimalFormat) DecimalFormat.getCurrencyInstance(locale);
//		DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance(INDIA);
//		dfs.setCurrencySymbol("\u20B9");
//		deciamlFormat.setDecimalFormatSymbols(dfs);
//		String formattedValue = deciamlFormat.format(100);
		System.out.println(NumberFormat.getCurrencyInstance(locale).format(amount));		

	}

}
