import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Algorithms {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(find2Sum(new int[]{7, 6, 3, 8, 2}, 5)));
    }

    private static int[] find2Sum(int[] ints, int target) {
        int[] resultArray = new int[2];
        Map<Integer, Integer> tempMap = new HashMap<>();
        for (int i = 0; i < ints.length; i++) {
            Integer secondValue = target - ints[i];
            if (tempMap.containsKey(secondValue)) {
                resultArray[0] = ints[i];
                resultArray[1] = secondValue;
                break;
            }
            tempMap.put(ints[i], i);
        }
        return resultArray;
    }
}

