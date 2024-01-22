import java.util.Arrays;

public class ArrayProbs {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(arrayRotation(3, new int[]{0, 1, 2, 3, 4, 5, 6, 7})));
        System.out.println(Arrays.toString(arrayRotationApproach2(3, new int[]{0, 1, 2, 3, 4, 5, 6, 7})));
    }

    private static int[] arrayRotation(int k, int[] ints) {
        /*
        0 5 (8 - 3 + 0)
        1 6 8 - 3 + 1
        2 7
        space O(n)
        time O(n)
         */

        int[] rotatedArray = new int[ints.length];
        int rotationPointer = 0;

        for (int index = ints.length - k; index < ints.length; index++) {
            rotatedArray[rotationPointer++] = ints[index];
        }
        for (int index = 0; index < ints.length - k; index++) {
            rotatedArray[rotationPointer++] = ints[index];
        }

        return rotatedArray;
    }
    private static int[] arrayRotationApproach2(int k, int[] ints) {
        /*
        0, 1, 2, 3, 4, 5, 6, 7
        split the array into two part
        rotate first part 4,3,2,1,0
        rotate second part 4,3,2,1,0,7,6,5
        rotate whole array 5,6,7,4,3,2,1,0

        space O(1)
        time O(n)
         */

        rotate(0, ints.length - 1 - k, ints);
        rotate(ints.length - k, ints.length - 1, ints);
        rotate(0, ints.length - 1, ints);

        return ints;
    }

    private static void rotate(int start, int end, int[] ints) {
        // 1 2 3 4 -> 4 3 2 1
        while (start < end) {
            int temp = ints[start];
            ints[start] = ints[end];
            ints[end] = temp;
            start++;
            end--;
        }

    }



}
