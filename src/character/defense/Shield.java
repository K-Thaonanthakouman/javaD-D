package character.defense;

import character.DefensiveEquip;


public class Shield extends DefensiveEquip {

    public Shield (String shield, String shieldName, int shieldPower) {
        super(shield, shieldName, shieldPower);
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

    @Override
    public String toString() {
        return "Vous avez l'occasion de vous saisir d'un " + this.name + ", il a une puissance de " + this.defensePower + " pts.";
    }
}
