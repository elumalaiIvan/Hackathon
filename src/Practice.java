public class Practice {
    public static void main(String[] args) {
        long start2 = System.currentTimeMillis();
        int maxSumPossible = new MaxSumPossible().findMaxSumPossibleApproach1(new int[]{100, 200, 300, 400}, 2);
        long end2 = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds: "+ (end2-start2));
        System.out.println("maximum sum is: " + maxSumPossible);
    }
}