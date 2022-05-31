/**
 * LeetCode 338.比特位计数
 */
public class Solution_338 {
    public int[] countBits(int n) {
        int[] output = new int[n+1];
        output[0] = 0;
        if (n == 0) {
            return output;
        }
        output[1] = 1;
        for (int i = 2; i < n+1; i++) {
            if (i%2 == 1) {
                output[i] = output[i-1] + 1;
            }
            else {
                output[i] = output[i/2];
            }
        }

        return output;
    }
}
