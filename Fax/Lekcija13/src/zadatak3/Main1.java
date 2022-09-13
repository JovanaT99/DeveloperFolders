package zadatak3;

public class Main1 {
    public static void main(String[] args) {

        System.out.println("Ulaznica za Sever kosta" + StadionUlaznica.getSEVER());
        Navijac navijac = new Navijac("Pera Peric", 900);
        if (navijac.dovoljnoNovcaZaSever()) {
            System.out.println("Ima dovoljno novca");
        } else {
            System.out.println("Nema dovoljno novca");
            navijac.setNovac(1500);
        }
        if (navijac.dovoljnoNovcaZaSever()) {
            System.out.println("Ima dovoljno novca");
        } else {
            System.out.println("Nema dovoljno novca");
        }
    }
}
