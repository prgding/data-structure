package cc.ding.OriginVsAlgorithm;

public class Accumulate {
    public static long oneByOne(long n) {
        long sum = 0;
        for (long i = 1; i < n + 1; i++) {
            sum += i;
        }
        return sum;
    }

    public static long formula(long n) {
        return (1 + n) * n / 2;
    }

    public static void main(String[] args) {
        long n = 1000L;
        long startTime = System.nanoTime();
        long one = oneByOne(n);
        long endTime = System.nanoTime();
        long nano = (endTime - startTime);
        System.out.println("oneByOne: " + one + "，耗时 " + nano + " 纳秒。");

        startTime = System.nanoTime();
        long formula = formula(n);
        endTime = System.nanoTime();
        nano = (endTime - startTime);
        System.out.println("formula: " + formula + "，耗时 " + nano + " 纳秒。");

    }
}