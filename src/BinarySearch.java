import java.util.function.Function;

public class BinarySearch {
    public static void main(String[] args) {
//       measure((Void) -> {
//           int maxSumPossible = new MaxSumPossible().findMaxSumPossibleApproach3(new int[]{100, 200, 300, 400}, 2);
//           System.out.println("maximum sum is: " + maxSumPossible);
//           return null;
//       });

//        int[] sortedArray = {1, 2, 3, 4, 5, 6, 9};
//        int resultIndex = binarySearch(sortedArray, 3);
//       if ( resultIndex == -1){
//           System.out.println("not found");
//       } else {
//           System.out.println("index found: " + resultIndex);
//       }

       int[] firstOccurrenceSortedArray = {1, 2, 5, 5, 5, 6, 6, 8, 9, 9};
//       int result = findFirstOccuranceOfNumber(firstOccurrenceSortedArray, 5);
//       int result1 = findLastOccuranceOfNumber(firstOccurrenceSortedArray, 5);

//        System.out.println("first occurrence found " + result1);
     firstAndLast(firstOccurrenceSortedArray, 5);

    }
    // 0 1 2 3 4 5 6
    // 1 2 3 4 5 6 9
    static int binarySearch(int[] sortedArray, int target) {
        int start = 0;
        int end = sortedArray.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
//            int middle = (end + start) / 2;
            int middleValue = sortedArray[middle];

            if (middleValue == target) {
                return sortedArray[middle];
            }
            if (target < middleValue) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }

    // {1, 2, 5, 6, 6, 6, 6, 8, 9, 9}
    public static int[] firstAndLast(int[] sortedArray, int target) {
        int[] result = new int[2];
        int start = 0;
        int end = sortedArray.length - 1;

        while (start < end) {
            int mid = (end + start)/2;
            if (sortedArray[mid] == target) {
                result[0] = sortedArray[mid];
                System.out.println("index " + mid);
                end = mid - 1;
//                return result;
            }
            else if (sortedArray[mid] < target) {
                start = mid + 1;
            } else if (sortedArray[mid] > target) {
                end = mid - 1;
            }
        }

        return result;
    }


//    int nums[] = {1, 2, 5, 5, 5, 6, 6, 8, 9, 9};
    static int findFirstOccuranceOfNumber(int[] sortedArray, int target) {
        int start = 0;
        int end = sortedArray.length - 1;
        int result = -1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
//            int middle = (end + start) / 2;
            int middleValue = sortedArray[middle];

            if (middleValue == target) {
                result = middle;
                end = middle - 1;
            }
            else if (target < middleValue) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return result;
    }

    static int findLastOccuranceOfNumber(int[] sortedArray, int target) {
        int start = 0;
        int end = sortedArray.length - 1;
        int result = -1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
//            int middle = (end + start) / 2;
            int middleValue = sortedArray[middle];

            if (middleValue == target) {
                result = middle;
                start = middle + 1;
            }
            else if (target < middleValue) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return result;
    }


    static void measure(Function<Void, Void> closure) {
        long start2 = System.currentTimeMillis();
        closure.apply(null);
        long end2 = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds: "+ (end2-start2));
    }
}