import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MajorityElement {

    public static void main(String[] args) {
        int[] elements = {1,2,5,5,5,5,5,5,5,1,1};
        findMajorityElement(elements);
    }

    private static void findMajorityElement(int[] elements) {
        Map<Integer, Integer> elementCount = HashMap.newHashMap(elements.length);
        for (int element : elements) {
         int updatedCount = elementCount.getOrDefault(element, 0) + 1;
         elementCount.put(element, updatedCount);
        }
        Map<Integer, Integer> majorityElementsMap = elementCount.entrySet().stream()
                .filter(entry -> entry.getValue() >= elements.length / 2)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(majorityElementsMap);
    }


}

