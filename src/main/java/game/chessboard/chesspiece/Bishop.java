package game.chessboard.chesspiece;

import game.chessboard.ChessPiece;
import game.chessboard.DirectionProvider;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends ChessPieceMovement implements ChessPiece{

	String startPosition ;
	List<String> movement = new ArrayList<String>();

	public Bishop() {

	}
	public Bishop(String startPosition) {
		this.startPosition = startPosition; //D5

	}

	@Override
	public List<String> move() {
		List<String> dir = getDirection();
		for (String s : dir) {
			switch (s) {
			case "DIAGONAL_UP_LEFT":
				resolveAcrossMovement(-1, 1, startPosition, this.movement);
				continue;
			case "DIAGONAL_UP_RIGHT":
				resolveAcrossMovement(1, 1, startPosition, this.movement);
				continue;
			case "DIAGONAL_DOWN_LEFT":
				resolveAcrossMovement(-1, -1, startPosition, this.movement);
				continue;
			case "DIAGONAL_DOWN_RIGHT":
				resolveAcrossMovement(1, -1, startPosition, this.movement);
				continue;
			default:
				continue;
			}
		}
		return this.movement;
	}

	@Override
	public List<String> getDirection() {
		List<String> dir = new DirectionProvider().getDirection(this);
		return dir;
	}

	@Override
	public String getType() {
		return "Bishop";
	}

}
