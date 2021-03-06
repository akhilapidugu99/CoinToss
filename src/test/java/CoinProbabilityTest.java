import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinProbabilityTest {
    double headProbability = 0.5;
    double tailProbability = 0.5;
    @Test
    public void testIfHeadProbabilityOfACoinIsEqualToTailProbability() {
        CoinProbability coinProbability = new CoinProbability(headProbability,tailProbability);

        assertEquals(coinProbability, coinProbability);
    }

    @Test
    void testIfProbabilityOfTossingTwoCoinsSimultaneouslyWithBothTheSidesAsHeadIs0Point25() {
        double expectedValue = 0.25;
        CoinProbability headsOnFirstCoinToss = new CoinProbability(headProbability);
        CoinProbability headsOnSecondCoinToss = new CoinProbability(headProbability);

        double actualValue = headsOnFirstCoinToss.and(headsOnSecondCoinToss);

        assertEquals(expectedValue,actualValue);
    }

    @Test
    void testIfProbabilityOfTossingTwoCoinsSimultaneouslyWithBothTheSidesAsTailIs0Point25() {
        double expectedValue = 0.25;
        CoinProbability tailsOnFirstCoinToss = new CoinProbability(tailProbability);
        CoinProbability tailsOnSecondCoinToss = new CoinProbability(tailProbability);

        double actualValue = tailsOnFirstCoinToss.and(tailsOnSecondCoinToss);

        assertEquals(expectedValue,actualValue);
    }

    @Test
    void testIfProbabilityOfTossingTwoCoinsSimultaneouslyWithOneCoinSideAsHeadAndOtherCoinSideAsTailIs0Point25() {
        double expectedValue = 0.25;
        CoinProbability headsOnFirstCoinToss = new CoinProbability(headProbability);
        CoinProbability tailsOnSecondCoinToss = new CoinProbability(tailProbability);

        double actualValue = headsOnFirstCoinToss.and(tailsOnSecondCoinToss);

        assertEquals(expectedValue,actualValue);
    }

    @Test
    void testIfProbabilityOfTossingTwoCoinsSimultaneouslyWithOneCoinSideAsTailAndOtherCoinSideAsHeadIs0Point25() {
        double expectedValue = 0.25;
        CoinProbability tailsOnFirstCoinToss =  new CoinProbability(tailProbability);
        CoinProbability headsOnSecondCoinToss = new CoinProbability(headProbability);

        double actualValue = tailsOnFirstCoinToss.and(headsOnSecondCoinToss);

        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testIfNotGettingHeadOnCoinTossIs0Point5() {
        double expectedValue = 0.5;
        CoinProbability notHeadOnCoinToss = new CoinProbability(headProbability);

        double actualValue = notHeadOnCoinToss.complement();

        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testIfNotGettingTailOnCoinTossIs0Point5() {
        double expectedValue = 0.5;
        CoinProbability notTailOnCoinToss = new CoinProbability(tailProbability);

        double actualValue = notTailOnCoinToss.complement();

        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testIfProbabilityOfOccurring_EitherOfHeads_OnTossingTwoCoinsIs0Point75() {
        double expectedValue = 0.75;
        CoinProbability headsOnFirstCoinToss = new CoinProbability(headProbability);
        CoinProbability headsOnSecondCoinToss = new CoinProbability(headProbability);

        double actualValue = headsOnFirstCoinToss.or(headsOnSecondCoinToss);

        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testIfProbabilityOfOccurring_EitherOfTails_OnTossingTwoCoinsIs0Point75() {
        double expectedValue = 0.75;
        CoinProbability tailsOnFirstCoinToss = new CoinProbability(tailProbability);
        CoinProbability tailsOnSecondCoinToss = new CoinProbability(tailProbability);

        double actualValue = tailsOnFirstCoinToss.or(tailsOnSecondCoinToss);

        assertEquals(expectedValue,actualValue);
    }

}
