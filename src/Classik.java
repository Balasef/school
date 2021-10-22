import java.util.Scanner;

public class Classik {

    public static void main(String[] args) {

        System.out.print("sira=>");
        Scanner sc = new Scanner(System.in);
        int sira = sc.nextInt();
        int say = 1;
        for (int i = 1; i <= sira; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(say+" ");
                say++;
            }
            System.out.println();

        }


        System.out.print("piramida ededi  =>");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            for (int i = 1; i <= a; i++){

                for (int j = a; j > i; j--){
                    System.out.print(" ");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print(i + " ");
                }
                System.out.println(" ");
            }
        }
    }
