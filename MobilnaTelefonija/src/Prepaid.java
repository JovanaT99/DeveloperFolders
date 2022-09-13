public class Prepaid extends Korisnik {

    private double kredit;

    private double razgovor=7.5;
    private double friendsFamily=4.5;
    private double veza=2.8;
    private double sms=0.9;

    public Prepaid(String broj) {
        super(broj);
    }
    public void dopuniKredit(int dopuna){
}
    @Override
    public void azuriraj_racun_razgovor(Razgovor r) {

    }
    @Override
    public void azuriraj_racun_SMS() {

    }
}
