package fall2023.week5;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PrintCalendar {
	int year;
	int month;
	YearMonth yearMonthObject;

	public static void main(String[] args) {
		PrintCalendar pc = new PrintCalendar();
		pc.readInput();
		pc.printMonth();

	}
	
	public void readInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter full year (e.g 2001)");
		year = scanner.nextInt();
		System.out.println("Enter month in number 1-12:");
		month = scanner.nextInt();
		yearMonthObject = YearMonth.of(year, month);
	}
	
	public void printMonth() {
		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu" , "Fri", "Sat" };
		printCalendarTitle();
		
		for (int i=0; i< days.length; i++) {
			System.out.print(days[i] + " ");
		}
		
		int totalDays = getTotalNumOfDays();
	}
	
	public void printCalendarTitle() {
		String title = yearMonthObject.format(DateTimeFormatter.ofPattern("MMMM uuuu"));
		System.out.println(" ---- " + title + " ----------");
	}
	
	public int getStartDay(int year, int month) {
		return yearMonthObject.atDay(1).getDayOfWeek().getValue();
	}
	public int getTotalNumOfDays() {
        return yearMonthObject.lengthOfMonth();
	}
	
	public boolean isLeapYear(int year) {
		boolean isLeapYear;

	    // divisible by 4
	    isLeapYear = (year % 4 == 0);

	    // divisible by 4, not by 100, or divisible by 400
	    isLeapYear = isLeapYear && (year % 100 != 0 || year % 400 == 0);
	    return isLeapYear;
	}

}
