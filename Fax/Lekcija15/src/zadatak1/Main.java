package zadatak1;

import zadatak1.Citljiv;
import zadatak1.Fabrika;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Fabrika fabrika = new Fabrika();

        Citljiv citljiv = fabrika.proizvedi();
        Citljiv citljiv1 = fabrika.proizvedi();
        Citljiv citljiv2 = fabrika.proizvedi();
        ArrayList<Citljiv> citljivs = new ArrayList<>();
        citljivs.add(citljiv);
        citljivs.add(citljiv1);
        citljivs.add(citljiv2);

        for (Citljiv c : citljivs) {

            c.citaj();
            c.citaj();
            c.citaj();
            c.citaj();
        }

        Stampac stampac = new Stampac();

        stampac.stampaj(citljiv);
        stampac.stampaj(citljiv1);




    }
}
