import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();
        
        int charCount = sentence.length();
        String[] words = sentence.split(" ");
        int wordCount = words.length;
        
        System.out.println("Character count: " + charCount);
        System.out.println("Word count: " + wordCount);
    }
}