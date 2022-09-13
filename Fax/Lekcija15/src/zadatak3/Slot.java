package zadatak3;

public class Slot<T, V> {
    //ista vrednost za sve klase
    private static int brojSlotova = 0;
    private T kljuc;
    private V vrednost;


    public Slot() {

        Slot.brojSlotova++;
    }

    public static int getBrojSlotova() {
        return brojSlotova;
    }

    public T getKljuc() {
        return kljuc;
    }

    public V getVrednost() {
        return vrednost;
    }


    public void setKljuc(T kljuc) {
        this.kljuc = kljuc;
    }

    public void setVrednost(V vrednost) {
        this.vrednost = vrednost;
    }


}
