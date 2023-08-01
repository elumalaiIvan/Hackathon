import java.util.Arrays;

public class SortedMerge {
    public static void main(String[] args) {
//        int[] firstArray = {1,2,6,12,13};
        int[] secondArray = {5,10};

        System.out.println(Arrays.toString(sortedMerge(new int[]{1,2,6,12,13}, secondArray)));
    }

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

}
