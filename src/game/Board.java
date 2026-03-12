package game;

import character.attack.Spell;
import character.attack.Weapon;
import character.defense.Barrier;
import character.defense.Potion;
import character.defense.Shield;
import enemy.Enemy;
import enemy.category.Dragoon;
import enemy.category.Gobelin;
import enemy.category.Poutou;
import enemy.category.Thief;

import java.util.ArrayList;

public class Board {
    private ArrayList<Cell> gameBoard = new ArrayList<Cell>();

    public Board() {

        gameBoard.add(0, new Empty());

        gameBoard.add(1, new Spell("spell", "Lightning", 2));
        gameBoard.add(2, new Weapon("weapon", "Wooden Club", 3));
        gameBoard.add(3, new Gobelin(1, 6));
        gameBoard.add(4, new Spell("spell", "Lightning", 2));
        gameBoard.add(5, new Weapon("weapon", "Wooden Club", 3));
        gameBoard.add(6, new Gobelin(1, 6));
        gameBoard.add(7, new Potion("potion", "Small Potion", 2));
        gameBoard.add(8, new Spell("spell", "Lightning", 2));
        gameBoard.add(9, new Gobelin(1, 6));
        gameBoard.add(10, new Thief(2, 9));

        gameBoard.add(11, new Weapon("weapon", "Studded Club", 4));
        gameBoard.add(12, new Gobelin(1, 6));
        gameBoard.add(13, new Potion("potion", "Small Potion", 2));
        gameBoard.add(14, new Shield("shield", "Wooden Shield", 2));
        gameBoard.add(15, new Gobelin(1, 6));
        gameBoard.add(16, new Barrier("barrier", "Water Shield", 2));
        gameBoard.add(17, new Spell("spell", "Lightning+", 4));
        gameBoard.add(18, new Gobelin(1, 6));
        gameBoard.add(19, new Weapon("weapon", "Small Sword", 5));
        gameBoard.add(20, new Thief(2, 9));

        gameBoard.add(21, new Gobelin(1, 6));
        gameBoard.add(22, new Weapon("weapon", "Studded Club", 4));
        gameBoard.add(23, new Spell("spell", "Lightning+", 4));
        gameBoard.add(24, new Gobelin(1, 6));
        gameBoard.add(25, new Thief(2, 9));
        gameBoard.add(26, new Weapon("weapon", "Small Sword", 5));
        gameBoard.add(27, new Gobelin(1, 6));
        gameBoard.add(28, new Potion("potion", "Great Potion", 5));
        gameBoard.add(29, new Shield("shield", "Copper Shield", 3));
        gameBoard.add(30, new Gobelin(1, 6));

        gameBoard.add(31, new Potion("potion", "Small Potion", 2));
        gameBoard.add(32, new Thief(2, 9));
        gameBoard.add(33, new Potion("potion", "Small Potion", 2));
        gameBoard.add(34, new Barrier("barrier", "Lightning Barrier", 4));
        gameBoard.add(35, new Thief(2, 9));
        gameBoard.add(36, new Thief(2, 9));
        gameBoard.add(37, new Thief(2, 9));
        gameBoard.add(38, new Weapon("weapon", "Studded Club", 4));
        gameBoard.add(39, new Potion("potion", "Small Potion+", 3));
        gameBoard.add(40, new Thief(2, 9));

        gameBoard.add(41, new Potion("potion", "Great Potion", 5));
        gameBoard.add(42, new Weapon("weapon", "Large Sword", 8));
        gameBoard.add(43, new Potion("potion", "Small Potion+", 3));
        gameBoard.add(44, new Thief(2, 9));
        gameBoard.add(45, new Dragoon(4, 15));
        gameBoard.add(46, new Shield("shield", "Steel Shield", 5));
        gameBoard.add(47, new Thief(2, 9));
        gameBoard.add(48, new Spell("spell", "Fireball", 7));
        gameBoard.add(49, new Spell("spell", "Fireball", 7));
        gameBoard.add(50, new Barrier("barrier", "Fire Barrier", 5));

        gameBoard.add(51, new Thief(2, 9));
        gameBoard.add(52, new Dragoon(4, 15));
        gameBoard.add(53, new Weapon("weapon", "Large Sword", 10));
        gameBoard.add(54, new Shield("shield", "Platinum Shield", 6));
        gameBoard.add(55, new Barrier("barrier", "Storm Barrier", 6));
        gameBoard.add(56, new Dragoon(4, 15));
        gameBoard.add(57, new Thief(2, 9));
        gameBoard.add(58, new Spell("spell", "Fireball+", 11));
        gameBoard.add(59, new Potion("potion", "Great Potion+", 7));

        gameBoard.add(60, new Weapon("weapon", "Large Sword", 10));
        gameBoard.add(61, new Potion("potion", "Great Potion+", 7));
        gameBoard.add(62, new Dragoon(4, 15));
        gameBoard.add(63, new Poutou(10, 25));
    }

    public ArrayList<Cell> getBoard() {
        return gameBoard;
    }

}
