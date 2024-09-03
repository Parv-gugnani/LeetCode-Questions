public class Solution {

    public int findMinDistance(int[] arr) {
        int n = arr.length;
        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;
        int maxIndex = -1;
        int minIndex = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
                maxIndex = i;
            }

            if (arr[i] < minElement) {
                minElement = arr[i];
                minIndex = i;
            }
        }

        // Now find the shortest distance between maxIndex and minIndex
        for (int i = 0; i < n; i++) {
            if (arr[i] == maxElement) {
                if (minIndex != -1) {
                    minDistance = Math.min(minDistance, Math.abs(i - minIndex));
                }
            } else if (arr[i] == minElement) {
                if (maxIndex != -1) {
                    minDistance = Math.min(minDistance, Math.abs(i - maxIndex));
                }
            }
        }

        return minDistance;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {7, 3, 2, 9, 5, 9, 2};
        System.out.println("Shortest distance between max and min: " + sol.findMinDistance(arr));
    }
}
