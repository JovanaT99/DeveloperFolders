import java.util.HashMap;

public class PostanskiBroj {

    private HashMap<String, Integer> brojevi;

    public PostanskiBroj() {
        brojevi = new HashMap<>();
    }


    public void dodajBroj(String mesto, int broj) {

        if (brojevi.containsKey(mesto)) {
            return;
        }
        brojevi.put(mesto, broj);
    }

    public int vratiBroj(String mesto) {

        return brojevi.get(mesto);
    }


    public int vratiBrojPoSlovom(String mestoPocetka) {

        for (String mesto : brojevi.keySet()) {
            if (mesto.startsWith(mestoPocetka)) {
                return brojevi.get(mesto);
            }
        }
        return -1;


    }


}
