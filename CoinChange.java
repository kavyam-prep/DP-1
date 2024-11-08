import java.util.Arrays;

/**
 *  CoinChange : CoinChange
 *
 * @author : Kavya Mandaliya
 * @version : 1.0 (Nov 05, 2024)
 * @since : 1.0 (Nov 05, 2024)
 *
 */
 public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int max = amount+1;
        int dp[] = new int[max];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for(int i = 1; i <= amount; i++){
          for(int j = 0; j < coins.length; j++){
            if(coins[j] <= i){
             dp[i] = Math.min(dp[i], dp[i-coins[j]] + 1);
            }
          }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
