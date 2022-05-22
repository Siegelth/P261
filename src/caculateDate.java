import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class caculateDate {
    public static void main(String[] args) throws Exception {

        System.out.println("start");
        Scanner input = new Scanner(System.in);
            int stYear = input.nextInt();
            int stMonth = input.nextInt();
            int stDay = input.nextInt();
        LocalDate startDate = LocalDate.of(stYear, stMonth, stDay);

        System.out.println("end");
            int edYear = input.nextInt();
            int edMonth = input.nextInt();
            int edDay = input.nextInt();
        LocalDate endDate = LocalDate.of(edYear, edMonth, edDay);
        input.close();

        Long theDays = startDate.until(endDate,ChronoUnit.DAYS);
        System.out.println(theDays);
    }
}
