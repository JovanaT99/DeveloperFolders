package prodavnica;
import java.util.ArrayList;


public class Prodavnica {

    String naziv;
    String adresa;
    ArrayList<Racun> listaRacuna = new ArrayList<>();


    public Prodavnica(String naziv, String adresa) {
        this.naziv = naziv;
        this.adresa = adresa;
    }

    public void dodajRacun(Racun racun) {
        listaRacuna.add(racun);
    }

    public String getPrviRacunzaDate(int dan, int mesec, int godina) {
        String prviRacun = "Ne postoji takav racun";
        int prviRacunId = Integer.MAX_VALUE;
        for (Racun racun : listaRacuna) {
            int racunDan = racun.datum.getDayOfMonth();
            int racunMesec = racun.datum.getMonthValue();
            int racunGdina = racun.datum.getYear();


            if (racunDan == dan && racunMesec == mesec && racunGdina == godina) {

                if (racun.id < prviRacunId) {
                    prviRacunId = racun.id;
                    prviRacun = racun.toString();
                }
            }
        }

        return prviRacun;

    }


    public String getNajskupljiRacun() {
        String najskupljiRacun = "Lista racuna prazna";
        int maxRacun = Integer.MIN_VALUE;
        for (Racun racun : listaRacuna) {

            if (racun.getUkupnaCena() > maxRacun) {
                maxRacun=racun.getUkupnaCena();
                najskupljiRacun = racun.getUkupnaCena() + " dinara";
            }
        }
        return najskupljiRacun;
    }

    public String getNajjetfinijiiRacun() {
        String najjeftinijiRacun = "Lista racuna prazna";
        int minRacun = Integer.MAX_VALUE;
        for (Racun racun : listaRacuna) {

            if (racun.getUkupnaCena() < minRacun) {
                minRacun=racun.getUkupnaCena();
                najjeftinijiRacun = racun.getUkupnaCena() + " dinara";
            }
        }

        return najjeftinijiRacun;
    }

    public String averageRacuna() {

        double cenaSvihRacuna = 0;
        for (Racun racun : listaRacuna) {
            cenaSvihRacuna += racun.getUkupnaCena();
        }
        return cenaSvihRacuna / listaRacuna.size() + " dinara";
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Prodavnica: ");
        stringBuilder.append(naziv);
        stringBuilder.append(", ");
        stringBuilder.append(adresa).append("\n");
        stringBuilder.append("___________________________________________\n");
        stringBuilder.append("Najskuplji racun: ");
        stringBuilder.append(getNajskupljiRacun()).append("\n");
        stringBuilder.append("Najjeftiniji racun: ");
        stringBuilder.append(getNajjetfinijiiRacun()).append("\n");
        stringBuilder.append("Prosecna cena racuna: ");
        stringBuilder.append(averageRacuna()).append("\n");
        stringBuilder.append("___________________________________________\n");

        for (Racun racun : listaRacuna) {
            stringBuilder.append(racun.toString());
            stringBuilder.append("___________________________________________\n");
        }
        return stringBuilder.toString();

    }

}
