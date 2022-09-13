import java.util.Random;

public class VremenskaPrognoza {


    private Random generator;

    public VremenskaPrognoza() {

        generator = new Random();
    }


    public String vremePredvid() {

        double broj = generator.nextDouble();

        if (broj < 0.2) {
            return "oblacno";
        } else if (broj >= 0.2 && broj < 0.6) {
            return "kisa";
        } else {
            return "suncano";
        }
    }

    public int predvidTemp(String vreme) {

        if (vreme.equals("oblacno")) {
            return generator.nextInt(15) + 10;
        } else if (vreme.equals("kisa")) {
            return generator.nextInt(16) + 5;
        } else {

            return generator.nextInt(16) + 20;
        }
    }
}
