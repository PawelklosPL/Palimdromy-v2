package palimdromyv2;
import java.util.Scanner;
public class Palimdromyv2 {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.println("Podaj zdanie: ");
        String text = reading.nextLine().toUpperCase().replace(" ", "");
        Boolean oddNumber = true;
        for (int i = 0; i <= text.length() - 1; i++) {
            if ((text.substring(i, i + 1)).equals(text.substring((text.length() - 1) - i, (text.length()) - i)) && oddNumber) {
                oddNumber = true;
            } else {
                oddNumber = false;
            }
        }
        if (oddNumber) {
            System.out.println("Zdanie jest palindromem");
        } else {
            System.out.println("Zdanie nie jest palindromem");
        }
    }
}