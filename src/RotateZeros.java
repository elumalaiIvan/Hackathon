import java.util.Arrays;

public class RotateZeros {
    public static void main(String[] args) {
        int[] array = new int[]{1,0,2,0,0,3};
        rotateZeros(array);
        System.out.println(Arrays.toString(array));
    }

    private static void rotateZeros(int[] nums) {
        int first = 0;
        int second = nums.length - 1;
       // 1,0,2,0,0,3
        while (first < second && first < nums.length - 1 && second > 1) {
            if (nums[first] == 0) {
                if (nums[second] == 0) {
                    second --;
                } else {
                    nums[first] = nums[second];
                    nums[second] = 0;
                    first++;
                    second--;
                }
            } else {
                first++;
            }
        }
    }
}
