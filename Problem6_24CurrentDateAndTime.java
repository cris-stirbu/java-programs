package programmingExercises;

public class Problem6_24CurrentDateAndTime {

	public static void main(String[] args) {
		long milliseconds=System.currentTimeMillis();
		long seconds=milliseconds/1000;
		long minutes=seconds/60;
		int currentSecond=(int)(seconds%60);
		long hours=minutes/60;
		int currentMinute=(int)(minutes%60);
		long days=hours/24;
		int currentHour=(int)(hours%24);
		System.out.println("Current time "+currentHour+":"+
		currentMinute+":"+currentSecond);

		int firstDay=4;//1 Jan 1970 was Thursday
		int firstYear=1970;
		
		int currentYear=firstYear;
		while(days>364) {
			if((currentYear%4==0&&currentYear%100!=0)||currentYear%400==0)
				days=days-366;
			else 
				days=days-365;
			currentYear++;
		}
		System.out.println("total number of days: "+days);
	   int month=0;
			if(days<=31) month=1;
			else {
		       if((currentYear%4==0&&currentYear%100!=0)||currentYear%400==0) {
		    	if(days<=60) { 
		    		month=2;days=days-31;
		    	}
		    	else if (days<91) {
		    		month=3;days=days-60;
		    	}
		    	else if(days<=121) {
		    		month=4;days=days-91;
		    	}
		    	else if(days<=152) {
		    		month=5;days=days-121;
		    	}
		    	else if(days<=182) {
		    		month=6;days=days-152;
		    	}
		    	else if (days<=213) {
		    		month=7;days=days-182;
		    	}
		    	else if (days<=244) {
		    		month=8;days=days-213;
		    	}
		    	else if(days<=274) {
		    		month=9;days=days-244;
		    	}
		    	else if (days<=305) {
		    		month=10;days=days-274;
		    	}
		    	else if (days<=335) {
		    		month=11;days=days-305;
		    	}
		    	else if(days<=365) {
		    		month=12;days=days-335;
		    	}
		    }//end if
		       else {
		    	   if(days<=59) {
		    		   month=2;days=days-31;
		    	   }
		    	   else if(days<=90) {
		    		   month=3;days=days-59;
		    	   }
		    	   else if(days<=120) {
		    		   month=4;days=days-90;
		    	   }
		    	   else if(days<=151) {
		    		   month=5;days=days-120;
		    	   }
		    	   else if(days<=181) {
		    		   month=6;days=days-151;
		    	   }
		    	   else if(days<=212) {
		    		   month=7;days=days-181;
		    	   }
		    	   else if(days<=243) {
		    		   month=8;days=days-212;
		    	   }
		    	   else if(days<=273) {
		    		   month=9;days=days-243;
		    	   }
		    	   else if(days<=304) {
		    		   month=10; days=days-273;		    		   
		    	   }
		    	   else if(days<=334) {
		    		   month=11;days=days-304;
		    	   }
		    	   else if(days<365) {
		    		   month=12;days=days-334;
		    	   }//end else if
		       }//end else
		}//end else
		
		
		
		System.out.println("Current date:"+
		(days+1)+":"+month+":"+currentYear);
		
		
	}//end main method

}//end class 
