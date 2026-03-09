package character.category;

import character.Character;
import character.attack.Spell;
import character.attack.Weapon;

public class Warrior extends Character {

    private Weapon equippedWeapon = new Weapon("equippedWeapon", "Wooden Sword", 1);
    private Spell noSpell = new Spell("noSpell", "No Spell", 0);

    public Warrior (String name, String category, int hp, int attack) {
        super(name, category, hp, attack);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String inputCategory) {
        this.category = inputCategory;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int inputHp) {
        this.hp = inputHp;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int inputAttack) {
        this.attack = inputAttack;
    }

    public int getPosition() {
        return this.position;
    }

    public void setPosition(int movement) {
        this.position += movement;
    }

    public Weapon getWeapon() {
        return equippedWeapon;
    }

    public void setWeapon(String newWeapon, String newWeaponName, int newWeaponPower) {
        this.equippedWeapon = new Weapon(newWeapon, newWeaponName, newWeaponPower);
    }

    public Spell getSpell() {
        return noSpell;
    }

    public void setSpell(String a, String b, int c) {}

    @Override
    public String toString() {
        return "Vous vous appelez " + this.name + ", vous êtes un " + this.category + ". Vous disposez de " + this.hp + " pv et de " + this.attack + " pts d'attaque.";
    }
}
