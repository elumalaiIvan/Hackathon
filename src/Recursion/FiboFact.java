package Recursion;


public class FiboFact {
    private static long[] fiboCache;
    // 3*2*1
    public static void main(String[] args) {

//        System.out.println(getFactorial(5));
//        System.out.println(getFactorialWithoutRecursion(5));

        int fiboNum = 50;

        fiboCache = new long[fiboNum + 1];
        System.out.println(getFibo(fiboNum));
    }

    private static int getFactorial(int num) {
        if (num == 0) return 1;
        return num * getFactorial(num - 1);
    }

    private static int getFactorialWithoutRecursion(int num) {
        int result = num;
       for (int i = num - 1; i > 1; i--) {
           result = result * i;
       }
       return result;
    }


// 0 1 1 2 3 5 8 13 21 34 55
    public static long getFibo(int num) {
        if (num <= 1) return num ;
        if (fiboCache[num] != 0) return fiboCache[num];

        long result = getFibo(num-1) + getFibo(num-2);
        fiboCache[num] = result;

        return result;
    }

}
