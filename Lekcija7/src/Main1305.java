import java.util.HashMap;

public class Main1305 {

    public static void main(String[] args) {


        HashMap<String, String> brojevic = new HashMap<>();
        brojevic.put("Jedan", "One");
        brojevic.put("Dva", "Two");
        brojevic.put("Tri", "Three");
        brojevic.put("Cetiri", "Four");
        brojevic.put("Pet", "Five");
        brojevic.put("Sest", "Six");

        String prevodTri = brojevic.get("Tri");
        System.out.println("Prevod na eng:" + prevodTri);

        brojevic.put("Jedan", "Eins");
        String prevodJedan=brojevic.get("Jedan");
        System.out.println(prevodJedan);
    }
}
