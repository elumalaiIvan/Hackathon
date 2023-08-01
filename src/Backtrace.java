import java.util.ArrayList;
import java.util.List;

public class Backtrace {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        findPermutations(0, nums);
    }


    // [1, 2, 3]
    // [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
    // [1, 2, 3, 4],  [1, 3, 2, 4], [1, 3, 4, 2],  [1, 4, 2, 3], [1, 4, 3, 2]


//            [1, 2, 3, 4]
//            [1, 2, 4, 3]
//            [1, 3, 2, 4]
//            [1, 3, 4, 2]
//            [1, 4, 2, 3]
//            [1, 4, 3, 2]
//            [2, 1, 3, 4]
//            [2, 1, 4, 3]
//            [2, 3, 1, 4]
//            [2, 3, 4, 1]
//            [2, 4, 1, 3]
//            [2, 4, 3, 1]
//            [3, 1, 2, 4]
//            [3, 1, 4, 2]
//            [3, 2, 1, 4]
//            [3, 2, 4, 1]
//            [3, 4, 1, 2]
//            [3, 4, 2, 1]
//            [4, 1, 2, 3]
//            [4, 1, 3, 2]
//            [4, 2, 1, 3]
//            [4, 2, 3, 1]
//            [4, 3, 1, 2]
//            [4, 3, 2, 1]

    private static void findPermutations(int index, List<Integer> nums) {

    }
}
