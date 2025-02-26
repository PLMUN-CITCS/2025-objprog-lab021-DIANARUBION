import java.util.Scanner;

public class WordCounter {

    // To get a sentence input from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();  // Close the scanner after reading input
        return sentence;
    }

    // To count the number of words in the given sentence
    public static int countWords(String sentence) {
        // Trim leading and trailing spaces, then split based on one or more spaces
        if (sentence.trim().isEmpty()) {
            return 0; // Handle empty input case
        }
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        // Get user input
        String sentence = getSentenceInput();
        
        // Count words in the sentence
        int wordCount = countWords(sentence);
        
        // Display the result
        System.out.println("The sentence has " + wordCount + " words.");
    }
}
