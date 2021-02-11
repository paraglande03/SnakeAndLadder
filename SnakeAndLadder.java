import java.util.Random;

public class SnakeAndLadder {

    // Intializing variables
    static final int STARTNG_POSITION=0;
    static final int ENDING_POSITION=100;
    static final int PLAYER=1;
    static final int LADDER=1;
    static final int SNAKE=2;
    static final int NO_PLAY=0;
    static Random RANDOM  = new Random();

    //Rolling Dice Method
    public int diceRoll(){

        int DICE= (RANDOM.nextInt(6)+1);

        System.out.println("Dice Number="+DICE);
        return DICE;
    }

    //Gameplay method
    public void gameplay() {
        int playerPosition = STARTNG_POSITION;

         //Adding while for ending position
        while (playerPosition < ENDING_POSITION) {

            int dice = diceRoll();
            int action = RANDOM.nextInt(3);
            System.out.println("Action Taken--" + action);
            switch (action) {
                case LADDER:
                    playerPosition = playerPosition + dice;
                    System.out.println("Player Position  " + playerPosition);
                    break;
                case SNAKE:
                    playerPosition = playerPosition - dice;
                    if (playerPosition < 0) {
                        playerPosition = STARTNG_POSITION;
                    }
                    System.out.println("Player Position  " + playerPosition);
                    break;
                case NO_PLAY:
                    playerPosition = playerPosition;
                    System.out.println("same position as before i.e " + playerPosition);
                    break;
            }

        }
    }

        public static void main (String[]args ){

            System.out.println("Welcome to the game");

            SnakeAndLadder snakeAndLadder = new SnakeAndLadder();

            snakeAndLadder.gameplay();

        }


}
