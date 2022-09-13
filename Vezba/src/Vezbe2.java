import java.util.Scanner;

public class Vezbe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite rec:");
        String unos = scanner.nextLine();
        int palindrom = unos.length();
        StringBuilder reversee = new StringBuilder();
        for (int i = palindrom - 1; i >= 0; i--) {
            reversee.append(unos.charAt(i));
        }
        if (unos.equals(reversee.toString()))
            System.out.println("Palindrom");
        else
            System.out.println("Nije palindrom");
    }
}

