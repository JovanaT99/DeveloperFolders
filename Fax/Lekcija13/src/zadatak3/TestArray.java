package zadatak3;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi ime:");
        String ime = scanner.nextLine();

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Pera");
        lista.add(ime);

        lista.add(scanner.nextLine());

       for(String s:lista){
           System.out.println(s);
       }

    }
}
