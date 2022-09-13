package zadatak2;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String naslov=scanner.nextLine();
        String sadrzaj=scanner.nextLine();
        String autor=scanner.nextLine();
        int godinaIzdanja=scanner.nextInt();

        Knjiga knjiga=new Knjiga(naslov,sadrzaj,autor,godinaIzdanja);
        System.out.println(knjiga);

        System.out.println("Unesi novu godinu izdanja:");
        knjiga.setGodinaIzdanja(scanner.nextInt());
        System.out.println(knjiga);


    }
}
