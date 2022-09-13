import java.util.Scanner;

public class GraniceMain {

    public static void main(String[] args) {


        Scanner unos = new Scanner(System.in);
        System.out.println("Unesi donju gr");
        int donjaGranica = unos.nextInt();
        System.out.println("Unesi gornjuGr:");
        int gornjaGranica = unos.nextInt();
        System.out.println("Unesi korak:");
        int korak = unos.nextInt();

        System.out.println(donjaGranica);
        while (donjaGranica +korak<= gornjaGranica) {
            donjaGranica += korak;
            System.out.println(donjaGranica+ ",");
        }
    }
}
