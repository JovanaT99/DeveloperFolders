import java.util.Objects;

public class Knjiga411 {

    private String naslov;
    private String autor;
    private int godinaIzdanja;

    public Knjiga411(String naslov, String autor, int godinaIzdanja) {
        this.naslov = naslov;
        this.autor = autor;
        this.godinaIzdanja = godinaIzdanja;
    }


    @Override
    public String toString() {
        return naslov + " " + autor + " " + godinaIzdanja;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Knjiga411 knjiga411 = (Knjiga411) o;
        return godinaIzdanja == knjiga411.godinaIzdanja &&
                Objects.equals(naslov, knjiga411.naslov) &&
                Objects.equals(autor, knjiga411.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naslov, autor, godinaIzdanja);
    }
}
