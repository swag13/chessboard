package game.chessboard.chesspiece;

import game.chessboard.ChessPiece;
import game.chessboard.DirectionProvider;

import java.util.ArrayList;
import java.util.List;

public class King extends ChessPieceMovement implements ChessPiece{

	String startPosition ;
	List<String> movement = new ArrayList<String>();
	
	public King() {

	}
	public King(String startPosition) {
		this.startPosition = startPosition; //D5
	}

	@Override
	public List<String> move() {
		List<String> dir = getDirection();
		for (String s : dir) {
			switch (s) {
			case "UP":
				getPossibleMoves(movement, 0, 1);
				continue;
			case "DOWN":
				getPossibleMoves(movement, 0, -1);
				continue;
			case "LEFT":
				getPossibleMoves(movement, -1, 0);
				continue;
			case "RIGHT":
				getPossibleMoves(movement, 1, 0);
				continue;
			case "DIAGONAL_UP_LEFT":
				getPossibleMoves(movement, -1, 1);
				continue;
			case "DIAGONAL_UP_RIGHT":
				getPossibleMoves(movement, 1, 1);
				continue;
			case "DIAGONAL_DOWN_LEFT":
				getPossibleMoves(movement, -1, -1);
				continue;
			case "DIAGONAL_DOWN_RIGHT":
				getPossibleMoves(movement, 1, -1);
				continue;
			default:
				continue;
			}
		}
		return movement;
	}

	private void getPossibleMoves(List<String> movement, int x, int y) {
		String endPos = resolveStepMovement(x, y, startPosition);
		if (!endPos.isEmpty()) {
			movement.add(resolveStepMovement(x, y, startPosition));
		}
	}

	@Override
	public List<String> getDirection() {
		List<String> dir = new DirectionProvider().getDirection(this);
		return dir;
	}

	@Override
	public String getType() {
		return "King";
	}

}
