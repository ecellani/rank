package com.hackerrank.weekofcode.day1;

import java.util.Scanner;

/**
 * See CandyReplenishingRobot.png.
 * Sample Input:
 * 8 4
 * 3 1 7 5
 *
 * Sample Output 0:
 * 11
 */
public class CandyReplenishingRobot {

    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] c = new int[t];
        for(int c_i=0; c_i < t; c_i++){
            c[c_i] = in.nextInt();
        }

        int candies = n, bobAdds = 0;
        for (int $i = 0; $i < t - 1; $i++) {
            candies -= c[$i];
            if (candies < 5) {
                bobAdds += (n - candies);
                candies = n;
            }
        }
        System.out.println(bobAdds);
    }
}
