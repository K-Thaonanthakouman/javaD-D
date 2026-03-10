package game;

import java.util.Random;

public class Dice {
    public Dice() {

    }

    public int castDice() {
        Random randomDice = new Random();
        return randomDice.nextInt(1) + 1;
    }
}

