package character.category;

import java.lang.String;
import character.Character;

public class Warrior extends Character {

    public Warrior (String name, String category, int hp, int attack) {
        super(name, category, hp, attack);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String inputCategory) {
        this.category = inputCategory;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int inputHp) {
        this.hp = inputHp;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int inputAttack) {
        this.attack = inputAttack;
    }

    public int getPosition() {
        return this.position;
    }

    public void setPosition(int movement) {
        this.position += movement;
    }
}
