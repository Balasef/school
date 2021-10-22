import java.util.Scanner;

public class Sarkhan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("3 reqemli eded daxil edin: ");
        int a = scan.nextInt();
        int b = a % 10;
        a = a / 10;
        int c = a % 10;
        a = a/10;
        if (a == 1){
            System.out.print("yuz ");
            System.out.print(onluq(c));
            System.out.print(" ");
            System.out.print(teklik(b));
        }
        else {
            System.out.print(teklik(a));
            System.out.print(" yuz ");
            System.out.print(onluq(c));
            System.out.print(" ");
            System.out.print(teklik(b));
        }

    }

    public static String teklik(int a){
        switch (a){
            case 1:
                System.out.print("bir");
                break;
            case 2:
                System.out.print("iki");
                break;
            case 3:
                System.out.print("uc");
                break;
            case 4:
                System.out.print("dord");
                break;
            case 5:
                System.out.print("bes");
                break;
            case 6:
                System.out.print("alti");
                break;
            case 7:
                System.out.print("yeddi");
                break;
            case 8:
                System.out.print("sekkiz");
                break;
            case 9:
                System.out.print("doqquz");
                break;
            default:
                System.out.print("");
        }
        return "";
    }

    public static String onluq(int a){
        switch (a){
            case 1:
                System.out.print("on");
                break;
            case 2:
                System.out.print("iyirmi");
                break;
            case 3:
                System.out.print("otuz");
                break;
            case 4:
                System.out.print("qirx");
                break;
            case 5:
                System.out.print("elli");
                break;
            case 6:
                System.out.print("altmis");
                break;
            case 7:
                System.out.print("yetmis");
                break;
            case 8:
                System.out.print("seksen");
                break;
            case 9:
                System.out.print("doxsan");
                break;
            default:
                System.out.print("");
        }
        return "";
    }



















}