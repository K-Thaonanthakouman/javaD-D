package character.attack;

import character.OffensiveEquip;

public class Spell extends OffensiveEquip {

    public Spell(String spell, String spellName, int spellPower) {
        super(spell, spellName, spellPower);
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
        return "Vous vous équipez du sort " + name + " qui a une puissance de " + attackPower + ".";
    }
}
