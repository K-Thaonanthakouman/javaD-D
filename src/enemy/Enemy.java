package enemy;

import game.Cell;

public abstract class Enemy extends Cell {

    protected int attackPower;
    protected int hp;

    public Enemy(int attackPower, int hp) {
        this.attackPower = attackPower;
        this.hp = hp;
    }

    public abstract int getAttackPower();

    public abstract void setAttackPower(int inputAttackPower);

    public abstract int getHp();

    public abstract void setHp(int inputHp);

    @Override
    public abstract String toString ();
}
