import java.util.ArrayList;

public class Eknjiga15 implements Citljiv15 {

    private String naslov;
    private String autor;
    private ArrayList<String> stranice;
    private int brojStranice;

    public Eknjiga15(String naslov, String autor) {
        this.naslov = naslov;
        this.autor = autor;
        stranice = new ArrayList<>();
        brojStranice = 0;
    }


    public String getNaslov() {
        return naslov;
    }

    public void sledecaStranica() {
        brojStranice++;
        if (brojStranice >= stranice.size()) {
            brojStranice = 0;
        }
    }
public void dodajStranicu(String stranica){

        stranice.add(stranica);
}
    @Override
    public void citljiv() {

        if(stranice.size()>0){
            System.out.println(stranice.get(brojStranice));
            sledecaStranica();
        }
    }
}
