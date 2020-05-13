package game.chessboard.chesspiece;

import game.chessboard.ChessPiece;
import game.chessboard.ChessPieceType;
import game.chessboard.Direction;
import game.chessboard.DirectionProvider;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends ChessPieceMovement implements ChessPiece{

	String startPosition ;
	public Pawn() {

	}
	public Pawn(String startPosition) {
		this.startPosition = startPosition; //D5
	}

	@Override
	public List<String> move() {
		List<Direction> directions = new DirectionProvider().getDirection(this);
		List<String> movement = new ArrayList<String>();
		for (Direction direction : directions) {
			switch (direction) {
			case UP:
				getPossibleMoves(movement, 0, 1);
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
	public String getType() {
		return ChessPieceType.PAWN.getValue();
	}

}
