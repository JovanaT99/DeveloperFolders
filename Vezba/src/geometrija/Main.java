//package geometrija;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Figura>figuras=new ArrayList<>();
//        int izbor = scanner.nextInt();
//        Figura figura = new Figura();
//       // Figura figura1=new Prizma(1,2,3,4,"Prizma");
//        Prizma prizma=new Prizma(1,1,3,4,"Prizma");
//        Figura figura2=new Kvadrat("Kvadrat",1,2,3);
//        System.out.println("Kvadrat 1,Prizma 2");
//        while (izbor != 0) {
//            switch (izbor) {
//                case 1 -> prizma.izracunajOmotac();
//                case 2 -> figura2.zapreminaFigure();
//                default -> System.out.println("Pogresan unos");
//            }
//
//            System.out.println("Unesite ponovo izbor:");
//            izbor = scanner.nextInt();
//
//        }
//        figura.zapreminaFigure();
//    }
//}
//
