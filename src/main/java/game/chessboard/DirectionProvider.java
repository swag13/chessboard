package game.chessboard;

import java.util.ArrayList;
import java.util.List;

public class DirectionProvider {
	
	public List<String> getDirection(ChessPiece type) {
		List<String> dir = new ArrayList<String>();
		switch (type.getType()) {
		case "King":
			dir.add(Direction.UP.toString());
			dir.add(Direction.DOWN.toString());
			dir.add(Direction.LEFT.toString());
			dir.add(Direction.RIGHT.toString());
			dir.add(Direction.DIAGONAL_UP_LEFT.toString());
			dir.add(Direction.DIAGONAL_UP_RIGHT.toString());
			dir.add(Direction.DIAGONAL_DOWN_LEFT.toString());
			dir.add(Direction.DIAGONAL_DOWN_RIGHT.toString());
			break;

		default:
			break;
		}
		return dir;
		
	}

}
