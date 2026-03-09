package character;

import game.Cell;

public abstract class OffensiveEquip extends Cell {
    protected String itemCategory;
    protected String name;
    protected int attackPower;

    public OffensiveEquip (String itemEquip, String nameEquip, int attackPowerEquip) {
        this.itemCategory = itemEquip;
        this.name = nameEquip;
        this.attackPower = attackPowerEquip;

    }

    public abstract String getItem();

    public abstract void setItem(String inputItem);

    public abstract String getName();

    public abstract void setName(String inputName);

    public abstract int getAttackPower();

    public abstract void setAttackPower(int inputAttackPower);

    @Override
    public abstract String toString();

}