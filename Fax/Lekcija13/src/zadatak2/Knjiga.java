package zadatak2;

public class Knjiga {


    private String naslov="Neki naslov";
    private String sadrzaj="jhfchdvjkv vcnfjvhfvb";
    private String autor="Jovana Blagojevic";
    private int godinaIzdanja=1999;

    public Knjiga(String naslov, String sadrzaj, String autor, int godinaIzdanja){
    }

    public String getNaslov() {
        return naslov;
    }

    public String getSadrzaj() {
        return sadrzaj;
    }

    public String getAutor() {
        return autor;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public void setSadrzaj(String sadrzaj) {
        this.sadrzaj = sadrzaj;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    @Override
    public String toString() {
        return "Knjiga{" +
                "naslov='" + naslov + '\'' +
                ", sadrzaj='" + sadrzaj + '\'' +
                ", autor='" + autor + '\'' +
                ", godinaIzdanja=" + godinaIzdanja +
                '}';
    }


}
