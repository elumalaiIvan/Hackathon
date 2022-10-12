public class MaxSumPossible {
   /*  Given an array of integers of size ‘n’.
        Our aim is to calculate the maximum sum possible for ‘k’ consecutive elements in the array.

        Input  : arr[] = {100, 200, 300, 400}
        k = 2
        Output : 700*/

    // Elapsed Time in milli seconds: 4
    int findMaxSumPossibleApproach1(int[] inputs, int window) {
        int maxSum = 0;

        for (int startPointer = 0, endPointer = window - 1; startPointer <= inputs.length - window; startPointer++, endPointer++) {
//            System.out.println("start pointer: " + inputs[startPointer] + " end pointer: " + inputs[endPointer]);
            int addition = 0;

            for (int i = startPointer; i <= endPointer; i++) {
                addition += inputs[i];
            }

            if (addition > maxSum) {
                maxSum = addition;
            }
        }
        return maxSum;
    }

//Input  : arr[] = {100, 200, 300, 400, 500}
    //Elapsed Time in milli seconds: 3
    int findMaxSumPossibleApproach2(int[] arr, int k)
    {
        int n = arr.length;
        // n must be greater
        if (n < k) {
            System.out.println("Invalid");
            return -1;
        }

        // Compute sum of first window of size k
        int max_sum = 0;
        for (int i = 0; i < k; i++)
            max_sum += arr[i];

        // Compute sums of remaining windows by
        // removing first element of previous
        // window and adding last element of
        // current window.
        int window_sum = max_sum;
        for (int i = k; i < n; i++) {
            window_sum += arr[i] - arr[i - k];
            //300+300-100

            max_sum = Math.max(max_sum, window_sum);
        }

        return max_sum;
    }

    //Input  : arr[] = {100, 200, 300, 400, 500}
    // Elapsed Time in milli seconds: 1
    int findMaxSumPossibleApproach3(int[] inputs, int window) {
        int maxSum = 0,windowSum = 0;

        for (int i = 0; i < inputs.length; i++) {
            windowSum += inputs[i];
            if (i >= window) {
                windowSum -= inputs[i - window];
                maxSum = Math.max(maxSum, windowSum);
            }
        }
        return maxSum;
    }
}