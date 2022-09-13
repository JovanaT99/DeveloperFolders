package zadatak1;

import zadatak1.Citljiv;
import zadatak1.Eknjigaa;

import java.util.Random;

public class Fabrika {

    public Citljiv proizvedi() {

        Random random = new Random();
        int broj = random.nextInt(3);

        if (broj == 0) {
            return new Sms("Jovana", "Zdravo");
        } else if (broj == 1) {
            return new Eknjigaa("Una", "Momo Kapor");
        } else {
            Eknjigaa eknjigaa = new Eknjigaa("Neka knjiga", "Autor");
            eknjigaa.dodajStranicu("prva");
            eknjigaa.dodajStranicu("druga");
            eknjigaa.dodajStranicu("treca");
            return eknjigaa;
        }
    }
}
