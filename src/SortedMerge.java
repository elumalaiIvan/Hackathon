import java.util.Arrays;
import java.util.PriorityQueue;

public class SortedMerge {
    public static void main(String[] args) {
        int[] firstArray = {1,2,6,12,13};
        int[] secondArray = {5,10};
        System.out.println(Arrays.toString(sortedMerge(new int[]{1,2,6,12,13}, secondArray)));
        System.out.println(Arrays.toString(sortedMergeWithArraycopy(firstArray, secondArray)));
        System.out.println(Arrays.toString(sortedMergeWithPriorityQueue(firstArray, secondArray)));
    }

    //time complexity ->
    private static int[] sortedMerge(int[] firstArray, int[] secondArray) {
        int firstPointer = 0;
        int secondPointer = 0;
        int mergedArrayPointer = 0;
        int[] mergedArray = new int[firstArray.length + secondArray.length];
        //we can even do with dynamic list;
//         List<Integer> sortedList = new ArrayList<>(firstArray.length + secondArray.length);

        while (firstPointer < firstArray.length && secondPointer < secondArray.length) {
            int firstValue = firstArray[firstPointer];
            int secondValue = secondArray[secondPointer];

          if (firstValue < secondValue) {
              mergedArray[mergedArrayPointer] = firstValue;
//              sortedList.add(firstValue);
              firstPointer++;
          } else {
              mergedArray[mergedArrayPointer] = secondValue;
//              sortedList.add(secondValue);
              secondPointer++;
          }
          mergedArrayPointer++;
        }
        while (secondPointer < secondArray.length) {
            mergedArray[mergedArrayPointer] = secondArray[secondPointer];
            mergedArrayPointer++;
            secondPointer++;
        }
        while (firstPointer < firstArray.length) {
            mergedArray[mergedArrayPointer] = firstArray[firstPointer];
            mergedArrayPointer++;
            firstPointer++;
        }

        return mergedArray;
    }

    //complexity -> The time complexity of this approach is O((m + n) log(m + n)), where m and n are the sizes of the two arrays.

    public static int[] sortedMergeWithPriorityQueue(int[] firstArray, int[] secondArray) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int m = firstArray.length;
        int n = secondArray.length;
        int[] mergedArray = new int[m + n];

        // Add all elements from both arrays to the minHeap
        for (int num : firstArray) {
            minHeap.add(num);
        }
        for (int num : secondArray) {
            minHeap.add(num);
        }

        // Retrieve elements from minHeap and put them into the mergedArray
        int k = 0;
        while (!minHeap.isEmpty()) {
            mergedArray[k++] = minHeap.poll();
        }

        return mergedArray;

    }

    //complexity - O((m + n) log(m + n)), where m and n are the sizes of the two arrays.
    public static int[] sortedMergeWithArraycopy(int[] firstArray, int[] secondArray) {
        int capacity = firstArray.length + secondArray.length;
        int[] mergedArray = new int[capacity];

        System.arraycopy(firstArray, 0, mergedArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, mergedArray, firstArray.length, secondArray.length);

        return Arrays.stream(mergedArray).sorted().toArray();

    }

}
