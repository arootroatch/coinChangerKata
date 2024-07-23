import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoinChangerTest {
    HashMap<String, Integer>coins;

    @BeforeEach
    void setup(){
        coins = new HashMap<>();
    }

    @Test
    void zeroCoins() {
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
    void threePennies(){
        coins = coinChanger.makeChange(3);
        assertEquals(3, coins.get("pennies"));
    }

    @Test
    void oneNickel(){
        coins = coinChanger.makeChange(5);
        assertEquals(1, coins.get("nickels"));
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
    }

    @Test
    void oneDimeOneNickel(){
        coins = coinChanger.makeChange(15);
        assertEquals(1, coins.get("nickels"));
        assertEquals(1, coins.get("dimes"));
    }

    @Test
    void oneDimeOneNickelOnePenny(){
        coins = coinChanger.makeChange(16);
        assertEquals(1, coins.get("nickels"));
        assertEquals(1, coins.get("pennies"));
        assertEquals(1, coins.get("dimes"));
    }

    @Test
    void twoDimes(){
        coins = coinChanger.makeChange(20);
        assertEquals(2, coins.get("dimes"));
    }

    @Test
    void oneQuarter(){
        coins = coinChanger.makeChange(25);
        assertEquals(1, coins.get("quarters"));
    }

    @Test
    void oneQuarterOneNickel(){
        coins = coinChanger.makeChange(30);
        assertEquals(1, coins.get("nickels"));
        assertEquals(1, coins.get("quarters"));
    }

    @Test
    void oneQuarterOneDime(){
        coins = coinChanger.makeChange(35);
        assertEquals(1, coins.get("quarters"));
        assertEquals(1, coins.get("dimes"));
    }

    @Test
    void oneQuarterOneDimeOnePenny(){
        coins = coinChanger.makeChange(36);
        assertEquals(1, coins.get("quarters"));
        assertEquals(1, coins.get("pennies"));
        assertEquals(1, coins.get("dimes"));
    }

    @Test
    void twoQuarters(){
        coins = coinChanger.makeChange(50);
        assertEquals(2, coins.get("quarters"));
    }

    @Test
    void fourQuarters(){
        coins = coinChanger.makeChange(100);
        assertEquals(4, coins.get("quarters"));
    }

    @Test
    void fourQuartersOneDimeOneNickelOnePenny(){
        coins = coinChanger.makeChange(116);
        assertEquals(1, coins.get("nickels"));
        assertEquals(1, coins.get("pennies"));
        assertEquals(1, coins.get("dimes"));
        assertEquals(4, coins.get("quarters"));
    }
}