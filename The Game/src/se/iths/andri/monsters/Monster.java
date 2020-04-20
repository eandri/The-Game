package se.iths.andri.monsters;

public interface Monster {

    public int attack();


    public void takeDamage(int damage);


    public boolean isDead();

    public String getName();


    public int getHp();


    public int getExp();


    public int getGold();

}
