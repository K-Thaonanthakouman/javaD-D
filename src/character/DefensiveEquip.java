package character;

public class DefensiveEquip {
    private String item;
    private String name;
    private int defensePower;

    public DefensiveEquip (String itemEquip, String nameEquip, int defensePowerEquip) {
        this.item = itemEquip;
        this.name = nameEquip;
        this.defensePower = defensePowerEquip;

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
        return defensePower;
    }

    public void setDefensePower(int inputDefensePower) {
        this.defensePower = inputDefensePower;
    }


}
