class optimized {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n; // Return n for 1 or 2 steps
        }

        int first = 1; // Ways to reach step 1
        int second = 2; // Ways to reach step 2

        for (int i = 3; i <= n; i++) {
            int third = first + second; 
            first = second;
            second = third; 
        }

        return second;
    }
}
