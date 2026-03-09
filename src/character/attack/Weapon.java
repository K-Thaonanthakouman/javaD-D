package character.attack;

import character.OffensiveEquip;

public class Weapon extends OffensiveEquip {
    public Weapon (String weapon, String weaponName, int weaponPower) {
        super (weapon, weaponName, weaponPower);
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

    public int getAttackPower() {
        return this.attackPower;
    }

    public void setAttackPower(int inputAttackPower) {
        this.attackPower = inputAttackPower;
    }

    @Override
    public String toString() {
        return "Vous vous équippez d'un " + name + " qui a une puissance de " + attackPower + ".";
    }
}
