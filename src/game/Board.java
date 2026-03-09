package game;

import character.attack.Spell;
import character.defense.Shield;
import enemy.Enemy;
import enemy.category.Gobelin;

import java.util.ArrayList;

public class Board {
    private ArrayList<Cell> gameBoard = new ArrayList<Cell>();

    public Board() {

        gameBoard.add(new Empty());
        gameBoard.add(new Gobelin());
        gameBoard.add(new Spell("spell", "Fireball", 7));
        gameBoard.add(new Shield("bouclier", "bouclier en fer", 6));


    }

    public ArrayList<Cell> getBoard() {
        return gameBoard;
    }

}
