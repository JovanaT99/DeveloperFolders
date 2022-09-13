import java.util.ArrayList;
import java.util.Scanner;

public class MainArr8 {

    public static void main(String[] args) {


        ArrayList<String> programskiJezici = new ArrayList<>();
        programskiJezici.add("Java");
        programskiJezici.add("C++");
        programskiJezici.add("c#");
        programskiJezici.add("PHP");
        programskiJezici.add("Java Script");


        for (int i = 0; i < programskiJezici.size(); i++) {
            System.out.println((i + 1) + "." + programskiJezici.get(i));
        }

        ArrayList<String> imena = new ArrayList<>();
        System.out.println("Unesi imena(prazan red je prekid))");

        Scanner scanner = new Scanner(System.in);
       /* String ime = scanner.nextLine();

        while (ime.length() > 0) {

            imena.add(ime);
            ime = scanner.nextLine();
        }*/
        unosImena(imena,scanner);
        prikazImena(imena);
    }

    public static void unosImena(ArrayList<String> imena, Scanner scanner) {

        String ime = scanner.nextLine();

        while (ime.length() > 0) {

            imena.add(ime);
            ime = scanner.nextLine();
        }
    }
        public static void prikazImena(ArrayList<String> lista){
            for(String ime: lista){
                System.out.println(ime);
            }

        }


    }

