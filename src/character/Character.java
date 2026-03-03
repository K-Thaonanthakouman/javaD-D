package character;

import java.lang.String;

public abstract class Character {
    private String category;
    private String name;
    private int hp;
    private int attack;
    private int defaultOffensiveEquip;

    public Character(String name, String category) {
        this.name = name;
        this.category = category;
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

}
