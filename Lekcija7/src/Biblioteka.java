import java.util.HashMap;
import java.util.Locale;

public class Biblioteka {

    private HashMap<String, Knjiga1306> knjige;

    public Biblioteka() {
        knjige = new HashMap<>();
    }

    public void dodajKnjige(Knjiga1306 knjiga1306) {

        if (knjige.containsKey(ocistiNaslov(knjiga1306.getNaslov()))) {
            return;
        }
        knjige.put(ocistiNaslov(ocistiNaslov(knjiga1306.getNaslov())), knjiga1306);
    }

    public void ukloniKnjgu(Knjiga1306 knjiga1306) {

        knjige.remove(ocistiNaslov(knjiga1306.getNaslov()));
    }

    public void ukloniKnjgu(String naslov) {

        knjige.remove(ocistiNaslov(naslov));
    }

    public Knjiga1306 pronalazak(String naslov) {
        return knjige.get(ocistiNaslov(naslov));
    }


    private String ocistiNaslov(String naslov) {

        return naslov.trim().toLowerCase();
    }
}
