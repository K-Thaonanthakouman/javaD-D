package character;

public class OffensiveEquip {
    private String item;
    private String name;
    private int attackPower;

    public OffensiveEquip (String itemEquip, String nameEquip, int attackPowerEquip) {
        this.item = itemEquip;
        this.name = nameEquip;
        this.attackPower = attackPowerEquip;

    }

    public String getItem() {
        return item;
    }

    public void setItem(String inputItem) {
        this.item = inputItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public int getDefensePower() {
        return attackPower;
    }

    public void setDefensePower(int inputAttackPower) {
        this.attackPower = inputAttackPower;
    }


}