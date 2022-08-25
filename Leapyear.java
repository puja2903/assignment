package Operator;

public class Leapyear {

	public static void main(String[] args) {
	    int year = 1900;
	    boolean leapyear = false;
	    if (year % 4 == 0) { // if the year is divided by 4
	      if (year % 100 == 0) {// if the year is century
 // if year is divided by 400 then it is a leap year
	        if (year % 400 == 0)
	          leapyear = true;
	        else
	          leapyear = false;
	      }
	      
	    else
	        leapyear = true;
	    }
	    
	    else
	      leapyear = false;

	    if (leapyear)
	      System.out.println(year + " is a leap year.");
	    else
	      System.out.println(year + " is not a leap year.");

	}

}
