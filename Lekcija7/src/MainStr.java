import java.util.Scanner;

public class MainStr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite jednu recenicu");
        String recenica = scanner.nextLine();
        System.out.println(recenica.substring(4));
        System.out.println(recenica.substring(2, 8));

        System.out.println(recenica.substring(recenica.lastIndexOf("")));
        System.out.println("Unesi neko slovo");
        char slovo = scanner.nextLine().charAt(0);
        System.out.println(recenica.substring(recenica.indexOf(slovo)));


        System.out.println("Unesi deo recenice:");
        String deoRecenice=scanner.nextLine();
        int pozicijaUnetogDela=recenica.indexOf(deoRecenice);
        if(pozicijaUnetogDela>=0){

            System.out.println(recenica.substring(pozicijaUnetogDela));
        }else{
            System.out.println("Ne postoji takav podstring");
        }


    }
}
