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
        {13, 13, 13, 13}, // = 52
    };
    private int gameState = Constants.STANDBY;
    private String name = "";
    private int cell[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private int row = 0;
    private int col = 0;
    private int num = 0;
    public int setGameState() {
        return this.gameState;
    }
    public void setGameState(int gameState) {
        this.gameState = gameState;
    }
    public void setName (String name) {
        this.name = name;
    }
    public String getName (String name) {
        return name;
    }
    public int randomCardCol() {
        int randomCardCol = (int)(Math.random()*Constants.MAX_HAND);
        return col = randomCardCol;
    }
    public int randomCardRow() {
        int randomCardRow = (int)(Math.random()*Constants.SUIT_SIZE);
        return row = randomCardRow;
    }
    public int getDeck () {
        return deck[col][row];
    }
    public void setDeck() {
        this.deck[row][col] = 0;
    }
    public int getCell(int cell) {
        return this.cell[cell];
    }
    public void setCell(int cell) {
        this.cell[cell]++;
    }
    public boolean isWinner() {
        int total = 0;
        boolean isWinner = false;
        for (int i = 0; i <= 11; i++) {
            for (int j = 0; j <= 3; j++) {
                total += deck[i][j];
            }
        }
        if (total == 0) {
            isWinner= true;
        }
        return isWinner;
    }
}
