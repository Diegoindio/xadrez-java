package boardgame;

public class Piece {
    protected Position position;
    private Boar board;

    public Piece(Boar board) {
        this.board = board;
        position = null;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    //Only class within the package and subclass may have access to a piece board
    protected Boar getBoard() {
        return board;
    }

}
