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
}
