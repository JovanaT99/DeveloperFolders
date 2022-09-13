package geometrija;

public class Figura {


    private int povrsina;
    private int zapremina;

    public Figura(int povrsina, int zapremina) {
        this.povrsina = povrsina;
        this.zapremina = zapremina;
    }

    public int getPovrsina() {
        return povrsina;
    }

    public int getZapremina() {
        return zapremina;
    }


    public void setPovrsina(int povrsina) {
        this.povrsina = povrsina;
    }

    public void setZapremina(int zapremina) {
        this.zapremina = zapremina;
    }
}


