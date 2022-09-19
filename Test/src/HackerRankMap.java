
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi broj:");
        int n = scanner.nextInt();
        String ime;
        scanner.nextLine();
        String telefon;
        String pretraga;
        HashMap<String, String> lista = new HashMap<>();


        for (int i = 0; i < n; i++) {
            System.out.println("Unesi ime");
            ime = scanner.nextLine();
            System.out.println("Unesi telefon:");
            telefon = scanner.nextLine();

            if (telefon.charAt(0) == '0') {
                telefon = telefon.substring(1);
            }
            if (verify(ime, telefon)) {
                lista.put(ime, telefon);
            }
        }

        //lista.forEach((k, v) -> System.out.println("key: " + k + " value:" + v));

        for (int i = 0; i < n; i++) {
            System.out.println("Unesi pretragu:");
            pretraga = scanner.nextLine();

            String finalPretraga = pretraga;
            lista.forEach((key, value) -> {

                if (key.equals(finalPretraga)) {

                    System.out.println(key + " " + value);
                }
            });
       }
    }
    public static boolean verify(String ime, String telefon) {

        boolean valid = true;
//        if (!ime.equals(String.format("%s", "Amar Singh"))) {
//            valid = false;
//        }
        if (!ime.toLowerCase(Locale.ROOT).equals(ime)) {
            valid = false;
        }
        if (telefon.length() != 8) {
            valid = false;
        }

        return valid;

    }
}


