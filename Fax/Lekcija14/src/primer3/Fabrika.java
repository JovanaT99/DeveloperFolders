package primer3;

import java.util.Random;

public class Fabrika {

    public Cutljiv proizvedi(){

        Random random=new Random();
        int broj=random.nextInt(3);
        if(broj==0){

            return new Sms("Pera", "Dobili ste poruku");
        }
        else if (broj==1){

            return new Eknjiga("Prazna knjiga", "Autor prazne knjige");
        }else{
            Eknjiga eknjiga=new Eknjiga("Knjiga sa stranicama","Autor sa str");
            eknjiga.dodajStranicu("Prva str");
            eknjiga.dodajStranicu("dr str");
            eknjiga.dodajStranicu("tr str");
            eknjiga.dodajStranicu("cet strana");
            return eknjiga;
        }
    }
}
