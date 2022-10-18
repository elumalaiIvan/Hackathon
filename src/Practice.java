import java.util.function.Function;

public class Practice {
    public static void main(String[] args) {
       measure((Void) -> {
           int maxSumPossible = new MaxSumPossible().findMaxSumPossibleApproach3(new int[]{100, 200, 300, 400}, 2);
           System.out.println("maximum sum is: " + maxSumPossible);
           return null;
       });
    }

    static void measure(Function<Void, Void> closure) {
        long start2 = System.currentTimeMillis();
        closure.apply(null);
        long end2 = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds: "+ (end2-start2));
    }
}