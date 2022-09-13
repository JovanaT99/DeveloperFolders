public class Zaba implements Oglasavanje, Kretanje {

    String ime;


    public Zaba(String ime) {
        this.ime = ime;
    }

    @Override
    public int kreciSe() {
        return PLIVA | SKACE | GNJURI ;
    }

    @Override
    public void oglasavanjee() {


        System.out.println("KreKre");
    }

    @Override
    public void ljutoOglasavanje() {

        System.out.println("Ljuta zaba");

    }

    @Override
    public String toString() {
        return "Zaba{" +
                "ime='" + ime + '\'' +
                '}';
    }
}
