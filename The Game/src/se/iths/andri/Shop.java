package se.iths.andri;

import java.util.Scanner;
/**
 * the Shop Class!
 * */

public class Shop {

    private Scanner sc;
    private IPlayer player;
    private boolean abort = false;


    public Shop(IPlayer player) {
        this.sc = new Scanner(System.in);
        this.player = player;
    }


    /**
     * Menu system for shop!
     * */
    public void shopMenu(){

        System.out.println("Wellcome to StackOverflow! What can i Help you With?");
        System.out.println("You have "+this.player.getGold()+" gold coins.");
        while (!this.abort){
            System.out.println("1. Expert help(+30 Strength) - 100 gold.");
            System.out.println("2. Community help(+10 Defence) - 50 gold");
            System.out.println("e. Exit StackOverflow");

            System.out.println("> ");
            switch(sc.next()){
                case "1":
                    buyStr();
                    break;
                case "2":
                    this.buyDef();
                    break;
                case "e":
                    this.exitShop();
                    this.abort = true;
                    break;
            }

        }

        this.abort = false;
    }

    private void exitShop() {
        System.out.println(" ");
    }

    private void buyDef() {
        if (this.player.getGold()>=50){
            System.out.println(this.player.getName()+ " got some community support and can now go on for longer study periods");
            this.player.giveGold(50);
            this.player.upgradeDef(10);
            System.out.println(this.player.getName()+" has "+this.player.getGold()+" cold coins left.");
        }
        else {
            System.out.println("You dont have enough gold");
            System.out.println(" ");
        }
    }

    private void buyStr() {
        if (this.player.getGold()>=100){
            System.out.println(this.player.getName()+ " got some Expert help and became smarter");
            this.player.giveGold(100);
            this.player.upgradeStr(30);
            System.out.println(this.player.getName()+" has "+this.player.getGold()+" cold coins left ");
        }
        else {
            System.out.println("You dont have enough gold");
            System.out.println(" ");
        }

    }
}
