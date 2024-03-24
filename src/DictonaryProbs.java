import java.util.*;

public class DictonaryProbs {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(arrayRotation(3, new int[]{0, 1, 2, 3, 4, 5, 6, 7})));
//        System.out.println(Arrays.toString(mapRotation(3, new int[]{0, 1, 2, 3, 4, 5, 6, 7})));
        HashMap<Integer, Integer> newHash = new HashMap<>();
        newHash.put(11, 3);
        newHash.put(8, 3);
        newHash.put(9, 2);
        newHash.put(10, 2);
        newHash.put(40, 1);
        var result = keyValueRotation(newHash);
    }

    public static Map<Integer, List<Integer>> keyValueRotation(HashMap<Integer, Integer> inputMap) {
        Map<Integer, List<Integer>> resultMap = new HashMap<>();
        inputMap.forEach((key, value) -> {
           resultMap.putIfAbsent(value, new ArrayList<>());
           resultMap.get(value).add(key);
        });
        return resultMap;
    }
}
