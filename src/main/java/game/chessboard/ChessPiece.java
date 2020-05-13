package game.chessboard;

import java.util.List;

public interface ChessPiece {
	String getType();
	List<String> move();
}
