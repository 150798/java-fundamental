package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTest {
	public DateTest() {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		
		//FORMAT DATE
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MM dd yyyy");
		String formatted = date.format(formatter);
		
		
		//DATE . STRING
		String date2 = "15-Sep-2020";
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate convert = LocalDate.parse(date2, formatter2);
		
		String convertDate = convert.format(formatter);
		
		LocalDate tommorow = date.plusDays(1);
		LocalDate fiveDaysAgo = date.minusDays(5);
		LocalDate threeDaysAgo = LocalDate.now().minusDays(3);		
		
		Integer hari = date.getDayOfMonth();
		Integer hari2 = fiveDaysAgo.getDayOfMonth();
		Integer interval = hari -hari2;
		
		System.out.println("Tanggal hari ini 			 : " + date);
		System.out.println("Tgl setelah di format :" + formatted);
		
		System.out.println("Waktu saat ini				 : " + time);
		System.out.println("Tanggal dan waktu saat ini	 : " + dateTime);
		System.out.println("Besok : " + tommorow);
		System.out.println("5 Hari lalu : " + fiveDaysAgo);
		System.out.println("3 Hari lalu : " + threeDaysAgo);
		System.out.println("Converted : " + convert);
		System.out.println("hari" +hari);
		System.out.println("iterval" +interval);
		System.out.println("Converted :" +convertDate);
	}
	
	public static void main(String[] args) {
		new DateTest();
	}

}
