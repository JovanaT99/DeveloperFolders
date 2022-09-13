package primer2;

import java.util.Objects;

public class Knjiga {
    private String naslov;
    private String autor;
    private int godinaIzdanja;


    public Knjiga(String naslov, String autor, int godinaIzdanja) {
        this.naslov = naslov;
        this.autor = autor;
        this.godinaIzdanja = godinaIzdanja;
    }

    @Override
    public String toString() {
        return "Knjiga{" +
                "naslov='" + naslov + '\'' +
                ", autor='" + autor + '\'' +
                ", godinaIzdanja=" + godinaIzdanja +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Knjiga knjiga = (Knjiga) o;
        return godinaIzdanja == knjiga.godinaIzdanja &&
                Objects.equals(naslov, knjiga.naslov) &&
                Objects.equals(autor, knjiga.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naslov, autor, godinaIzdanja);
    }
}
