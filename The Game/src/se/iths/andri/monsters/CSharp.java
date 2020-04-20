package se.iths.andri.monsters;

public class CSharp extends AbstractMonster {


    public CSharp(){super("C#",12,100,100,199);}


    @Override
    public int attack() {
        System.out.println("Object");
        return this.getStrength();
    }

}
