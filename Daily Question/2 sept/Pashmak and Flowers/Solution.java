//not done by me this is done with help of chatgpt
import java.io.*;

import java.util.*;

public class Solution {
    
    static void findMaxBeautyDifferenceAndWays(int[] beauty) {
        int n = beauty.length;
        
        int minBeauty = Integer.MAX_VALUE;
        int maxBeauty = Integer.MIN_VALUE;
        
        for (int b : beauty) {
            if (b < minBeauty) minBeauty = b;
            if (b > maxBeauty) maxBeauty = b;
        }
        
        int countMin = 0;
        int countMax = 0;
        
        for (int b : beauty) {
            if (b == minBeauty) countMin++;
            if (b == maxBeauty) countMax++;
        }
        
        int maxDifference = maxBeauty - minBeauty;

        long ways;
        if (minBeauty == maxBeauty) {
            ways = (long) n * (n - 1) / 2;
        } else {
            ways = (long) countMin * countMax;
        }
        
        System.out.println(maxDifference + " " + ways);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int[] beauty = Arrays.stream(bufferedReader.readLine().trim().split(" "))
                              .mapToInt(Integer::parseInt)
                              .toArray();
        
        findMaxBeautyDifferenceAndWays(beauty);
        
        bufferedReader.close();
    }
}
