import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class MainVr {
    public static void main(String[] args) {


        VremenskaPrognoza vremenskaPrognoza = new VremenskaPrognoza();
        System.out.println(vremenskaPrognoza.vremePredvid());

        ArrayList<String> daniUnedelji = new ArrayList<>();
        daniUnedelji.add("Pon");
        daniUnedelji.add("Uto");
        daniUnedelji.add("Sre");
        daniUnedelji.add("Cet");
        daniUnedelji.add("Pet");
        daniUnedelji.add("Sub");
        daniUnedelji.add("Ned");

        //  Collections.addAll();
        System.out.println("Prognoza za celu nedelju");


        for (String s : daniUnedelji) {
            String vreme = vremenskaPrognoza.vremePredvid();
            System.out.println(s + "-" + vreme + "-" + vremenskaPrognoza.predvidTemp(vreme));

        }
    }
}
