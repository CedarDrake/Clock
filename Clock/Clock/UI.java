package Clock;
import java.util.Scanner;


/**
 * Write a description of class UI here.
 *
 * @author (Cedar Drake)
 * @version (1.0.0)
 */
public class UI
{
    Scanner scanner;
    private int value = 0;    
    public UI() {
        scanner = new Scanner(System.in);
    }
    public String getPlayerName(String name) {
        return name;
    }
    public int getMove(String name, int value, State state) {
        while (value <= 0 || value >= 13) {
            try {
               System.out.printf(Constants.GET_MOVE_INT, state.getName(name));
               value = scanner.nextInt();
               if (value < 1 || value > 12) {
                   System.out.println(Constants.INVALID_MOVE_ERROR);
               }
            } 
            catch(Exception e) {
                System.out.println(Constants.INVALID_MOVE_ERROR);
                scanner.nextLine();
            }
        }
        return value;
    }
    public boolean isLegalCard(State state) {
        if (state.getDeck() == 0) {
            return false;
        } else {
            return true;
        }
    }
    public boolean isLegalMove(State state, int cell, int row, int col) {
        if (state.getDeck() == cell) {
            return true;
        } else {
            return false;
        }
    }
    public boolean startNewGame() {
        System.out.println(Constants.NEW_GAME);
        for 
    }
}
