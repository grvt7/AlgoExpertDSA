package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * TwoNumberSum
 */
public class TwoNumberSum {
    // Bruteforce Approach Time: O(n^2) | Space O(1)
    // public static int[] twoNumberSum(int[] array, int targetSum) {
    // for (int i = 0; i < array.length; i++) {
    // for (int j = i + 1; j < array.length; j++) {
    // if (array[i] + array[j] == targetSum)
    // return new int[] { array[i], array[j] };
    // }
    // }
    // return new int[0];
    // }

    // HashSet or HashSet Approach Time: O(n) | Space O(n)
    // public static int[] twoNumberSum(int[] array, int targetSum) {
    // Set<Integer> data = new HashSet<>();
    // for (int num : array) {
    // int match = targetSum - num;
    // if (data.contains(match))
    // return new int[] { match, num };
    // data.add(num);
    // }
    // return new int[0];
    // }

    // Two Pointers Approach Time: O(nlog(n)) | Space O(1)
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        int left = 0, right = array.length - 1;
        while (left < right) {
            if (array[left] + array[right] == targetSum)
                return new int[] { array[left], array[right] };
            else if (array[left] + array[right] < targetSum)
                left += 1;
            else
                right -= 1;
        }
        return new int[0];
    }
}