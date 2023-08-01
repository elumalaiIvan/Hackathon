import java.util.function.Function;

public class ProgramHelper {
    public static void measure(Function<Void, Void> closure) {
        long start2 = System.currentTimeMillis();
        closure.apply(null);
        long end2 = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds: "+ (end2-start2));
    }
}
