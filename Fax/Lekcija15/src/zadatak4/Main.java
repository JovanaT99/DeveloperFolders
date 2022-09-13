package zadatak4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Clan> list = new ArrayList<>();
        list.add(new Clan("Joki", 158));
        list.add(new Clan("Pera", 170));
        list.add(new Clan("Mika", 180));

        for (Clan c : list) {

            System.out.println(c);
        }

        Collections.sort(list);
        System.out.println("Sort po visini:");
        for (Clan c : list) {
            System.out.println(c);
        }

        System.out.println("Najvisi clan:" + Collections.max(list));
        System.out.println("Najnizi clan:" + Collections.min(list));


        Clan clan = new Clan("Mile", 170);
        int index = Collections.binarySearch(list, clan);
        if (index >= 0) {

            System.out.println("pronadjen clan" + list.get(index));
        } else {

            // System.out.println("Nije pronadjen sa visionom " +  clan.getVisina);
        }
        clan.setVisina(150);
        index = Collections.binarySearch(list, clan);
        if (index >= 0) {

            System.out.println("pronadjen clan" + list.get(index));
        } else {

            // System.out.println("Nije pronadjen sa visionom " +  clan.getVisina);
        }

    }
}

