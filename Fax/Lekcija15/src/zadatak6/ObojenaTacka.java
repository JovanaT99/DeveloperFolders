package zadatak6;

public class ObojenaTacka extends Tacka {


    private String boja;

    public ObojenaTacka(int x, int y, String boja) {
        super(x, y);
        this.boja = boja;
    }
    public String toString(){

        return super.toString()+ "-"+boja;
    }
}
