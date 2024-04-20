import java.util.Scanner;

public class StringRotationChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        
        if (areRotations(str1, str2)) {
            System.out.println("The strings are rotations of each other.");
        } else {
            System.out.println("The strings are not rotations of each other.");
        }
        
        scanner.close();
    }
    
    public static boolean areRotations(String str1, String str2) {
        // Check if the lengths of the strings are equal and not empty
        if (str1.length() != str2.length() || str1.isEmpty() || str2.isEmpty()) {
            return false;
        }
        
        // Concatenate str1 with itself to check if str2 is a substring of the concatenated string
        String concatenated = str1.concat(str1);
        
        // Check if str2 is a substring of the concatenated string
        if (concatenated.indexOf(str2) != -1) {
            return true;
        }
        
        return false;
    }
}
