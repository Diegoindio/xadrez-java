package chess;

import boardgame.Board;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
    }
    //returns a matrix of chess pieces corresponding to the match
    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j< board.getColumns(); j++) {
                //downcast downcast to interpret as a chess piece and not as an ordinary piece
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat; //returns the matrix of chess pieces
    }
}
