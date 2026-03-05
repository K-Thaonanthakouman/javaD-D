package character;

import java.lang.String;

public abstract class Character {
    private String category;
    private String name;
    private int hp;
    private int attack;
    private int position = 0;
    private int defaultOffensiveEquip;

    public Character(String name, String category, int hp, int attack) {
        this.name = name;
        this.category = category;
        this.hp = hp;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String inputCategory) {
        this.category = inputCategory;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int inputHp) {
        this.hp = inputHp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int inputAttack) {
        this.attack = inputAttack;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int movement) {
        position += movement;
    }

}
