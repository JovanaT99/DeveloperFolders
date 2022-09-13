import java.util.Scanner;

public class MainPatern {

    public static void main(String[] args) {

        int brojredova;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite broj redova:");
        brojredova = scanner.nextInt();

        for (int red = 0; red <= brojredova; red++) {
            for (int brojZvezdica = 1; brojZvezdica <=red; brojZvezdica++) {

                System.out.print(" "+ "*");
            }

            System.out.println();
        }

    }
}
