import java.util.ArrayList;
import java.util.Scanner;

public class Main74 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      /*  System.out.println("Unesi 4 imena:");

        String ime1 = scanner.nextLine();
        String ime2 = scanner.nextLine();
        String ime3 = scanner.nextLine();
        String ime4 = scanner.nextLine();

        System.out.println(ime1 + " " + ime2 + " " + ime3 + "" + ime4);
*/
        ArrayList<String> imena = new ArrayList<>();

        System.out.println("Unesite 10 imena");

  /*      imena.add(scanner.nextLine());
        imena.add(scanner.nextLine());
        imena.add(scanner.nextLine());
        imena.add(scanner.nextLine());
        imena.add(scanner.nextLine());
        imena.add(scanner.nextLine());
        imena.add(scanner.nextLine());
        imena.add(scanner.nextLine());
        imena.add(scanner.nextLine());
        imena.add(scanner.nextLine());

*/
        for (int i = 0; i < 10; i++) {
            imena.add(scanner.nextLine());
        }
        imena.add("Zika");
        System.out.println("Lista ima" + imena.size());
        System.out.println("Drugo ime u listi" + imena.get(1));
        System.out.println("Prvo ime:" + imena.get(0));
        int broj = imena.size();
        System.out.println("Zadnje ime" + imena.get(broj - 1));
        imena.add("Stokan");
        broj = imena.size();
        System.out.println("Zadnje ime;" + imena.get(broj - 1));

        imena.add("Stojan");
        imena.remove("Stojan");
        imena.remove(1);
        System.out.println("Lista ima:" + imena.size() + " elemenata");
        String ime = scanner.nextLine();

        if (imena.contains(ime)) {
            System.out.println("U listi se nalazi ime:" + ime);
        } else {
            System.out.println("U listi se ne nelazin ime" + ime);
        }


    }
}
