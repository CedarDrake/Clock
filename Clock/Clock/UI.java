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
    public void setMove(String name, int value, State state, int cell[]) {
        
        cell[value] ++;
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
    public boolean startNewGame(State state) {
        System.out.println(Constants.NEW_GAME);
        String yesOrNo = scanner.next();
        if (yesOrNo == "y" || yesOrNo == "Y") {
            for (int i = 0; i <= 12; i++) {
                for (int j = 0; j <= 3; j++) {
                    state.deck[j][i] = i + 1;
                }
            }
        }
        return yesOrNo.equals("y") || yesOrNo.equals("Y");
    }
    public void printWelcome() {
        System.out.println(Constants.NEW_GAME_STARTED);
    }
    public void printInvalidRowOrColumn() {
        System.out.println(Constants.INVALID_MOVE_ERROR);
    }
    public void printBoard(State state) {
        System.out.println();
        System.out.printf(Constants.DIVIDER_STRING + Constants.HAND_STRING, state.getCell(10) + Constants.HAND_STRING, state.getCell(11) + Constants.HAND_STRING, state.getCell(0) + Constants.DIVIDER_STRING);
        System.out.println();
        System.out.printf(Constants.HAND_STRING, state.getCell(9) + Constants.DIVIDER_STRING + Constants.DIVIDER_STRING + Constants.DIVIDER_STRING + Constants.HAND_STRING, state.getCell(1));
        System.out.println();
        System.out.printf(Constants.HAND_STRING, state.getCell(8) + Constants.DIVIDER_STRING + Constants.HAND_STRING, state.getCell(12) + Constants.DIVIDER_STRING + Constants.HAND_STRING, state.getCell(2));
        System.out.println();
        System.out.printf(Constants.HAND_STRING, state.getCell(7) + Constants.DIVIDER_STRING + Constants.DIVIDER_STRING + Constants.DIVIDER_STRING + Constants.HAND_STRING, state.getCell(3));
        System.out.println();
        System.out.printf(Constants.DIVIDER_STRING + Constants.HAND_STRING, state.getCell(6) + Constants.HAND_STRING, state.getCell(5) + Constants.HAND_STRING, state.getCell(4) + Constants.DIVIDER_STRING);
    }
}
