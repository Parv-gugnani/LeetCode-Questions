static int minimumSwaps(int[] arr) {
    int n = arr.length;
    int swapCount = 0;
    boolean[] visited = new boolean[n];

    for (int i = 0; i < n; i++) {
        // If already visited or already in the correct place
        if (visited[i] || arr[i] == i + 1) continue;

        int cycleSize = 0;
        int x = i;

        // Traverse the cycle
        while (!visited[x]) {
            visited[x] = true;
            x = arr[x] - 1; // Adjust index from 1-based to 0-based
            cycleSize++;
        }

        // If there is a cycle of size > 1, we need (cycleSize - 1) swaps
        if (cycleSize > 1) swapCount += (cycleSize - 1);
    }

    return swapCount;
}
