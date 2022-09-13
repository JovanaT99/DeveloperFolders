import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main133 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi ime:");
        String unos = scanner.nextLine();
        String ime = "Pera Peric";

        ArrayList<String> imena = new ArrayList<>();
        imena.add(ime);
        imena.add("Jova Jovic");
        imena.add(unos);

        for (String name : imena) {
            System.out.println(name);
        }

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        String pattern="0.00";
        DecimalFormat decimalFormat=new DecimalFormat(pattern);
        double a = 0.39;
        double b = 0.35;
        System.out.println(decimalFormat.format(a - b));
    }
}
