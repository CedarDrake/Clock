package Clock;


/**
 * Write a description of class Constants here.
 *
 * @author (Cedar Drake)
 * @version (1.0.0)
 */
public class Constants
{
    public static final int DECK_SIZE = 52;
    public static final int SUIT_SIZE = 13;
    public static final int MAX_HAND = 4;
    public static final int CLOCK_SIZE = 12;
    
    public static final int STANDBY = 0;
    public static final int GET_NAME = 1;
    public static final int GET_MOVE = 2;
    public static final int DRAW_CARD = 3;
    public static final int WIN = 4;
    public static final int QUIT_PROGRAM = 5;
    
    public static final String DIVIDER_STRING = " ";
    public static final String HAND_STRING = "|%s|";
    public static final String GET_PLAYER_NAME = "Player, what is your name? -->";
    public static final String WRONG_HAND_PLACEMENT = "Please move the card to the correct spot on the clock";
    public static final String INVALID_MOVE_ERROR = "Please enter a vaild number on a clock";
    public static final String NEW_GAME = "Start new game (y or n)? -->";
    public static final String WINNER = "You won! That was a 1/13 chance";
    public static final String LOSER = "There are no more moves. You lost :(";
    public static final String NEW_GAME_STARTED = "Welcome to Clock solitaire, please move the card in the center to the correct place on a clock";
    public static final String GET_MOVE_INT = "%s , enter the number to the corresponding point on a clock. -->";
    
}
