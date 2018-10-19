package com.tomtom.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {
	
	public static boolean isEmpty(String val){
		if(null == val || val.length() == 0 || val.toLowerCase().equals("n/a") || val.toLowerCase().equals("na") || val.toLowerCase().equals("null") || val.equals(" "))
			return true;
		else
			return false;
	}
	
	public static boolean isValid(String s) 
    { 
        Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");        
        Matcher m = p.matcher(s); 
        return (m.find() && m.group().equals(s)); 
    } 
}
