package primer3;

import java.util.ArrayList;

public class Eknjiga implements Cutljiv {

    private String naslov;
    private String autor;
    private ArrayList<String> stranice;
    private int brojStranice;


    public Eknjiga(String naslov, String autor) {
        this.naslov = naslov;
        this.autor = autor;
        stranice = new ArrayList<>();
        brojStranice = 0;
    }

    public String getNaslov() {
        return naslov;
    }

    public String getAutor() {
        return autor;
    }

    public ArrayList<String> getStranice() {
        return stranice;
    }

    public int getBrojStranice() {
        return brojStranice;
    }

    public void dodajStranicu(String stranica){

        stranice.add(stranica);
    }

    public void sledecaStranica(){
        brojStranice++;

        if(brojStranice>=stranice.size()){
            brojStranice=0;
        }
    }

    @Override
    public void citaj() {
        if(stranice.size()>0){
            System.out.println(stranice.get(brojStranice));
            sledecaStranica();
        }
        else{
            System.out.println("Knjiga nema stranica");
        }
    }
}
