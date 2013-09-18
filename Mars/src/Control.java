import java.util.ArrayList;
import java.util.List;

public class Control {
    private List<Move> moveList = new ArrayList<Move>();

    public void doMove(Move move) {
        moveList.add(move);
        placeMove();
    }

    private void placeMove() {
        for (Move move : moveList) {
            move.execute();
        }
        moveList.clear();
    }
}
