package Clock;


/**
 * Write a description of class EventLoop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EventLoop
{
    State state = new State();
    UI ui = new UI();
    int row, col;
    int card = 0;
    
    public static void main(String[] args) {
        EventLoop eventLoop = new EventLoop();
        eventLoop.run();
    }
    
    public void run() {
        while (state.getGameState() != Constants.QUIT_PROGRAM) {
            int gameState = state.getGameState();
            if (gameState == Constants.STANDBY) {
                state.setGameState(Constants.DRAW_CARD);
                for (int i = 0; i <= 12; i++) {
                    state.setCell(i, 0);
                }
            }
            else if (gameState == Constants.DRAW_CARD) {
                row = state.randomCardRow();
                col = state.randomCardCol();
                getDeck()
                if (ui.isLegalCard(state)) {
                    
                }
            }
            else if (gameState == Constants.GET_MOVE) {
                ui.printBoard(state);
                state.getCell(ui.getMove());
                
                if (ui.isLegalMove(state, cell)) {
                    
                }
            }
        }
    }
}
