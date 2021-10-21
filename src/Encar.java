import java.util.Arrays;
import java.util.Scanner;

public class Encar {
    public static void main(String[] args) {


        int[] numbers = new int[]{56,211,132,56,97};
        double cem = 0;
        for (int i = 0; i < numbers.length; i++)
            cem = cem + numbers[i];

        double orta = cem / numbers.length;
        System.out.println(orta);


    }
}