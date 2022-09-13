public class Knjiga13 {


    private String naslov;
    private String sadrzaj;
    private String autor;
    private int godinaIzdanja;

    public Knjiga13(String naslov, String sadrzaj, String autor, int godinaIzdanja) {
        this.naslov = naslov;
        this.sadrzaj = sadrzaj;
        this.autor = autor;
        this.godinaIzdanja = godinaIzdanja;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getSadrzaj() {
        return sadrzaj;
    }

    public void setSadrzaj(String sadrzaj) {
        this.sadrzaj = sadrzaj;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    @Override
    public String toString() {
        return "Knjiga13{" +
                "naslov='" + naslov + '\'' +
                ", sadrzaj='" + sadrzaj + '\'' +
                ", autor='" + autor + '\'' +
                ", godinaIzdanja=" + godinaIzdanja +
                '}';
    }
}
