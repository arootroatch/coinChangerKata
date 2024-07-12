import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoinChangerTest {

    static HashMap<String, Integer>coins = new HashMap<String, Integer>();

    @Test
    void emptyMapZeroCoins() {
        coins.clear();
        assertEquals(coins, coinChanger.makeChange(0.0));
    }

    @Test
    void onePennyOneCent(){
        coins.clear();
        coins.put("pennies", 1);
        assertEquals(coins, coinChanger.makeChange(0.01));
    }

    @Test
    void twoPennyTwoCents(){
        coins.clear();
        coins.put("pennies", 2);
        assertEquals(coins, coinChanger.makeChange(0.02));
    }

    @Test
    void threePenniesThreeCents(){
        coins.clear();
        coins.put("pennies", 3);
        assertEquals(coins, coinChanger.makeChange(0.03));
    }

    @Test
    void oneNickelFiveCents(){
        coins.clear();
        coins.put("nickels", 1);
        assertEquals(coins, coinChanger.makeChange(0.05));
    }

    @Test
    void oneNickelOnePenny(){
        coins.clear();
        coins.put("pennies", 1);
        coins.put("nickels", 1);
        assertEquals(coins, coinChanger.makeChange(0.06));
    }

    @Test
    void oneNickelTwoPennies(){
        coins.clear();
        coins.put("nickels", 1);
        coins.put("pennies", 2);
        assertEquals(coins, coinChanger.makeChange(0.07));
    }

    @Test
    void oneDime(){
        coins.clear();
        coins.put("dimes", 1);
        assertEquals(coins, coinChanger.makeChange(0.10));
    }

    @Test
    void oneDimeOneNickel(){
        coins.clear();
        coins.put("dimes", 1);
        coins.put("nickels", 1);
        assertEquals(coins, coinChanger.makeChange(0.15));
    }

    @Test
    void oneDimeOneNickelOnePenny(){
        coins.clear();
        coins.put("dimes", 1);
        coins.put("nickels", 1);
        coins.put("pennies", 1);
        assertEquals(coins, coinChanger.makeChange(0.16));
    }

    @Test
    void twoDimes(){
        coins.clear();
        coins.put("dimes", 2);
        assertEquals(coins, coinChanger.makeChange(0.20));
    }

    @Test
    void oneQuarter(){
        coins.clear();
        coins.put("quarters", 1);
        assertEquals(coins, coinChanger.makeChange(0.25));
    }

    @Test
    void oneQuarterOneNickel(){
        coins.clear();
        coins.put("quarters", 1);
        coins.put("nickels", 1);
        assertEquals(coins, coinChanger.makeChange(0.30));
    }

    @Test
    void oneQuarterOneDime(){
        coins.clear();
        coins.put("quarters", 1);
        coins.put("dimes", 1);
        assertEquals(coins, coinChanger.makeChange(0.35));
    }

    @Test
    void oneQuarterOneDimeOnePenny(){
        coins.clear();
        coins.put("quarters", 1);
        coins.put("dimes", 1);
        coins.put("pennies", 1);
        assertEquals(coins, coinChanger.makeChange(0.36));
    }

    @Test
    void twoQuarters(){
        coins.clear();
        coins.put("quarters", 2);
        assertEquals(coins, coinChanger.makeChange(0.50));
    }

    @Test
    void fourQuarters(){
        coins.clear();
        coins.put("quarters", 4);
        assertEquals(coins, coinChanger.makeChange(1.00));
    }

    @Test
    void fourQuartersOneDimeOneNickelOnePenny(){
        coins.clear();
        coins.put("quarters", 4);
        coins.put("dimes", 1);
        coins.put("nickels", 1);
        coins.put("pennies", 1);
        assertEquals(coins, coinChanger.makeChange(1.16));
    }
}