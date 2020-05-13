package game.chessboard;

import java.util.ArrayList;
import java.util.List;

public class DirectionProvider {

	public List<String> getDirection(ChessPiece type) {
		List<String> dir = new ArrayList<String>();
		switch (type.getType()) {
		case ChessPieceFactory.KING :
			dir.add(Direction.UP.toString());
			dir.add(Direction.DOWN.toString());
			dir.add(Direction.LEFT.toString());
			dir.add(Direction.RIGHT.toString());
			dir.add(Direction.DIAGONAL_UP_LEFT.toString());
			dir.add(Direction.DIAGONAL_UP_RIGHT.toString());
			dir.add(Direction.DIAGONAL_DOWN_LEFT.toString());
			dir.add(Direction.DIAGONAL_DOWN_RIGHT.toString());
			break;

		case ChessPieceFactory.QUEEN :
			dir.add(Direction.UP.toString());
			dir.add(Direction.DOWN.toString());
			dir.add(Direction.LEFT.toString());
			dir.add(Direction.RIGHT.toString());
			dir.add(Direction.DIAGONAL_UP_LEFT.toString());
			dir.add(Direction.DIAGONAL_UP_RIGHT.toString());
			dir.add(Direction.DIAGONAL_DOWN_LEFT.toString());
			dir.add(Direction.DIAGONAL_DOWN_RIGHT.toString());
			break;

		case ChessPieceFactory.BISHOP:
			dir.add(Direction.DIAGONAL_UP_LEFT.toString());
			dir.add(Direction.DIAGONAL_UP_RIGHT.toString());
			dir.add(Direction.DIAGONAL_DOWN_LEFT.toString());
			dir.add(Direction.DIAGONAL_DOWN_RIGHT.toString());
			break;
			
		case ChessPieceFactory.HORSE:
			dir.add(Direction.UP.toString());
			dir.add(Direction.DOWN.toString());
			dir.add(Direction.LEFT.toString());
			dir.add(Direction.RIGHT.toString());
			break;

		default:
			break;
		}
		return dir;

	}

}
