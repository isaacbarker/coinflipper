package me.isaacbarker.CoinFlipper;

import java.util.Random;

public class CoinFlip {

    /*

    CoinFlip
    - Simulates a coin flip
    - Translates a random 50/50 chance of either true of false to a CoinFlipResult

     */

    public static CoinFlipResult flip() {
        Random random = new Random();
        boolean result = random.nextBoolean();

        if (result) // true is HEADS
            return CoinFlipResult.HEADS;
        else // false is TAILS
            return CoinFlipResult.TAILS;

    }

}
