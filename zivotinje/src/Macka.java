public class Macka implements Kretanje, Oglasavanje {

    String ime;
    String rasa;

    public Macka(String ime, String rasa) {
        this.ime = ime;
        this.rasa = rasa;
    }

    @Override
    public int kreciSe() {
        return HODA | SKACE;
    }

    @Override
    public void oglasavanjee() {


        System.out.println("Mnjau");
    }

    @Override
    public void ljutoOglasavanje() {

        System.out.println("Grebe");
    }

    @Override
    public String toString() {
        return "Macka{" +
                "ime='" + ime + '\'' +
                ", rasa='" + rasa + '\'' +
                '}';
    }
}
