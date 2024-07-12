import java.util.HashMap;

public class coinChanger {

    public static HashMap<String, Integer> makeChange(Double amount) {
        HashMap<String, Integer> coins = new HashMap<String, Integer>();
        int n = (int) (Math.round(amount * 100));

        return calculateCoins(n, coins);
    }

    private static HashMap<String, Integer> calculateCoins(Integer n, HashMap<String, Integer> coins) {
        int[] coinValues = {25, 10, 5, 1};
        String[] coinNames = {"quarters", "dimes", "nickels", "pennies"};

        for (int i = 0; i < coinValues.length; i++) {
            if (n >= coinValues[i]) {
                int numCoins = (n / coinValues[i]);
                coins.put(coinNames[i], numCoins);
                n %= coinValues[i];
            }
        }

        return coins;
    }
}
