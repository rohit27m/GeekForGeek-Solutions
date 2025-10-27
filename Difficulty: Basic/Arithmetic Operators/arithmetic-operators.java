class Solution {
    public int[] computeOperations(int x, int y) {
        int a = x + y;
        int b = x - y;
        int c = x * y;
        int d = x / y;
        int e = x % y;
        return new int[]{a, b, c, d, e};
    }
}
