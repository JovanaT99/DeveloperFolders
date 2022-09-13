import java.util.ArrayList;

public class Main15 {

    public static void main(String[] args) {


        Fabrika15 fabrika = new Fabrika15();
        Citljiv15 citljiv15 = fabrika.proizvedi();
        Citljiv15 citljiv151 = fabrika.proizvedi();
        Citljiv15 citljiv152 = fabrika.proizvedi();
        Citljiv15 citljiv153 = fabrika.proizvedi();

        ArrayList<Citljiv15> lista = new ArrayList<>();
        lista.add(citljiv15);
        lista.add(citljiv151);
        lista.add(citljiv152);
        lista.add(citljiv153);


        for (Citljiv15 c : lista) {

            c.citljiv();
            c.citljiv();
            c.citljiv();
            c.citljiv();
            c.citljiv();
            System.out.println("--------------------------------------------");
        }


        Stampac stampac = new Stampac();
        stampac.stampaj(citljiv15);
        stampac.stampaj(citljiv151);


        Eknjiga15 eknjiga15 = new Eknjiga15("Naslov", "Autor");
        lista.add(eknjiga15);


        citljiv15 = eknjiga15;
        Eknjiga15 eknjiga2 = (Eknjiga15) citljiv15;

    }
}
