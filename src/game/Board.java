package game;


public class Board {
    private final int[] gameBoard;

    public Board() {
        gameBoard = new int[64];
    }

    public int[] getBoard() {
        return gameBoard;
    }

}
