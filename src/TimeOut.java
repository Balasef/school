import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeOut {

    public static void main(String[] args) {

        Scanner N = new Scanner(System.in);
        System.out.print("n=");
        int a = N.nextInt();
        boolean b = false;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                b = true;
                break;
            }

        }

        if (b) {
            System.out.println("murekkeb");
        } else {
            System.out.println("sade");
        }
    }
}
