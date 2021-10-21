import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeOut {

    public static void main(String[] args) {


        Scanner N = new Scanner(System.in);
        System.out.print("n=");
        int a = N.nextInt();
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println(i + "    murekkeb");
                break;
            } else {
                System.out.println(i + "    sade");

            }

        }
    }
}
