package character;

public abstract class DefensiveEquip {
    protected String itemCategory;
    protected String name;
    protected int defensePower;

    public DefensiveEquip (String itemEquip, String nameEquip, int defensePowerEquip) {
        this.itemCategory = itemEquip;
        this.name = nameEquip;
        this.defensePower = defensePowerEquip;

    }

    public abstract String getItem();

    public abstract void setItem(String inputItem);

    public abstract String getName();

    public abstract void setName(String inputName);

    public abstract int getDefensePower();

    public abstract void setDefensePower(int inputDefensePower);

}

