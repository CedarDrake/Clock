package Clock;


/**
 * Write a description of class State here.
 *
 * @author (Cedar Drake)
 * @version (1.0.0)
 */
public class State
{
    int[][] deck = {
        {1, 1, 1, 1},
        {2, 2, 2, 2},
        {3, 3, 3, 3},
        {4, 4, 4, 4},
        {5, 5, 5, 5},
        {6, 6, 6, 6},
        {7, 7, 7, 7},
        {8, 8, 8, 8},
        {9, 9, 9, 9},
        {10, 10, 10, 10},
        {11, 11, 11, 11},
        {12, 12, 12, 12},
        {13, 13, 13, 13},
    };
    private int gameState = Constants.STANDBY;
    private String name = "";
    public int setGameState() {
        return this.gameState;
    }
    public void setGameState(int gameState) {
        this.gameState = gameState;
    }
    public void setName (String name) {
        this.name = name;
    }
    
}
