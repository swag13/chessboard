package game.chessboard;

import java.util.ArrayList;
import java.util.List;

public class DirectionProvider {

	public List<Direction> getDirection(ChessPiece type) {
		List<Direction> dir = new ArrayList<Direction>();
		
		ChessPieceType chessPieceType = ChessPieceType.getLookup().get(type.getType());
		
		switch (chessPieceType) {
		case KING:
			dir.add(Direction.UP);
			dir.add(Direction.DOWN);
			dir.add(Direction.LEFT);
			dir.add(Direction.RIGHT);
			dir.add(Direction.DIAGONAL_UP_LEFT);
			dir.add(Direction.DIAGONAL_UP_RIGHT);
			dir.add(Direction.DIAGONAL_DOWN_LEFT);
			dir.add(Direction.DIAGONAL_DOWN_RIGHT);
			break;

		case QUEEN :
			dir.add(Direction.UP);
			dir.add(Direction.DOWN);
			dir.add(Direction.LEFT);
			dir.add(Direction.RIGHT);
			dir.add(Direction.DIAGONAL_UP_LEFT);
			dir.add(Direction.DIAGONAL_UP_RIGHT);
			dir.add(Direction.DIAGONAL_DOWN_LEFT);
			dir.add(Direction.DIAGONAL_DOWN_RIGHT);
			break;

		case BISHOP:
			dir.add(Direction.DIAGONAL_UP_LEFT);
			dir.add(Direction.DIAGONAL_UP_RIGHT);
			dir.add(Direction.DIAGONAL_DOWN_LEFT);
			dir.add(Direction.DIAGONAL_DOWN_RIGHT);
			break;
			
		case HORSE:
			dir.add(Direction.UP);
			dir.add(Direction.DOWN);
			dir.add(Direction.LEFT);
			dir.add(Direction.RIGHT);
			break;
		
		case ROOK:
			dir.add(Direction.UP);
			dir.add(Direction.DOWN);
			dir.add(Direction.LEFT);
			dir.add(Direction.RIGHT);
			break;
			
		case PAWN:
			dir.add(Direction.UP);
			dir.add(Direction.DIAGONAL_UP_LEFT);
			dir.add(Direction.DIAGONAL_UP_RIGHT);
			break;

		default:
			break;
		}
		return dir;

	}

}
