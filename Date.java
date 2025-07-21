import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        
        LocalDate d=LocalDate.now();
        System.out.println("Current Date "+d);
        
        LocalDateTime e=LocalDateTime.now();
        System.out.println("Current Date and time "+e);
        
        ZonedDateTime t=ZonedDateTime.now();
        System.out.println("Current Date and time with time zone "+t);
        
        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.now();
        Period diff = Period.between(startDate, endDate);

        System.out.println("Difference: " + diff.getYears() + " years, "
                + diff.getMonths() + " months, " + diff.getDays() + " days");

        //finding weekdays

        int weekdayCount = 0;
        LocalDate tempDate = startDate;

        while (!tempDate.isAfter(endDate)) {
            DayOfWeek day = tempDate.getDayOfWeek();

            // If the day is not Saturday or Sunday, it's a weekday
            if (day != DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY) {
                weekdayCount++;
            }

            tempDate = tempDate.plusDays(1); // move to the next day
        }

        System.out.println("Total weekdays between " + startDate + " and " + endDate + ": " + weekdayCount);

        
        LocalDateTime n = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String form = n.format(formatter);
        System.out.println("Formatted Date and Time: " + form);

        String dateTimeStr = "25-12-2025 10:30:00";
        DateTimeFormatter formated = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, formated);
        System.out.println("Parsed DateTime: " + dateTime);

    
        
    }
}

