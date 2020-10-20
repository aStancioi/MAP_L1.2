public class Ub2 {
    public static int max(int[] n) {
        //returns the maximum number
        int max = 0, min = 101, smax = 0, smin = 0, sum;
        for (int i : n) {
            if (i > max)
                max = i;
        }
        return max;
    }

    public static int min(int[] n) {
        //returns the minimum number
        int min = max(n);
        for (int i : n) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static int maxminus(int[] n) {
        //returns the highest sum of n-1 elements;
        int sum = 0 - min(n);
        for (int i : n) {
            sum = sum + i;
        }
        return sum;
    }

    public static int minminus(int[] n) {
        //returns the lowest sum of n-1 elements;
        int sum = 0 - max(n);
        for (int i : n) {
            sum = sum + i;
        }
        return sum;
    }
}