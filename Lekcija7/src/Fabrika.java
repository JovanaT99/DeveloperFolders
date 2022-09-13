import java.util.Random;

public class Fabrika {

    public Citljiv proizvedi() {

        Random random = new Random();
        int broj = random.nextInt(3);
        if (broj == 0) {
            return new Sms("Pera Peric", "Dobili ste poruku");
        } else if (broj == 1) {

            return new Eknjiga("Prazna kniga", "Autor prazne knjige");
        } else {

            Eknjiga eknjiga=new Eknjiga("Naslov","Joki");
            eknjiga.dodajStranicu("Prva str");
            eknjiga.dodajStranicu("Druga str");
            eknjiga.dodajStranicu("Treca str");
            eknjiga.dodajStranicu("Cet str");
            return eknjiga;

        }


    }


}
