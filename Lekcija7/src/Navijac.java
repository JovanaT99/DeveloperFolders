public class Navijac {

    private String imePrezime;
    private int novac;


    public Navijac(String imePrezime, int novac) {
        this.imePrezime = imePrezime;
        this.novac = novac;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public int getNovac() {
        return novac;
    }

    public void setNovac(int novac) {
        this.novac = novac;
    }


    public boolean dovoljnoNovca() {
        return novac >= StadionUlaznica.getSEVER();


    }
}

