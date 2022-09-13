import java.util.concurrent.Callable;

public class Main143 {

    public static void main(String[] args) {
        Eknjiga eknjiga = new Eknjiga("Naslov", "Autor");

        eknjiga.dodajStranicu("stranica 1");
        eknjiga.dodajStranicu("stranica 2");
        eknjiga.dodajStranicu("stranica 3");
        eknjiga.dodajStranicu("stranica 4");
        eknjiga.citaj();
        eknjiga.citaj();
        eknjiga.citaj();
        eknjiga.citaj();
        eknjiga.citaj();

        Fabrika fabrika = new Fabrika();

        Citljiv citljiv = fabrika.proizvedi();
        Citljiv citljiv1 = fabrika.proizvedi();
        Citljiv citljiv2 = fabrika.proizvedi();
        System.out.println("Prvi citljiv object");
        citljiv.citaj();
        citljiv.citaj();
        citljiv.citaj();
        citljiv.citaj();
        citljiv.citaj();

        System.out.println("Drugi citljiv object");
        citljiv1.citaj();
        citljiv1.citaj();
        citljiv1.citaj();
        citljiv1.citaj();
        citljiv1.citaj();

        System.out.println("Treci citljiv object");
        citljiv2.citaj();
        citljiv2.citaj();
        citljiv2.citaj();
        citljiv2.citaj();
        citljiv2.citaj();


    }
}
