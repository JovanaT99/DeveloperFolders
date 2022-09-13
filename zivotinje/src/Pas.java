public class Pas implements Kretanje, Oglasavanje {

    String ime;
    String rasa;

    public Pas(String ime, String rasa) {
        this.ime = ime;
        this.rasa = rasa;
    }

    @Override
    public int kreciSe() {

        return HODA | SKACE;

    }

    @Override
    public void oglasavanjee() {
        System.out.println("AVAV");

    }
    @Override
    public void ljutoOglasavanje() {

        System.out.println("Rezi");
    }

    @Override
    public String toString() {
        return "Pas{" +
                "ime='" + ime + '\'' +
                ", rasa='" + rasa + '\'' +
                '}';
    }
}
