package game.chessboard.chesspiece;

import game.chessboard.ChessPiece;
import game.chessboard.Direction;
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
		List<Direction> directions = new DirectionProvider().getDirection(this);
		for (Direction direction : directions) {
			switch (direction) {
			case DIAGONAL_UP_LEFT:
				resolveAcrossMovement(-1, 1, startPosition, this.movement);
				continue;
			case DIAGONAL_UP_RIGHT:
				resolveAcrossMovement(1, 1, startPosition, this.movement);
				continue;
			case DIAGONAL_DOWN_LEFT:
				resolveAcrossMovement(-1, -1, startPosition, this.movement);
				continue;
			case DIAGONAL_DOWN_RIGHT:
				resolveAcrossMovement(1, -1, startPosition, this.movement);
				continue;
			default:
				continue;
			}
		}
		return this.movement;
	}

	@Override
	public String getType() {
		return "Bishop";
	}

}
