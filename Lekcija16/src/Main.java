import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Operacija operacija = new Sabiranje("+");
        List<Operacija> listOperacije = new ArrayList<>();
        listOperacije.add(operacija);
        Operacija operacija1 = new Mnozenje("*");
        Operacija operacij2 = new Deljenje("/");
        Collections.addAll(listOperacije,operacij2,operacija1);
        Scanner scanner = new Scanner(System.in);
        for (Operacija operacijaa : listOperacije) {
            operacija.Izvrsi(scanner);
        }
    }
}
