public class testquest {
    public static void main(String[] args) {
        // Original string
        String input = "java! python! php!";

        // Step 1: Remove exclamation marks
        String cleanedString = input.replace("!", "");

        // Step 2: Split the string into words
        String[] words = cleanedString.split(" ");

        // Step 3: Capitalize the first letter of each word
        StringBuilder formattedString = new StringBuilder();
        for (String word : words) {
            // Capitalize the first letter and append to result
            formattedString.append(word.substring(0, 1).toUpperCase()) // First letter
                    .append(word.substring(1))                 // Rest of the word
                    .append(" ");                              // Add space
        }

        // Step 4: Trim the final string to remove trailing space
        String result = formattedString.toString().trim();

        // Output the result
        System.out.println("Formatted String: " + result);
    }
}
