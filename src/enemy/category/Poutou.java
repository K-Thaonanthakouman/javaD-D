package enemy.category;

import enemy.Enemy;

public class Poutou extends Enemy {

    public Poutou(int attackPower, int hp) {
        super(attackPower, hp);

    }

    public int getAttackPower() {
        return this.attackPower;
    }

    public void setAttackPower(int inputAttackPower) {
        this.attackPower = inputAttackPower;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int inputHp) {
        this.hp = inputHp;
    }

    @Override
    public String toString() {
        return "Vous rencontrez le boss final du jeu : un poutou ! Il a " + hp + " pv et a " + attackPower + " pts d'attaque.";
    }


}
