package application;

import boardgame.Position;
import chess.ChessMatch;

public class Program {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        //print pieces of chessMatch
        UI.printBoard(chessMatch.getPieces());
        //Board board = new Board(8,8);

    }
}
