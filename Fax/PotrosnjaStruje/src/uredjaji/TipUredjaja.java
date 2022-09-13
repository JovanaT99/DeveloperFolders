package uredjaji;

public enum TipUredjaja {

    FRIZDER(100),
    SIJALICA(200),
    FEN(300),
    MOBILNI(400);

    private int snaga;

    TipUredjaja(int snaga) {
        this.snaga=snaga;
    }

    public int getSnaga(){
        return snaga;
    }
}
