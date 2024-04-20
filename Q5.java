import java.util.Scanner;

public class PigLatinTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        
        String pigLatinSentence = translateToPigLatin(input);
        
        System.out.println("Pig Latin translation: " + pigLatinSentence);
        
        scanner.close();
    }
    
    public static String translateToPigLatin(String sentence) {
        // Split the sentence into words based on spaces
        String[] words = sentence.split("\\s+");
        
        // Create a StringBuilder to store the Pig Latin translation
        StringBuilder pigLatinBuilder = new StringBuilder();
        
        // Loop through each word in the sentence
        for (String word : words) {
            // Check if the word starts with a consonant
            if (!startsWithVowel(word)) {
                // Move the first consonant sound to the end of the word
                int indexOfFirstVowel = indexOfFirstVowel(word);
                String firstConsonantSound = word.substring(0, indexOfFirstVowel);
                String restOfWord = word.substring(indexOfFirstVowel);
                word = restOfWord + firstConsonantSound;
            }
            
            // Add "ay" to the end of the word
            word = word.concat("ay");
            
            // Append the translated word to the Pig Latin translation
            pigLatinBuilder.append(word).append(" ");
        }
        
        // Convert the StringBuilder to a String
        String pigLatinSentence = pigLatinBuilder.toString().trim();
        
        return pigLatinSentence;
    }
    
    // Method to check if a word starts with a vowel
    public static boolean startsWithVowel(String word) {
        return "aeiouAEIOU".indexOf(word.charAt(0)) != -1;
    }
    
    // Method to find the index of the first vowel in a word
    public static int indexOfFirstVowel(String word) {
        for (int i = 0; i < word.length(); i++) {
            if ("aeiouAEIOU".indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1;
    }
}
