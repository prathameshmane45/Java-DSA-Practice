import java.util.Scanner;

public class YearWeekDays {
     public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int Days_in_Week = 7;
        System.out.println("Enter days : ");
        int days = sc.nextInt();
        
        int year = days / 365;
        int week = (days % 365) / Days_in_Week;
        int day = (days % 365) % Days_in_Week;
        System.out.println(year);
        System.out.println(week);
        System.out.println(day);
        
        
    }
}
