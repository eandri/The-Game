package se.iths.andri;
import se.iths.andri.monsters.Monster;

public interface IPlayer {
    public int attack();

    public void takeDamage(int damage);

    public void giveExp(int newExp);

    public boolean isDead();

    public String getName();

    public int getHp();

    public int getMaxHp();

    public int getExp();

    public int getMaxExp();

    public int getLevel();

    public void levelUp();

    public int getGold();

    public void giveGold(int price);

    public void takeGold(Monster monster);

    public int getStr();

    public int getDef();

    public void upgradeStr(int str);

    public void upgradeDef(int def);

}
