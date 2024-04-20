import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the message to encrypt: ");
        String message = scanner.nextLine();
        System.out.print("Enter the encryption key (a number between 1 and 25): ");
        int key = scanner.nextInt();
        
        String encryptedMessage = encrypt(message, key);
        System.out.println("Encrypted message: " + encryptedMessage);
        
        String decryptedMessage = decrypt(encryptedMessage, key);
        System.out.println("Decrypted message: " + decryptedMessage);
        
        scanner.close();
    }
    
    public static String encrypt(String message, int key) {
        StringBuilder encrypted = new StringBuilder();
        
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Shift the character by the key value
                char encryptedChar = (char) ('A' + (ch - 'A' + key) % 26);
                encrypted.append(encryptedChar);
            } else {
                // If the character is not a letter, keep it unchanged
                encrypted.append(ch);
            }
        }
        
        return encrypted.toString();
    }
    
    public static String decrypt(String encryptedMessage, int key) {
        // Decryption is the same as encryption but with a negative key
        return encrypt(encryptedMessage, 26 - key);
    }
}
