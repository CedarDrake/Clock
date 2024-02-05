package Clock;
import java.util.Scanner;


/**
 * Write a description of class UI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UI
{
    Scanner scanner;
    
    public UI() {
        scanner = new Scanner(System.in);
    }
    public String getPlayerName(String name) {
        return name;
    }
    public boolean isLegalCard(State state, int row, int col) {
        if (state.getDeck(row, col) == 0) {
            return false;
        } else {
            return true;
        }
    }
    public boolean isLegalMove(State state, int cell, int row, int col) {
        if (state.getDeck(row, col) == cell) {
            return true;
        } else {
            return false;
        }
    }
}
