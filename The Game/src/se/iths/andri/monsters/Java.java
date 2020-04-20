package se.iths.andri.monsters;

public class Java extends AbstractMonster {

    public Java(){
        super("Java",10,70,35,35);
    }

    @Override
    public int attack() {
        System.out.println("Java hits you with an Object");
        return this.getStrength();
    }
}


