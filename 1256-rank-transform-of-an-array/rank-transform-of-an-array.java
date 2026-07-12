class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        int s= 0;
        for (int x : sorted) {
            if (s == 0 || sorted[s - 1] != x) {
                sorted[s++] = x;
            }
        }
        int[] unique = Arrays.copyOf(sorted, s);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Arrays.binarySearch(unique, arr[i]) + 1;
        }
        return arr;
    }
}