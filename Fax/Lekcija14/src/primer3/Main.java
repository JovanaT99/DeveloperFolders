package primer3;

public class Main {
    public static void main(String[] args) {

        Eknjiga eknjiga = new Eknjiga("Neki naslov", "Mika");
        eknjiga.dodajStranicu("Ovo je prva stranica");
        eknjiga.dodajStranicu("Ovo je druga stranica");
        eknjiga.dodajStranicu("Ovo je treca stranica");
        eknjiga.dodajStranicu("Ovo je cetvrta stranica");
        eknjiga.citaj();
        eknjiga.citaj();

        Fabrika fabrika = new Fabrika();
        Cutljiv cutljiv = fabrika.proizvedi();
        Cutljiv cutljiv1 = fabrika.proizvedi();
        Cutljiv cutljiv2 = fabrika.proizvedi();

        System.out.println("Prvi");
        cutljiv.citaj();
        cutljiv.citaj();
        cutljiv.citaj();

        System.out.println("Drugi");

        cutljiv1.citaj();
        cutljiv1.citaj();
        cutljiv1.citaj();

        System.out.println("Treci");

        cutljiv2.citaj();
        cutljiv2.citaj();
        cutljiv2.citaj();



    }
}
