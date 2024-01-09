import java.util.HashMap;
import java.util.Map;

public class MajarityElement {

    public static void main(String[] args) {
        int[] elements = {1,2,5,5,5,2,1,1,1};
        findMajerityElement(elements);
    }

    private static void findMajerityElement(int[] elements) {
        Map<Integer, Integer> elementCount = HashMap.newHashMap(elements.length);
        for (int element : elements) {
         int updatedCount = elementCount.getOrDefault(element, 0) + 1;
         elementCount.put(element, updatedCount);
        }
        System.out.println(elementCount);
    }


}

