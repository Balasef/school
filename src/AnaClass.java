import java.sql.SQLOutput;
import java.util.Arrays;

public class AnaClass {
    public static void main(String[] args) {

        Adresss adr = new Adresss();
        Student std = new Student();


        std.ad = "hasan";
        std.sheher = "baku";
        std.soyad = "hasanli";
        std.unvan = "inqilab";
        System.out.println("std = " + std.unvan + "  " + std.sheher + " " + std.ad + " " + std.soyad);
        System.out.println(adr);
    }
}