import java.util.ArrayList;

public class UniqueChars {
    public static void main(String[] args) {
        // Create a function called `uniqueCharacters` that takes a string as parameter
        // and returns a list with the unique letters of the given string
        // Create basic unit tests for it with at least 3 different test cases
        System.out.println(uniqueCharacters("anagram"));
        // Should print out:
        // ["n", "g", "r", "m"]
    }
    public static ArrayList<Character> uniqueCharacters(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        ArrayList<Character> uniqueLetters = new ArrayList<>();
        ArrayList<Character> notUniqueLetters = new ArrayList<>();
        for (int i = 0; i < sb.length(); i++) {
            if (!uniqueLetters.contains(sb.charAt(i))) {
                uniqueLetters.add(sb.charAt(i));
            } else {
                notUniqueLetters.add(sb.charAt(i));
            }
        }
        for (int i = 0; i < notUniqueLetters.size(); i++) {
            for (int j = 0; j < uniqueLetters.size(); j++) {
                if (notUniqueLetters.get(i).equals(uniqueLetters.get(j))) {
                    uniqueLetters.remove(j);
                }
            }
        }
        return uniqueLetters;
    }

}