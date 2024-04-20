import java.util.Scanner;

public class DuplicateCharacterRemover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String result = removeDuplicates(input);
        
        System.out.println("String after removing duplicates: " + result);
        
        scanner.close();
    }
    
    public static String removeDuplicates(String str) {
        // Create a StringBuilder to store the string without duplicates
        StringBuilder resultBuilder = new StringBuilder();
        
        // Create a boolean array to keep track of characters already encountered
        boolean[] encountered = new boolean[256]; // Assuming ASCII characters
        
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // If the character is encountered for the first time, append it to the result
            if (!encountered[ch]) {
                resultBuilder.append(ch);
                encountered[ch] = true;
            }
        }
        
        // Convert the StringBuilder to a String
        String result = resultBuilder.toString();
        
        return result;
    }
}
