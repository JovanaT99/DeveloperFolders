import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {

        Nastavnik nastavnik=new Nastavnik("Jovana","Blagojevic",9,17);
        System.out.println(nastavnik);

        Sala sala=new Sala("Naziv","SLUSAONICA",50);
        System.out.println(sala);
        Sala sala1=new Sala("NazivSale","slusaonica",100);
        System.out.println(sala1);
        Rezervacija rezervacija=new Rezervacija(2);
        Rezervacija  rezervacija1=new Rezervacija(1);
        Rezervacija rezervacija2=new Rezervacija(3);


        ArrayList<Rezervacija> lista=new ArrayList<>();
        lista.add(rezervacija);
        lista.add(rezervacija1);
        lista.add(rezervacija2);


        for(Rezervacija s:lista){

            System.out.println(s);
        }

        Collections.sort(lista);


    }
}

