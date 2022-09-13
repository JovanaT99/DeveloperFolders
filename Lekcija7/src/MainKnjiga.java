import java.util.Scanner;

public class MainKnjiga {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi");
        String naslov = scanner.nextLine();
        System.out.println("Unesi");
        String sadrzaj = scanner.nextLine();
        System.out.println("Unesi");
        String autor = scanner.nextLine();
        System.out.println("Unesi");
        int godina = scanner.nextInt();
        Knjiga13 knjiga13 = new Knjiga13(naslov, sadrzaj, autor, godina);
        System.out.println(knjiga13);
        System.out.println("Unesi novu god:");
        knjiga13.setGodinaIzdanja(scanner.nextInt());
        System.out.println(knjiga13);
    }
}
