public class Q3 {
    public static String reverseWords(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split("\\s+");
        
        // Create a StringBuilder to store the reversed sentence
        StringBuilder reversedSentence = new StringBuilder();
        
        // Loop through the words in reverse order and append them to the StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]+" ");
            
//            // Append a space if it's not the first word
//            if (i > 0) {
//                reversedSentence.append(" ");
//            }
        }
        
        return reversedSentence.toString();
    }
    
    public static void main(String[] args) {
        String sentence = "Hello world, how are you?";
        String reversedSentence = reverseWords(sentence);
        System.out.println(reversedSentence);
    }
}
