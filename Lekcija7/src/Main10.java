import java.util.ArrayList;

public class Main10 {

    public static void main(String[] args) {

        Fig10 fig10 = new Fig10(6);
        System.out.println(fig10.baci());


        ArrayList<Integer> bacanja = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {

            bacanja.add(fig10.baci());
        }
        for (int bacanje : bacanja) {
            System.out.print(bacanje + " ,");
        }

        for (int i = 0; i < bacanja.size(); i++) {

            System.out.print(bacanja.get(i));
            System.out.print((i < bacanja.size() - 1) ? "," : ".");
        }


    }
}
