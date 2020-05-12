package game.chessboard;

public class ChessPieceFactory {
	public static final String KING = "King";
	public static final String QUEEN = "Queen";
	public static final String HORSE = "Horse";

	public static ChessPiece create(String type, String position) {
		switch(type) {
		case KING :
			return new King(position);
		case QUEEN :
			return new Queen(position);
		default :
			return null;

		}
	}
}
