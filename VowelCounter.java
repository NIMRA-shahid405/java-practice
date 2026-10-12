import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = input.nextLine().toLowerCase();

        int vowels = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }
        }

        System.out.println("Vowels found: " + vowels);
    }
}