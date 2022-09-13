import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Main103 {


    public static void main(String[] args) {


        String odgovor = "ne";

        do {

            Lutrija lutrija = new Lutrija();
            for (int i = 0; i < 7; i++) {
                lutrija.izvuciBroj();
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("Unesi 7 brojeva:");
            ArrayList<Integer> brojevi = new ArrayList<>();
            for (int i = 0; i < 7; i++) {
                brojevi.add(scanner.nextInt());
            }
            System.out.println(lutrija.brojPogadaka(brojevi));
            System.out.println(lutrija);
            System.out.println("Da li nastavljate:(da, ne)");
            odgovor=scanner.nextLine();

        } while (!odgovor.equals("da"));

    }
}
