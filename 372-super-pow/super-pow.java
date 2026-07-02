class Solution {

    static final int MOD = 1337;

    public int superPow(int a, int[] b) {

        int result = 1;

        a %= MOD;   //keeps a small

        for(int digit : b) {

            result = powMod(result, 10);

            result = (result * powMod(a, digit)) % MOD;
        }

        return result;
    }

    private int powMod(int x, int n) {

        int result = 1;

        x %= MOD;   //keeps a small

        while(n > 0) {

            if((n & 1) == 1) {
                result = (result * x) % MOD;
            }

            x = (x * x) % MOD;

            n >>= 1;
        }

        return result;
    }
}