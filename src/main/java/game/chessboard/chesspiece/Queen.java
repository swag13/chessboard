package game.chessboard.chesspiece;

import game.chessboard.ChessPiece;
import game.chessboard.ChessPieceType;
import game.chessboard.Direction;
import game.chessboard.DirectionProvider;

import java.util.ArrayList;
import java.util.List;

public class Queen extends ChessPieceMovement implements ChessPiece{

	String startPosition ;
	List<String> movement = new ArrayList<String>();

	public Queen() {

	}
	public Queen(String startPosition) {
		this.startPosition = startPosition; 

	}

	@Override
	public List<String> move() {
		List<Direction> directions = new DirectionProvider().getDirection(this);
		for (Direction direction : directions) {
			switch (direction) {
			case UP:
				resolveAcrossMovement(0, 1, startPosition, this.movement);
				continue;
			case DOWN:
				resolveAcrossMovement(0, -1, startPosition, this.movement);
				continue;
			case LEFT:
				resolveAcrossMovement(-1, 0, startPosition, this.movement);
				continue;
			case RIGHT:
				resolveAcrossMovement(1, 0, startPosition, this.movement);
				continue;
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
		return ChessPieceType.QUEEN.getValue();
	}

}
