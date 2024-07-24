import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class CoinChangerTest {
    HashMap<String, Integer>coins;

    @BeforeEach
    void setup(){
        coins = new HashMap<>();
    }

    @Test
    void zeroCoins(){
        coins = coinChanger.makeChange(0);
        assertEquals(0, coins.size());
    }

    @Test
    void onePenny(){
        coins = coinChanger.makeChange(1);
        assertEquals(1, coins.get("pennies"));
    }

    @Test
    void twoPennies(){
        coins = coinChanger.makeChange(2);
        assertEquals(2, coins.get("pennies"));
    }

    @Test
    void oneNickel(){
        coins = coinChanger.makeChange(5);
        assertEquals(1, coins.get("nickels"));
        assertNull(coins.get("pennies"));
    }

    @Test
    void oneNickelOnePenny(){
        coins = coinChanger.makeChange(6);
        assertEquals(1, coins.get("nickels"));
        assertEquals(1, coins.get("pennies"));
    }

    @Test
    void oneNickelTwoPennies(){
        coins = coinChanger.makeChange(7);
        assertEquals(1, coins.get("nickels"));
        assertEquals(2, coins.get("pennies"));
    }

    @Test
    void oneDime(){
        coins = coinChanger.makeChange(10);
        assertEquals(1, coins.get("dimes"));
        assertNull(coins.get("pennies"));
        assertNull(coins.get("nickels"));
    }

    @Test
    void oneDimeOneNickelOnePenny(){
        coins = coinChanger.makeChange(16);
        assertEquals(1, coins.get("dimes"));
        assertEquals(1, coins.get("pennies"));
        assertEquals(1, coins.get("nickels"));
    }

    @Test
    void oneQuarter(){
        coins = coinChanger.makeChange(25);
        assertEquals(1, coins.get("quarters"));
        assertNull(coins.get("pennies"));
        assertNull(coins.get("nickels"));
        assertNull(coins.get("dimes"));
    }

    @Test
    void fourQuartersOneDimeOneNickelOnePenny(){
        coins = coinChanger.makeChange(116);
        assertEquals(4, coins.get("quarters"));
        assertEquals(1, coins.get("pennies"));
        assertEquals(1, coins.get("nickels"));
        assertEquals(1, coins.get("dimes"));
    }

    @Test
    void fourQuartersOneDimeOneNickelFourPennies(){
        coins = coinChanger.makeChange(119);
        assertEquals(4, coins.get("quarters"));
        assertEquals(4, coins.get("pennies"));
        assertEquals(1, coins.get("nickels"));
        assertEquals(1, coins.get("dimes"));
    }
}