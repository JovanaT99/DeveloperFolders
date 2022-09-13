package zadatak1;

import zadatak1.Citljiv;

import java.util.ArrayList;

public class Eknjigaa implements Citljiv {
    private String naslov;
    private String autor;
    private ArrayList<String> stranice;
    private int brojStranica;

    public Eknjigaa(String naslov, String autor) {

        this.naslov = naslov;
        this.autor = autor;
        stranice = new ArrayList<>();
        brojStranica = 0;
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

    public int getBrojStranica() {
        return brojStranica;
    }

    public void sledecaStrana() {

        brojStranica++;
        if (brojStranica >= stranice.size()) {
            brojStranica = 0;
        }
    }
    public void dodajStranicu(String stranica) {

        stranice.add(stranica);
    }

    @Override
    public void citaj() {

        if (stranice.size() > 0) {
            System.out.println(stranice.get(brojStranica));
            sledecaStrana();
        }
    }
}
