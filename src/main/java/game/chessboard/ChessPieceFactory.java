package game.chessboard;

import game.chessboard.chesspiece.Bishop;
import game.chessboard.chesspiece.Horse;
import game.chessboard.chesspiece.King;
import game.chessboard.chesspiece.Pawn;
import game.chessboard.chesspiece.Queen;
import game.chessboard.chesspiece.Rook;

import java.util.ArrayList;
import java.util.List;

public class ChessPieceFactory {
	public static final String KING = "King";
	public static final String QUEEN = "Queen";
	public static final String BISHOP = "Bishop";
	public static final String HORSE = "Horse";
	public static final String ROOK = "Rook";
	public static final String PAWN = "Pawn";
	
	
	public static ChessPiece create(String type, String position) {
		switch(type) {
		case KING :
			return new King(position);
		case QUEEN :
			return new Queen(position);
		case BISHOP :
			return new Bishop(position);
		case HORSE :
			return new Horse(position);
		case ROOK :
			return new Rook(position);
		case PAWN :
			return new Pawn(position);
		default :
			return null;

		}
	}
}
