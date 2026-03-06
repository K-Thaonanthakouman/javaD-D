package character.defense;

import character.DefensiveEquip;


public class Potion extends DefensiveEquip {

    public Potion (String potion, String potionName, int potionPower) {
        super (potion, potionName, potionPower);
    }

    public String getItem() {
        return this.itemCategory;
    }

    public void setItem(String inputItem) {
        this.itemCategory = inputItem;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public int getDefensePower() {
        return this.defensePower;
    }

    public void setDefensePower(int inputDefensePower) {
        this.defensePower = inputDefensePower;
    }
}
