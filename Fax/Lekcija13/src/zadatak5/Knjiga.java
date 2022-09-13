package zadatak5;

public class Knjiga {

    private String naslov;
    private String autor;
    private String sadrzaj;
    private int godinaIzdana;

    public Knjiga(String naslov, String autor, String sadrzaj, int godinaIzdana) {
        this.naslov = naslov;
        this.autor = autor;
        this.sadrzaj = sadrzaj;
        this.godinaIzdana = godinaIzdana;
    }

    public String getNaslov() {
        return naslov;
    }

    public String getAutor() {
        return autor;
    }

    public String getSadrzaj() {
        return sadrzaj;
    }

    public int getGodinaIzdana() {
        return godinaIzdana;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setSadrzaj(String sadrzaj) {
        this.sadrzaj = sadrzaj;
    }

    public void setGodinaIzdana(int godinaIzdana) {
        this.godinaIzdana = godinaIzdana;
    }

    @Override
    public String toString() {
        return "Knjiga{" +
                "naslov='" + naslov + '\'' +
                ", autor='" + autor + '\'' +
                ", sadrzaj='" + sadrzaj + '\'' +
                ", godinaIzdana='" + godinaIzdana + '\'' +
                '}';
    }
}
