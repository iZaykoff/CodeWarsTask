package tasks.minimizeSumOfArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Solution.minSum(new int[]{5,4,2,3}));
        System.out.println(Solution.minSum(new int[]{12,6,10,26,3,24}));
        System.out.println(Solution.minSum(new int[]{9,2,8,7,5,4,0,6}));
    }

    static class Solution
    {
        static int minSum(int[] passed) {
            Arrays.sort(passed);
            int sum = 0;
            for (int i = 0; i < passed.length; i++) {
                sum += passed[i] * passed[passed.length-(1+i)];
            }

            return sum/2; // Do your magic!
        }
    }

}
