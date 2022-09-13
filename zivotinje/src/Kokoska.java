public class Kokoska implements Oglasavanje, Kretanje {

    String ime;
    String rasa;


    public Kokoska(String ime, String rasa) {
        this.ime = ime;
        this.rasa = rasa;
    }

    @Override
    public int kreciSe() {
        return HODA | LETI;
    }

    @Override
    public void oglasavanjee() {


        System.out.println("KoKO");
    }

    @Override
    public void ljutoOglasavanje() {


        System.out.println("Glasno kokoadace");
    }

    @Override
    public String toString() {
        return "Kokoska{" +
                "ime='" + ime + '\'' +
                ", rasa='" + rasa + '\'' +
                '}';
    }

}
