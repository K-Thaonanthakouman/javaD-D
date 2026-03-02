package game;

import java.util.Random;

public class Dice {
    public static void main () {
        Random randomDice = new Random();
        System.out.println(randomDice.nextInt(6) +1);
    }
}
