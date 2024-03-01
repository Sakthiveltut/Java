import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        // Original char array with duplicates
        char[] charArray = {'a', 'b', 'c', 'a', 'd', 'b', 'e'};

        // Remove duplicates using LinkedHashSet
        char[] uniqueArray = removeDuplicates(charArray);

        // Print the original and unique arrays
        System.out.println("Original Array: " + new String(charArray));
        System.out.println("Array with Duplicates Removed: " + new String(uniqueArray));
    }

    private static char[] removeDuplicates(char[] charArray) {
        // Convert char array to LinkedHashSet to remove duplicates and maintain order
        LinkedHashSet<Character> uniqueSet = new LinkedHashSet<>();
        for (char c : charArray) {
            uniqueSet.add(c);
        }

        // Convert LinkedHashSet back to char array
        char[] uniqueArray = new char[uniqueSet.size()];
        int index = 0;
        for (char c : uniqueSet) {
            uniqueArray[index++] = c;
        }

        return uniqueArray;
    }
}
