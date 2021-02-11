import com.sun.javaws.Main;

import java.util.Random;

public class SnakeAndLadder {

    // Intializing variables
    static final int STARTNG_POSITION=0;
    static final int PLAYER=1;
    static Random RANDOM  = new Random();

    //Rolling Dice Method
    public  void diceRoll(){

        int DICE= (RANDOM.nextInt(6)+1);
        System.out.println("Dice Number="+DICE);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to the game");
        SnakeAndLadder snakeAndLadder= new SnakeAndLadder();
        snakeAndLadder.diceRoll();


    }


}
