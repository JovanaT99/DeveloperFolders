public class Postpaid extends Korisnik {


    private double trenutniRacun;

    public double pretplata = 150;
    private double razgovorMreza = 2.8;
    private double razgovorNac = 5.8;
    private double veza = 2.5;
    private double sms = 2.2;

    public Postpaid(String broj) {
        super(broj);
        trenutniRacun = pretplata;
    }

    public Postpaid(Postpaid p) {
        super(p.getBroj());
        trenutniRacun = p.trenutniRacun;
    }

    @Override
    public void azuriraj_racun_razgovor(Razgovor r) {
        double cena = razgovorNac;
        if (r.getBroj().startsWith("064") || r.getBroj().startsWith("065") || r.getBroj().startsWith("066"))
            cena = razgovorMreza;

    }

    @Override
    public void azuriraj_racun_SMS() {

    }
}
