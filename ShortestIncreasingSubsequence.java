import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ShortestIncreasingSubsequence {

    public static List<Integer> shortestIncreasingSubsequence(List<Integer> arr) {
        // Sort the array in non-decreasing order
        arr.sort(null);

        // Initialize a set to store the increasing subsequence
        Set<Integer> increasingSubsequence = new HashSet<>();

        // For each element in the sorted array
        for (int num : arr) {
            // Check if it is not already in the increasing subsequence
            if (!increasingSubsequence.contains(num)) {
                // Add it to the increasing subsequence
                increasingSubsequence.add(num);
            }
        }

        // Find the remaining sequence after removing the increasing subsequence
        List<Integer> remainingSequence = new ArrayList<>();
        for (int num : arr) {
            if (!increasingSubsequence.contains(num)) {
                remainingSequence.add(num);
            }
        }

        return remainingSequence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        // Find the remaining sequence after removing the shortest increasing subsequence
        List<Integer> result = shortestIncreasingSubsequence(arr);

        // Print the remaining sequence
        System.out.println("Remaining sequence:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
