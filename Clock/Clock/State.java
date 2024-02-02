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
        {1, 1, 1, 1}, // = 4
        {2, 2, 2, 2}, // = 8
        {3, 3, 3, 3}, // = 12
        {4, 4, 4, 4}, // = 16
        {5, 5, 5, 5}, // = 20
        {6, 6, 6, 6}, // = 24
        {7, 7, 7, 7}, // = 28
        {8, 8, 8, 8}, // = 32
        {9, 9, 9, 9}, // = 36
        {10, 10, 10, 10}, // = 40
        {11, 11, 11, 11}, // = 44
        {12, 12, 12, 12}, // = 48
        {13, 13, 13, 13},
    };
    private int gameState = Constants.STANDBY;
    private String name = "";
    int cell = 0;
    
    public int setGameState() {
        return this.gameState;
    }
    public void setGameState(int gameState) {
        this.gameState = gameState;
    }
    public void setName (String name) {
        this.name = name;
    }
    public int getDeck (int row, int col) {
        return this.deck[row][col];
    }
    public void setDeck(int row, int col, int value) {
        this.deck[row][col] = value;
    }
    public int setCell(int cell) {
        return this.cell;
    }
    public void getCell(int cell, int value) {
        this.cell = cell;
    }
    public boolean isWinner() {
        int total = 0;
        boolean isWinner = false;
        for (int i = 0; i >= 11; i++) {
            for (int j = 0; j >=3; j++) {
                total = getDeck(i, j);
            }
        }
        if (total == 0) {
            isWinner= true;
        }
        return isWinner;
    }
}
