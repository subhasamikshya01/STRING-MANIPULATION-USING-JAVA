public class Q4 {
    public static String generateAcronym(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split("\\s+");
        
        // Create a StringBuilder to store the acronym
        StringBuilder acronym = new StringBuilder();
        
        // Loop through the words and append the first letter of each word in uppercase to the acronym
        for (String word : words) {
            if (!word.isEmpty()) {
                acronym.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        
        return acronym.toString();
    }
    
    public static void main(String[] args) {
        String sentence = "this is a test sentence";
        String acronym = generateAcronym(sentence);
        System.out.println("Acronym: " + acronym);
    }
}
