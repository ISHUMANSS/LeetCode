/**
 * @param {number} n
 * @param {number} x
 * @return {number}
 */
var numberOfWays = function(n, x) {
    const MOD = 1e9 + 7;
    const dp = Array(n + 1).fill(0);
    dp[0] = 1;

    for (let a = 1; ; a++) {
        const power = Math.pow(a, x);
        if (power > n) break;
        for (let j = n; j >= power; j--) {
            dp[j] = (dp[j] + dp[j - power]) % MOD;
        }
    }

    return dp[n];
};