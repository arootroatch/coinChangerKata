import java.util.HashMap;

public class coinChanger {

    public static HashMap<String, Integer> makeChange(Double amount) {
        HashMap<String, Integer>coins = new HashMap<String, Integer>();
        String[] coinNames = {"quarters", "dimes", "nickels", "pennies"};
        int[] coinValues = {25, 10, 5, 1};
        int n = (int) (Math.round(amount * 100));

        for (int i = 0; i < coinNames.length; i++){
            if (n >= coinValues[i]){
                coins.put(coinNames[i], (n / coinValues[i]));
                n %= coinValues[i];
            }
        }
        return coins;
    }
}
