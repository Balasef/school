public class Test {
    public static void main(String[] args) {


        String str = "saLAm neCEsen Ne vAR ne YoX";
        boolean boshlluq = true;
        String s;
        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            s = str.substring(i, i + 1);
            if (boshlluq) s = s.toUpperCase();
            else s = s.toLowerCase();
            if (s.equals(" ")) boshlluq = true;
            else boshlluq = false;
            str2 = str2 + s;
        }
        System.out.println("str2 = " + str2);
//
        //


        int[] say = new int[]{13, 42, 41, 78, 46, 98, 12, 35};
        int enBoyukSay = say[0];
        int sira = 0;
        for (int i = 0; i < say.length; i++) {
            if (say[i] > enBoyukSay) {
                enBoyukSay = say[i];
                sira = i;
            }
        }
        System.out.println("enBoyukSay = " + enBoyukSay);
        System.out.println(sira);
//
        //
        //
        //

        int[] ballar = new int[]{21, 54, 87, 80, 65, 32, 25, 36, 74};
        int sonrakiBallar;
        for (int i = 0; i < ballar.length; i++) {
            sonrakiBallar = ballar[i] + 10;
            System.out.print(sonrakiBallar + "  ");
        }

        System.out.println("");


        int[] deyer = new int[]{21, 54, 87, 80, 65, 32, 25, 36, 74};

        for (int i = 10; i < deyer.length; i--) {

            int ters = deyer[i];
            System.out.println(ters);
        }


    }
}

