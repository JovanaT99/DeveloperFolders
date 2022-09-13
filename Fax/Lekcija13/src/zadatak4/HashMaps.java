package zadatak4;

import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {

        java.util.HashMap<String, String> hashMap = new java.util.HashMap<>();

        hashMap.put("Jedan", "One");
        hashMap.put("Dva", "Two");
        hashMap.put("Tri", "Three");
        hashMap.put("Cetiri", "Four");

        String prevodTri = hashMap.get("Tri");
        System.out.println("Tri na eng:" + prevodTri);

        hashMap.put("Jedan", "Eins");
        String prevodJedan = hashMap.get("Jedan");
        System.out.println("Jedan" + prevodJedan);


    }
}
