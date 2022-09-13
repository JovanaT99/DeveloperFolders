import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner unos = new Scanner(System.in);
        System.out.println("Unesi svoju visinu (cm):");
        int visina = unos.nextInt();
        System.out.println("Unesi svoju telesnu masu (kg):");
        int telesnaMasa = unos.nextInt();


        double visinaMetri=visina/100.0;
        double BMI = telesnaMasa /(visinaMetri*visinaMetri);
        System.out.println(BMI);

        if (BMI < 18.5) {

            System.out.println("Neuhranjenost");
        }
       else if ( BMI < 25) {
            System.out.println("Normalna uhranjenost");
        }
        else if (BMI < 30) {

            System.out.println("Pregojaznost");
        }
        else {

            System.out.println("Gojaznost" + BMI);
        }


    }
}
