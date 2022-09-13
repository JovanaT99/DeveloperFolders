package primer1;

import java.util.HashMap;

public class MainPb {
    public static void main(String[] args) {

        HashMap<Integer, String>tabela=new HashMap<>();
        tabela.put(2,"Neki string");
        tabela.put(1,"Novi string");
        System.out.println(tabela.get(1));
        PostanskiBroj postanskiBroj=new PostanskiBroj();
        postanskiBroj.dodajBroj("Beograd",11000);
        postanskiBroj.dodajBroj("Novi Sad", 21000);
        postanskiBroj.dodajBroj("Nis",18000);
        System.out.println(postanskiBroj.vratiBroj("Novi Sad"));
        System.out.println(postanskiBroj.vratiBrojZaMestoKojePocinje("Be"));
        System.out.println(postanskiBroj.vratiBroj("N"));


    }
}
