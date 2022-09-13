public class Main134 {

    public static void main(String[] args) {

        System.out.println(StadionUlaznica.getSEVER());
        Navijac navijac = new Navijac("Jovana Blagojevic", 500);

        if (navijac.dovoljnoNovca()) {

            System.out.println("Ima dovoljno novca");
        } else {
            System.out.println("Nema dovoljno novca");
            navijac.setNovac(1500);
        }


        if (navijac.dovoljnoNovca()) {

            System.out.println("Ima dovoljno novca za sever");
        } else {
            System.out.println("Nema dovoljno novca za sever");
            navijac.setNovac(2000);
        }


    }
}
