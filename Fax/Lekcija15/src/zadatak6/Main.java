package zadatak6;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Tacka> tackas = new ArrayList<>();
        tackas.add(new Tacka(2, 3));
        tackas.add(new Tacka(3, 8));
        tackas.add(new ObojenaTacka(3, 5, "Crna"));
        tackas.add(new ObojenaTacka(7, 11, "Zuta"));
        tackas.add(new Tacka3D(2, 3, 7));
        tackas.add(new Tacka3D(2, 5, 4));

        for (Tacka tacka : tackas) {
            System.out.println(tacka);
        }
        for (Tacka tacka : tackas) {
            DecimalFormat decimalFormal = new DecimalFormat("0.00");
            String result = decimalFormal.format(tacka.rastjanjeKoordiantnog());
            System.out.println("Zaokruzeno:" + result);
            System.out.println("Ovo dole nije zaoruzeno");
            System.out.println(tacka + " /" + tacka.rastjanjeKoordiantnog());
        }
    }
}
