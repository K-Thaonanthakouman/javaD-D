package character.defense;

import character.DefensiveEquip;


public class Shield extends DefensiveEquip {

    public Shield (String shield, String shieldName, int shieldPower) {
        super(shield, shieldName, shieldPower);
    }

    public String getItem() {
        return itemCategory;
    }

    public void setItem(String inputItem) {
        this.itemCategory = inputItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public void setDefensePower(int inputDefensePower) {
        this.defensePower = inputDefensePower;
    }

    @Override
    public String toString() {
        return "Vous vous équipez d'un " + name + ", ce qui réduira les dégâts de la prochaine attaque ennemie de " + defensePower + " pts.";
    }
}
