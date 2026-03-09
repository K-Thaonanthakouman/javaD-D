package game;

import character.Character;
import static game.Main.main;

import java.util.Scanner;

public class Game {

    private Board gameBoard = new Board();
    private Dice dice = new Dice();
    private Scanner playerEntry = new Scanner(System.in);

    public Game() {

    }

    public void startGame(Character player) {

        playTurn(player);
        endGame();
    }

    public void playTurn(Character player) {
        int i = 1;

        while (player.getPosition() != gameBoard.getBoard().size() -1) {

            System.out.println("Début du tour n°" + i + " : le joueur est à la case " + player.getPosition() + ".");

            int movement = dice.castDice();
            System.out.println("Lancer de dé : le joueur fait " + movement + ".");

            player.setPosition(movement);
            if (player.getPosition() > gameBoard.getBoard().size() -1) {
                player.setPosition(- 2*(player.getPosition() - (gameBoard.getBoard().size() -1)));
            }
            System.out.println("Fin du tour n°" + i + " : le joueur est à la case " + player.getPosition() + ".");
            playerEntry.nextLine();
            i++;
        }
    }

    public void endGame() {
        System.out.println("Vous avez gagné, la partie est terminée. Voulez-vous rejouer ?");
        System.out.println("1 - Oui");
        System.out.println("2 - Non");
        int reponse = playerEntry.nextInt();

        if (reponse == 1) {
            main();
        }
        else {
            System.out.println("Très bien. Adieu alors.");
        }
    }

}
