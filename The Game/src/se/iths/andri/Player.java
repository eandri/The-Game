package se.iths.andri;

import se.iths.andri.monsters.Monster;

public class Player implements IPlayer {

    private String name;
    private int str = 10;
    private final int maxHp = 200;
    private int hp =0;
    private final int maxExp = 100;
    private int exp = 0;
    private int level = 0;
    private int gold = 0;
    private int def = 0;

    public Player(String name){
        this.name = name;
        this.hp = this.maxHp;
    }


    @Override
    public int attack() {
        return this.str;
    }

    @Override
    public void takeDamage(int damage) {
    if (!this.isDead())
        this.hp -= damage;
    }

    @Override
    public void giveExp(int newExp) {
        this.exp += newExp;
        if (this.exp >=100){
            this.level += 1;
            System.out.println("Congratulations you leveled up! you are now level: "+ this.level);
            this.exp = 0;
        }
    }

    @Override
    public boolean isDead() {
        if (this.hp<=0)
        return true;
        else
            return false;
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
    public int getMaxHp() {
        return this.maxHp;
    }

    @Override
    public int getExp() {
        return this.exp;
    }

    @Override
    public int getMaxExp() {
        return this.maxExp;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public void levelUp() {
    this.level +=1 ;
    }

    @Override
    public int getGold() {
        return this.gold;
    }

    @Override
    public void giveGold(int price) {
    this.gold -= price;
    }

    @Override
    public void takeGold(Monster monster) {
    this.gold += monster.getGold();
    }

    @Override
    public int getStr() {
        return this.str;
    }

    @Override
    public int getDef() {
        return this.def;
    }

    @Override
    public void upgradeStr(int str) {
    this.str += str;
    }

    @Override
    public void upgradeDef(int def) {
    this.def += def;
    }
}
