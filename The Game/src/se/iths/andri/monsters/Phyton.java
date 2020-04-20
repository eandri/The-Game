package se.iths.andri.monsters;

public class Phyton extends AbstractMonster {

    public Phyton(){
        super("Phyton",10,50,45,100);
    }

    @Override
    public int attack(){
        System.out.println("Powershell!");
        return this.getStrength();
    }
}
