public class Sms implements Citljiv {

    private String posiljalac;
    private String poruka;

    public Sms(String posiljao, String poruka) {
        this.posiljalac = posiljao;
        this.poruka = poruka;
    }


    public String getPosiljalac() {
        return posiljalac;
    }

    public String getPoruka() {
        return poruka;
    }

    @Override
    public void citaj() {
        System.out.println(posiljalac + " " + poruka);
    }
}
