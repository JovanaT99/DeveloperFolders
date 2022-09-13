package primer3;

public class Sms implements Cutljiv {

    private String posiljaoc;
    private String poruka;


    public Sms(String posiljaoc, String poruka) {
        this.posiljaoc = posiljaoc;
        this.poruka = poruka;
    }

    public String getPosiljaoc() {
        return posiljaoc;
    }

    public String getPoruka() {
        return poruka;
    }

    @Override
    public void citaj() {
        System.out.println(posiljaoc + " " + poruka);
    }
}
