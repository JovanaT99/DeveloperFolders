package zadatak5;

import java.util.HashMap;
import java.util.Locale;

public class Biblioteka {

    private HashMap<String, Knjiga> knjigaHashMap;


    public Biblioteka() {
        knjigaHashMap = new HashMap<>();

    }

    public void dodajKnjigu(Knjiga knjiga) {

        if (knjigaHashMap.containsKey(ocistiNaslov(knjiga.getNaslov()))) {

            return;

        }
        knjigaHashMap.put(ocistiNaslov(knjiga.getNaslov()), knjiga);
    }

    public void ukloniKnjigu(Knjiga knjiga) {

        knjigaHashMap.remove(ocistiNaslov(knjiga.getNaslov()));
    }

    public void ukloniKnjigu(String naslov) {

        knjigaHashMap.remove(ocistiNaslov(naslov));
    }

    public Knjiga nadjiKnjigu(String naslov) {

        return knjigaHashMap.get(ocistiNaslov(naslov));

    }

    private String ocistiNaslov(String naslov) {

        return naslov.trim().toLowerCase(Locale.ROOT);
    }

}
