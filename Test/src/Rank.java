import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Rank {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
//            StringTokenizer strTokens = new StringTokenizer(s, "?/',-");
//            System.out.println(strTokens.countTokens());
        if (s.length() > 0) {
            String reg = ("[!,?._'@\\s]+");
            String[] splitovanje = s.split(reg);
            System.out.println(splitovanje.length);

            for (String sp : splitovanje) {
                System.out.println(sp);
            }

        }else{
            System.out.println(0);
        }
    }
}



