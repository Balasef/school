import java.util.Scanner;

public class Asad {


    public static void main(String[] args) {
        int num = 7;
        long fact = 1;
        for (int i = 1; i < num + 1; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
//
//        int n = 100;
//        int cem = 0;
//        for (int i = 1; i < n + 1; i++) {
//            cem = cem + i;
//        }
//        cem = cem - 10;
//        System.out.println(cem);
//
//        int sum = 0;
//        int y = 24;
//        int x = 20;
//        for (int i = x + 1; i < y + 1; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum);
//
//
//        System.out.printf("%5.2s", "*", "");
//        System.out.println("");
//        System.out.printf("%5.2s", "**", "");
//        System.out.println("");
//        System.out.printf("%5.3s", "***", "");
//        System.out.println("");
//        System.out.printf("%5.4s", "****", "");
//        System.out.println("");
//        System.out.printf("%5.5s", "*****", "");
//        System.out.println("");
//

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int IkiyeBolunen = 0;
//        int uceBolunen = 0;
//        int sira2 = 0, sira3 = 0;
//        int cem;
//        double orta3, orta2;
//
//        for (int i = 0; i < N; i++) {
//            cem = sc.nextInt();
//
//            if (cem % 2 == 0) {
//                IkiyeBolunen += cem;
//                sira2++;
//            }
//            if (cem % 3 == 0 && cem % 2 != 0) {
//                uceBolunen += cem;
//                sira3++;
//            }
//
//        }
//        orta2 = 1.0 * IkiyeBolunen / sira2;
//        orta3 = 1.0 * uceBolunen / sira3;
//
//        System.out.printf("%.2f %n", orta2);
//        System.out.printf("%.2f %n", orta3);

        int[] dd = new int[]{10, 32, 52, 45, 12, 32, 62,98, 62, 45, 72};
        int cem = 0;
        int imtahandanKecenler = 0;
        for (int i = 0; i < dd.length; i++) {
            if (dd[i] > 50) {
                cem = cem + dd[i];
                imtahandanKecenler++;
            }
        }
        double orta = 0;
        orta = (double) cem / imtahandanKecenler;
        System.out.println(orta);
        System.out.println(imtahandanKecenler);

        int a = 157;

        System.out.println();


        String str = "saLAM nECeseN ne VaR nE yoX";
        boolean bosluqdanSonrakiHerf = true;
        String s;
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            s = str.substring(i, i + 1);
            if (bosluqdanSonrakiHerf) s = s.toUpperCase();
            else s = s.toLowerCase();
            if (s.equals(" ")) bosluqdanSonrakiHerf = true;
            else bosluqdanSonrakiHerf = false;
            str2 = str2 + s;
        }
        System.out.println(str2);


        int toplam = 0;
        int[] massiv = new int[]{90, 80, 70, 67, 564, 24, 34, 9, 5, 6, 4, 5654, 55, 4};
        for (int value : massiv) {
            toplam = value + toplam;
        }
        System.out.println(toplam);


    }
}
