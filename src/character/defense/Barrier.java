package character.defense;

import character.DefensiveEquip;


public class Barrier extends DefensiveEquip {

    public Barrier (String barrier, String barrierName, int barrierPower) {
        super(barrier, barrierName, barrierPower);
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
        return "Vous trouvez le temps de relire votre grimoire de protection. Vous lancez la " + this.name + ", elle a une puissance de " + this.defensePower + " pts.";
    }
}
