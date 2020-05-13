package game.chessboard.chesspiece;

import game.chessboard.ChessPiece;
import game.chessboard.DirectionProvider;

import java.util.ArrayList;
import java.util.List;

public class Rook extends ChessPieceMovement implements ChessPiece{

	String startPosition ;
	List<String> movement = new ArrayList<String>();

	public Rook() {

	}
	public Rook(String startPosition) {
		this.startPosition = startPosition; //D5

	}

	@Override
	public List<String> move() {
		List<String> dir = getDirection();
		for (String s : dir) {
			switch (s) {
			case "UP":
				resolveAcrossMovement(0, 1, startPosition, this.movement);
				continue;
			case "DOWN":
				resolveAcrossMovement(0, -1, startPosition, this.movement);
				continue;
			case "LEFT":
				resolveAcrossMovement(-1, 0, startPosition, this.movement);
				continue;
			case "RIGHT":
				resolveAcrossMovement(1, 0, startPosition, this.movement);
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
		return "Rook";
	}

}
