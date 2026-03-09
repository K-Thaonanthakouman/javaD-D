package character.category;

import character.Character;
import character.attack.Spell;
import character.attack.Weapon;

public class Wizard extends Character {

    private Spell equippedSpell = new Spell("equippedSpell", "Blast", 1);
    private Weapon noWeapon = new Weapon("noWeapon", "No Weapon", 0);

    public Wizard (String name, String category, int hp, int attack) {
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

    public Spell getSpell() {
        return equippedSpell;
    }

    public void setSpell(String newSpell, String newSpellName, int newSpellPower) {
        this.equippedSpell = new Spell(newSpell, newSpellName, newSpellPower);
    }

    public Weapon getWeapon() {
        return noWeapon;
    }

    public void setWeapon(String a, String b, int c) {}

    @Override
    public String toString() {
        return "Vous vous appelez " + this.name + ", vous êtes un " + this.category + ". Vous disposez de " + this.hp + " pv et de " + this.attack + " pts d'attaque.";
    }
}
