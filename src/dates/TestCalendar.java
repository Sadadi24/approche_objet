package dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Calendar calendar1 = Calendar.getInstance();
	        calendar1.set(2016, Calendar.MAY, 19, 23, 59, 30);
	        Date date1 = calendar1.getTime();
	        System.out.println(date1);
	        
	        Calendar calendar2 = Calendar.getInstance();
	        Date date2 = calendar2.getTime();
	        SimpleDateFormat date2Format= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss",Locale.FRANCE);
	        String date2ToString = date2Format.format(date2);
	        SimpleDateFormat date2Format2= new SimpleDateFormat(" 'lE ' EEEE dd MMMM yyyy  'a'  HH'h':mm:ss",Locale.FRANCE);
	        String date2ToString2 = date2Format2.format(date2);
	        
	        System.out.println("Format Francais");
	        //System.out.println(date2ToString);
	        System.out.println(date2ToString2);
	        System.out.println("Format Allemand");
	        
	        SimpleDateFormat date2Format3= new SimpleDateFormat(" 'lE ' EEEE dd MMMM yyyy  'a'  HH'h':mm:ss",Locale.GERMAN);
	        String date2ToString3 = date2Format3.format(date2);
	        System.out.println(date2ToString3);
	        
	        System.out.println(" Format Chinois");
	        SimpleDateFormat date2Format4= new SimpleDateFormat(" EEEEE dd MMMM yyyy  HH'h':mm:ss",Locale.CHINA);
	        String date2ToString4 = date2Format4.format(date2);
	        System.out.println(date2ToString4);
	        
	        System.out.println(" Format Russe");
	        SimpleDateFormat date2Format5= new SimpleDateFormat(" EEEE dd MMMM yyyy HH'h':mm:ss",new Locale("ru", "RU"));
	        String date2ToString5 = date2Format5.format(date2);
	        System.out.println(date2ToString5);
	       
	        System.out.println(" Format Us");
	        SimpleDateFormat date2Format6= new SimpleDateFormat(" EEEE dd MMMM yyyy HH'h':mm:ss",Locale.US);
	        String date2ToString6 = date2Format6.format(date2);
	        System.out.println(date2ToString6);
	
	}

}
