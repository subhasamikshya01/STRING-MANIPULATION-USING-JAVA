import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        char mostFrequent = findMostFrequentCharacter(input);
        
        System.out.println("The most frequent character is: " + mostFrequent);
        
        scanner.close();
    }
    
    public static char findMostFrequentCharacter(String str) {
        // Create an array to store character counts
        int[] charCounts = new int[256]; // Assuming ASCII characters
        
        // Count the occurrences of each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charCounts[ch]++;
        }
        
        // Find the index of the maximum count in the array
        int maxCountIndex = 0;
        for (int i = 1; i < charCounts.length; i++) {
            if (charCounts[i] > charCounts[maxCountIndex]) {
                maxCountIndex = i;
            }
        }
        
        // Convert the index to its corresponding character
        char mostFrequent = (char) maxCountIndex;
        
        return mostFrequent;
    }
}
