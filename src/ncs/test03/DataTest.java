package ncs.test03;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Formatter;
import java.util.GregorianCalendar;


	

public class DataTest {

	public static void main(String[] args) {
		
		int nYear;
		int nMonth;
		int nDay;

		Calendar calendar = new GregorianCalendar();
		nYear = calendar.get(Calendar.YEAR);
		nMonth = calendar.get(Calendar.MONTH) + 1;
		nDay = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("GregorianCalendar = " + nYear + "-"
				+ nMonth + "-" + nDay);
			String now=nYear+"-"+nMonth+"-"+nDay;
		
			String start = "1987-05-27";
			String end = now;
			
		
				
				// 시간차이를 시간,분,초를 곱한 값으로 나누면 하루 단위가 나옴
				long diff = endDate.getTime() - beginDate.getTime();
				long diffDays = diff / (24 * 60 * 60 * 1000);

				System.out.println("날짜차이=" + diffDays);
				
		
		}
	
}
	
