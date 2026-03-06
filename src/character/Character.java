package character;

import java.lang.String;

public abstract class Character {
    protected String category;
    protected String name;
    protected int hp;
    protected int attack;
    protected int position = 0;
    protected int defaultOffensiveEquip;

    public Character(String name, String category, int hp, int attack) {
        this.name = name;
        this.category = category;
        this.hp = hp;
        this.attack = attack;
    }

    public abstract String getName();

    public abstract void setName(String inputName);

    public abstract String getCategory();

    public abstract void setCategory(String inputCategory);

    public abstract int getHp();

    public abstract void setHp(int inputHp);

    public abstract int getAttack();

    public abstract void setAttack(int inputAttack);

    public abstract int getPosition();

    public abstract void setPosition(int movement);

}
