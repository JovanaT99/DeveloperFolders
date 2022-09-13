import osoblje.*;
import savez.SportskoDrustvo;
import savez.Tim;

import java.time.LocalDate;

public class MainSDrustvo {

    public static void main(String[] args) {
        SportskoDrustvo sportskoDrustvo=new SportskoDrustvo("Fudbalski klub SRBIJA","Jevrejska 24");
        Tim tim1 = sportskoDrustvo.dodajTim("Petlici", LocalDate.of(2021,12,9));
        Menadzer manager1 = new Menadzer("Pera", "Peric");
        Trener trener1 = new Trener("Stefan", "Strfanovic", "Kondicija");
        Igrac igrac1 = new Igrac("Milan", "Milenovic", "Centar");
        tim1.dodajMenadzera(manager1);
        tim1.dodajTrenera(trener1);
        tim1.dodajIgraca(igrac1);

        Tim tim2 = sportskoDrustvo.dodajTim("Seniori",LocalDate.of(2020,3,8));
        Menadzer manager2 = new Menadzer("Marko", "Markovic");
        Trener trener2 = new Trener("Zeljko", "Zeljkovic", "Kondicija");
        Igrac igrac2 = new Igrac("Vladimir", "Vladimirovic", "Centar");
        tim2.dodajMenadzera(manager2);
        tim2.dodajTrenera(trener2);
        tim2.dodajIgraca(igrac2);

        Tim tim3 = sportskoDrustvo.dodajTim("Tigrovi",LocalDate.of(2021,4,12));
        Menadzer manager3 = new Menadzer("Zika", "Zikic");
        Trener trener3 = new Trener("Branko", "Brankovic", "Kondicija");
        Igrac igrac3 = new Igrac("Djordje", "Djordjevic", "Centar");
        tim3.dodajMenadzera(manager3);
        tim3.dodajTrenera(trener3);
        tim3.dodajIgraca(igrac3);

        System.out.println();
        System.out.println(sportskoDrustvo);

    }
}
