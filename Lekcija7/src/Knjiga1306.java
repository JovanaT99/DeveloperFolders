public class Knjiga1306 {

    private String naslov;
    private String autor;
    private String sadrzaj;
    private int godinaIzdanja;

    public Knjiga1306(String naslov, String autor, String sadrzaj, int godinaIzdanja) {
        this.naslov = naslov;
        this.autor = autor;
        this.sadrzaj = sadrzaj;
        this.godinaIzdanja = godinaIzdanja;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSadrzaj() {
        return sadrzaj;
    }

    public void setSadrzaj(String sadrzaj) {
        this.sadrzaj = sadrzaj;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    @Override
    public String toString() {
        return "Knjiga1306{" +
                "naslov='" + naslov + '\'' +
                ", autor='" + autor + '\'' +
                ", sadrzaj='" + sadrzaj + '\'' +
                ", godinaIzdanja=" + godinaIzdanja +
                '}';
    }
}
