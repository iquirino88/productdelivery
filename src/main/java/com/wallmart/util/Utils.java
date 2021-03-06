package com.wallmart.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Utils {
	
	public static double round(Double value) {
	    return round(value,2);
	}
	
	private static double round(Double value, int places) {
	    if (value == null || places < 0) 
	    {
	    	throw new IllegalArgumentException();
	    }
	    BigDecimal bd = new BigDecimal(value.toString());
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
	
}
