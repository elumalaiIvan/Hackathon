import java.util.Arrays;

public class DistributeEqually {

    public static void main(String[] args) {
        int valueToDistribute = 25;
        int numberOfPositions = 8;

        int[] distribution = distributeEqually(valueToDistribute, numberOfPositions);

        System.out.println("Original Value: " + valueToDistribute);
        System.out.println("Number of Positions: " + numberOfPositions);
        System.out.println("Distributed Values: " + Arrays.toString(distribution));
    }

    private static int[] distributeEqually(int value, int positions) {
        int[] distribution = new int[positions];
        int quotient = value / positions;
        int remainder = value % positions;

        // Distribute equally
        for (int i = 0; i < positions; i++) {
            distribution[i] = quotient;
            if (remainder > 0) {
                distribution[i]++;
                remainder--;
            }
        }

        return distribution;
    }
}
