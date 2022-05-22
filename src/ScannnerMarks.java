import java.util.Scanner;

public class ScannnerMarks {
    ScannnerMarks(){};//构造函数
    public static void main(String[] args) throws Exception {
        String marksString = " 数学87分,物理76分,英语96分";
        Scanner scan = new Scanner(marksString);
            scan.useDelimiter("[^0123456789]+");
            double sum = 0;
            int countingTimes = 0;
            while(scan.hasNext()){
                int Marks = scan.nextInt();
                sum = sum + Marks;
                countingTimes++;
                System.out.println(Marks);
            }
        scan.close();//关闭scanner
            System.out.println("平均分为"+sum/countingTimes);//平均分结果保留小数部分
    }
}
