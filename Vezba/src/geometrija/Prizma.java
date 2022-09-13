//package geometrija;
//
//public class Prizma extends Figura {
//
//
//    int a;
//    int b;
//    int c;
//    int h;
//    String oznaka = "Pr";
//
//    public Prizma(int a, int b, int c, int h, String oznaka) {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//        this.h = h;
//        this.oznaka = oznaka;
//    }
//
//    public int getA() {
//        return a;
//    }
//
//    public int getB() {
//        return b;
//    }
//
//    public int getC() {
//        return c;
//    }
//
//    public int getH() {
//        return h;
//    }
//
//    public String getOznaka() {
//        return oznaka;
//    }
//
//    public void setA(int a) {
//        this.a = a;
//    }
//
//    public void setB(int b) {
//        this.b = b;
//    }
//
//    public void setC(int c) {
//        this.c = c;
//    }
//
//    public void setH(int h) {
//        this.h = h;
//    }
//
//    public void setOznaka(String oznaka) {
//        this.oznaka = oznaka;
//    }
//
//    public double izracunajBazu() {
//
//        double b;
//        b = (Math.pow(a, 2) * Math.sqrt(3)) / 4;
//        return b;
//
//    }
//
//    public double izracunajOmotac() {
//
//        return 3 * a * h;
//    }
//
//    @Override
//    public String toString() {
//        return " " + oznaka + "" + getA() + " " + getB() + " " + getC() + " " + getH() + " " + getP() + " " + getV() + "Baza " + izracunajBazu() + "Omotac " + izracunajOmotac();
//    }
//}
