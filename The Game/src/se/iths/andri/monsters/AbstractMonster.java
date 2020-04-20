package se.iths.andri.monsters;

public abstract class AbstractMonster implements Monster {
    private String name;
    private int strength;
    private int hp;
    private int exp;
    private int gold;

    public AbstractMonster(String name, int strength, int hp, int exp, int gold) {
        this.name = name;
        this.strength = strength;
        this.hp = hp;
        this.exp = exp;
        this.gold = gold;
    }
    @Override
    public abstract int attack();

    @Override
    public void takeDamage(int damage) {
        if(!this.isDead()){
            this.hp -= damage;
        }
    }

    @Override
    public boolean isDead() {
        if(this.hp<=0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public int getExp() {
        return this.exp;
    }

    /**
     * Gets the strength.
     * @return strength
     */
    public int getStrength(){
        return this.strength;
    }

    @Override
    public int getGold(){
        return this.gold;
    }
}
