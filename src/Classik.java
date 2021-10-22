import java.util.Scanner;

public class Classik {

    public static void main(String[] args) {

        System.out.print("sira");
        Scanner sc = new Scanner(System.in);
        int sira = sc.nextInt();
        int say = 1;
        for (int i = 1; i <= sira; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(say);
                say++;
            }
            System.out.println();
        }
    }
}