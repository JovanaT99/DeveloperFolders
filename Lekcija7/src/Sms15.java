public class Sms15 implements Citljiv15{

    private String posiljaljac;
    private String poruka;

    public Sms15(String posiljaljac, String poruka) {
        this.posiljaljac = posiljaljac;
        this.poruka = poruka;
    }


    public String getPosiljaljac() {
        return posiljaljac;
    }

    public String getPoruka() {
        return poruka;
    }

    @Override
    public void citljiv() {

    }

    @Override
    public String toString() {
        return "Sms15{" +
                "posiljaljac='" + posiljaljac + '\'' +
                ", poruka='" + poruka + '\'' +
                '}';
    }
}
