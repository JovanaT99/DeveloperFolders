package zadatak1;

public class Sms implements Citljiv {

    private String posiljalac;
    private String poruka;


    public Sms(String posiljalac, String poruka) {

        this.posiljalac = posiljalac;
        this.poruka = poruka;
    }

    public String getPosiljalac() {
        return posiljalac;
    }
    public String getPoruka() {
        return poruka;
    }
    @Override
    public String toString() {
        return "Sms{" +
                "posiljalac='" + posiljalac + '\'' +
                ", poruka='" + poruka + '\'' +
                '}';
    }
    @Override
    public void citaj() {

    }
}
