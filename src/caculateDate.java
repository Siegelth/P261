import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class caculateDate {
    caculateDate(){};
    public static void main(String[] args) throws Exception {
        int[] group = new int[3];
        System.out.println("start");
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i <= 2 ; i++){
            group[i] = input.nextInt();
        }
        LocalDate startDate = LocalDate.of( group[0], group[1] , group[2]);

        System.out.println("end");
        for(int i = 0 ; i <= 2 ; i++){
            group[i] = input.nextInt();
        }
        LocalDate endDate = LocalDate.of( group[0], group[1] , group[2]);

        input.close();

        Long theDays = startDate.until(endDate,ChronoUnit.DAYS);
        System.out.println(theDays);
    }
}
