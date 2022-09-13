public class Oosba {

    private String ime;
    private String prezime;
    private int godine;

    public Oosba(String ime, String prezime, int godine) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
    }

    private Oosba(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public String toString() {

        return this.ime + " " + this.prezime + " " + this.godine;
    }

    public void stampaj() {

        System.out.println(this.ime + this.prezime + this.godine);
    }

    public void ostari() {
        this.godine++;
    }

    public String getIme() {


        return ime;

    }

    public String getPrezime() {

        return prezime;
    }

    public int getGodine() {

        return godine;
    }
public boolean jePunoletna(){
//        if(godine>17){
//            return true;
//        }
//        else{
//            return false;
//        }

    return this.godine>17 ? true: false;
}


}
