package Pozoriste;

public class Pozoriste {

 private static int idSet=0;
    private String naziv;
    private int id=idSet++;


    public Pozoriste(String naziv, int id) {
        this.naziv = naziv;
        this.id = id;
    }


    public String getNaziv() {
        return naziv;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Pozoriste{" +
                "naziv='" + naziv + '\'' +
                ", id=" + id +
                '}';
    }
}
