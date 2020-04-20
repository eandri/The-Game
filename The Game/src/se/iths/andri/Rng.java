package se.iths.andri;

import se.iths.andri.monsters.*;

import java.util.Random;


public class Rng {

    private static Random rng = new Random();

    /*
    getts a max number to create a scope in wich we can ranomise the outcome.
     */
    public static int getRng(int max){

        return rng.nextInt(max +1);

    }


    public static Monster getCode() {
        Monster code;
        switch(getRng(4)){
            case 1:
                code = new Java();
                break;
            case 2:
                code = new Phyton();
                break;
            case 3:
                code = new CSharp();
                break;
            case 4:
                code = new Ruby();
                break;
            default:
                code = new Java();
                break;

        }
        return code;
    }
}
