package Zadatak2;

import java.net.CookieHandler;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //ArrayList ,Linkedlist -->interfejs List
        //ArrayList za pretrazivanje, Linked za dodavanje

        List<String> list = new ArrayList<>();
        list.add("String karaktera iz ArrayListe-e");

        List<String> list1 = new LinkedList<String>();
        list1.add("String unutar Linkedlist-e");

        //Map interfejs -
        Map<String, String> prevod = new HashMap<>();
        prevod.put("Programiranje", "programming");
        prevod.put("hes", "hash");
//interfjs set --> keySet
        for (String kljuc : prevod.keySet()) {
            System.out.println(prevod.get(kljuc));
        }

        //Set - skupovi --> HashSet
        Set<String> skup = new HashSet<>();
        skup.add("jedan");
        skup.add("dva");
        skup.add("jedan");

        for (String kljuc : skup) {
            System.out.println(kljuc);
        }

        //Collection interfejs --> Liste, Set
        //contains, size,

        //Hastable

        Map<String,String> recnik=new HashMap<>();
        recnik.put("jedan","One");
        recnik.put("dva", "two");

        Set<String>kljucevi=recnik.keySet();

        Collection<String>setKljuceva=kljucevi;

        System.out.println(kljucevi);
        for(String kljuc: setKljuceva){


            System.out.println(kljuc);
        }


        Collection<String>vrednosti=recnik.values();
        for(String vrednost:vrednosti){

            System.out.println(vrednost);
        }
    }

}
