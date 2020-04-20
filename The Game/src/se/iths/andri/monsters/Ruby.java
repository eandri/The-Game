package se.iths.andri.monsters;

public class Ruby extends AbstractMonster {

    public Ruby(){super("Ruby",15,50,40,50);}


    @Override
    public int attack() {
        return this.getStrength();
    }
}
