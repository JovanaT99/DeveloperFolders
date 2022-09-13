import javax.swing.plaf.basic.BasicTreeUI;

public class Pingvin implements Kretanje, Oglasavanje {

    String ime;


    public Pingvin(String ime) {
        this.ime = ime;
    }

    @Override
    public int kreciSe() {
        return HODA;
    }

    @Override
    public void oglasavanjee() {

        System.out.println("Pingvin se oglasava");

    }

    @Override
    public void ljutoOglasavanje() {

        System.out.println("Pingvin se ljuto oglasava");
    }

    @Override
    public String toString() {
        return "Pingvin{" +
                "ime='" + ime + '\'' +
                '}';
    }
}
