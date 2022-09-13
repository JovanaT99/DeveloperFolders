public class Mainn84 {

    public static void main(String[] args) {
        System.out.println(duzinaString("kuca"));
        karakterpoKarakter("Ovo je nekitekst");
        rakarterObrnuto("Ovo je neki drugi btekst");
    }

    public static int duzinaString(String rec) {
        return rec.length();
    }

    public static void karakterpoKarakter(String rec) {

        for (int i = 0; i < duzinaString(rec); i++) {

            System.out.println(rec.charAt(i));
        }
    }
    public static void rakarterObrnuto(String tekst){



        for(int i=duzinaString(tekst)-1; i>=0; i--){

            System.out.println(tekst.charAt(i));
        }
    }



}
