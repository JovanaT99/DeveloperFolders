import java.util.Random;

public class Fabrika15 {

    public Citljiv15 proizvedi() {

    Random random = new Random();
    int broj = random.nextInt(3);
    if(broj ==0)

    {
        return new Sms15("Pera Peric", "Dobili ste poruku");
    } else if(broj ==1)

    {

        return new Eknjiga15("Prazna kniga", "Autor prazne knjige");
    } else

    {

        Eknjiga15 eknjiga = new Eknjiga15("Naslov", "Joki");
        eknjiga.dodajStranicu("Prva str");
        eknjiga.dodajStranicu("Druga str");
        eknjiga.dodajStranicu("Treca str");
        eknjiga.dodajStranicu("Cet str");
        return eknjiga;

    }
}
}
