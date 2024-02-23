package Arrays;

import java.util.List;

public class ValidateSubsequence {
    // O(n) time | O(1) space
    public static boolean isValidSubsequence(
            List<Integer> array, List<Integer> sequence) {
        int sIndex = 0;
        for (int i = 0; i < array.size(); i++) {
            if (sIndex == sequence.size())
                break;
            if (array.get(i) == sequence.get(sIndex))
                sIndex++;
        }
        return sIndex == sequence.size();
    }

    // O(n) time | O(1) space
    public static boolean isValidSubsequence2(
            List<Integer> array, List<Integer> sequence) {
        int aIndex = 0, sIndex = 0;
        while (aIndex < array.size() && sIndex < sequence.size()) {
            if (array.get(aIndex).equals(sequence.get(sIndex)))
                sIndex++;
            aIndex++;
        }
        return sIndex == sequence.size();
    }
}
