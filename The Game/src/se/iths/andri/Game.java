package se.iths.andri;

import se.iths.andri.monsters.Monster;

import java.util.Scanner;
/**
 * This is where the game starts!
 * */
public class Game {
    
    //main loop conditions
    private boolean lostGame, wonGame;
    //Handles input
    private Scanner sc;
    //current player
    private IPlayer player;
    //a Random number Generator(Rng)
    private Rng rng;
    // the Shop Class
    private Shop shop;
    
    //Creates a new game.
    public Game(){sc = new Scanner(System.in);}
    /**
     * This is an initializer for the game
     * */
    public void startGame() {
        System.out.println("******************************");
        System.out.println("* Wellcome to house of codes *");
        System.out.println("******************************");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        // TODO create a new player using name,
        // and assign to our instance variable!
        this.player = new Player(name);
        this.shop = new Shop(this.player);

        System.out.println();

        int input = -1;
        while (!wonGame && !lostGame) {
            printMainMenu();
            System.out.print("> ");
            input = sc.nextInt();
            sc.nextLine();
            switch(input) {
                case 1:
                    goAdventure();
                    break;
                case 2:
                    goCharacter();
                    break;
                case 3:
                    shop.shopMenu();
                    break;

                case 4:
                    System.out.println("Bye!");
                    lostGame = true;
                    break;

                case 5:

            }
        }
 
        if (wonGame) {
            System.out.println("Congratulations! You won The Game!");
        }

    }

    private void printMainMenu() {
        System.out.println("1. Expand knowledge");
        System.out.println("2. Go to summary");
        System.out.println("3. Go to StackOverflow");
        System.out.println("4. Exit game");
        System.out.println("5. lägg till 100 millioner kroner");

    }
    private void goAdventure() {

        /**TODO either nothing happens or you try to learn something
        *
        */
        if (this.rng.getRng(100) <= 10){
            System.out.println("You sit there twiddling your thumbs");
            System.out.println(" ");
        }
        else{
            battle(this.rng.getCode());
        }

    }

    private void battle(Monster monster) {
        System.out.println("You find a book about "+ monster.getName()+"!");

        while (!player.isDead() && !monster.isDead()){
            System.out.println(player.getName()+" is Working on "+monster.getName()+"!");
            monster.takeDamage(player.attack()+player.getLevel());

            if (monster.isDead()){

                player.giveExp(monster.getExp());
                System.out.println(player.getName()+" got better at "+monster.getName()+"!");
                System.out.println("Received "+ monster.getExp()+" experience and "+monster.getGold()+" Gold!");
                player.takeGold(monster);
                System.out.println(player.getName()+" is level "+player.getLevel()+", and has "+player.getExp()+" Experience points!");
                System.out.println();

                if (player.getLevel()== 10){
                    System.out.println("Congratulations "+player.getName()+" your now a master developer!");
                    this.wonGame = true;
                    this.lostGame = false;
                }
            }
            else {
                System.out.println(monster.getName()+" is confusing!");
                player.takeDamage(monster.attack()-player.getDef());

                if (player.isDead()){
                    System.out.println(player.getName()+"gave up on becoming a developer, all because he couldn't handle "+monster.getName());
                    this.wonGame = false;
                    this.lostGame = true;

                }
                else{
                    // Show current stats
                    System.out.println(player.getName()+": "+player.getHp()+" hp");
                    System.out.println(monster.getName()+": "+monster.getHp()+" hp");
                    this.confirm();
                }

            }
        }


    }

    /**
     * a method to pause the ongoing while loop.
     * Waiting for a newline,
     * */
    private void confirm() {
        System.out.println("[ Enter to continue. ]");
        String input = sc.nextLine();
    }

    private void goCharacter() {
        System.out.println("");
        System.out.println("Name: "+player.getName());
        System.out.println("Level: "+player.getLevel());
        System.out.println("Gold: "+player.getGold());
        System.out.println("Hp: "+player.getHp()+"/"+player.getMaxHp());
        System.out.println("Exp: "+player.getExp()+"/"+player.getMaxExp());
        System.out.println("Attack: "+(player.getStr()+player.getLevel()));
        System.out.println("");

    }


}
