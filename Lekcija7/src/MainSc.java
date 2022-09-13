import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MainSc {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi ime");
        String ime = scanner.nextLine();
        System.out.println("Unesi prezime:");
        String prezime = scanner.nextLine();
        System.out.println("Unesi godine:");
        int godine = scanner.nextInt();

        OsobaSC osobaSC = new OsobaSC(ime, prezime, godine);
        OsobaSC osobaSC1=new OsobaSC("Jovana", "Blagojevic", 23);
        OsobaSC osobaSC2=new OsobaSC("Jovana", "Blagojevic", 23);

        System.out.println(osobaSC);


        for(int i=0; i<35; i++){

            osobaSC.ostari();
        }
        System.out.println(osobaSC);


        int zbir=osobaSC.getGodine()+ osobaSC1.getGodine()+ osobaSC2.getGodine();
        System.out.println(zbir);

        double prosek=zbir/3.0;

        System.out.println(prosek);
    }
}
