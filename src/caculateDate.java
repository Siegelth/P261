import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class caculateDate {
    public static void main(String[] args) throws Exception {

        System.out.println("start");
        Scanner input = new Scanner(System.in);
            int Year = input.nextInt();
            int Month = input.nextInt();
            int Day = input.nextInt();
        LocalDate startDate = LocalDate.of(Year, Month, Day);

        System.out.println("end");
            Year = input.nextInt();
            Month = input.nextInt();
            Day = input.nextInt();
        LocalDate endDate = LocalDate.of(Year, Month, Day);
        input.close();

        Long theDays = startDate.until(endDate,ChronoUnit.DAYS);
        System.out.println(theDays);
    }
}
