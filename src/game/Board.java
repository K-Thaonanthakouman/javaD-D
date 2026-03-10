package game;

import character.attack.Spell;
import character.defense.Shield;
import enemy.Enemy;
import enemy.category.Gobelin;

import java.util.ArrayList;

public class Board {
    private ArrayList<Cell> gameBoard = new ArrayList<Cell>();

    public Board() {

        gameBoard.add(0, new Empty());
        gameBoard.add(1, new Gobelin(1, 6));
        gameBoard.add(2, new Spell("spell", "Fireball", 7));
        gameBoard.add(3, new Shield("bouclier", "bouclier en fer", 6));


    }

    public ArrayList<Cell> getBoard() {
        return gameBoard;
    }

}
