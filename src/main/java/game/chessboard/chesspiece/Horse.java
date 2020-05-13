package game.chessboard.chesspiece;

import game.chessboard.ChessBoard;
import game.chessboard.ChessPiece;
import game.chessboard.ChessPieceType;
import game.chessboard.Direction;
import game.chessboard.DirectionProvider;

import java.util.ArrayList;
import java.util.List;

public class Horse implements ChessPiece{

	String startPosition ;
	List<String> movement = new ArrayList<String>();

	public Horse() {

	}
	public Horse(String startPosition) {
		this.startPosition = startPosition;
	}

	@Override
	public List<String> move() {
		List<Direction> directions = new DirectionProvider().getDirection(this);
		int x = 0, y = 0;
		for (Direction direction : directions) {
			switch (direction) {
			case UP:
				y = 2;
				x = 1;
				resolveMovement(x, y, startPosition);
				y = 2;
				x = -1;
				resolveMovement(x, y, startPosition);
				continue;
			case DOWN:
				y = -2;
				x = -1;
				resolveMovement(x, y, startPosition);
				y = -2;
				x = 1;
				resolveMovement(x, y, startPosition);
				continue;
			case LEFT:
				x = -2;
				y = -1;				
				resolveMovement(x, y, startPosition);
				x = -2;
				y = 1;				
				resolveMovement(x, y, startPosition);
				continue;
			case RIGHT:
				x = 2;
				y = 1;
				resolveMovement(x, y, startPosition);
				x = 2;
				y = -1;
				resolveMovement(x, y, startPosition);
				continue;
			default:
				continue;
			}
		}
		return this.movement;
	}


	public void resolveMovement(int i, int j, String startPosition) {
		int xPos = 0;
		int yPos = 0;
		String[][] board = ChessBoard.chessBoard;
		for (int y=7; y>=0;y--) {
			for (int x=0; x<8; x++) {
				if (board[x][y].equals(startPosition)){
					xPos = x;
					yPos= y;
				}
			}
		}
		if(yPos + j<=7 && yPos + j>=0 && xPos + i>=0 && xPos + i<=7) {
			this.movement.add(board[xPos + i][yPos + j]);
		}
	}

	@Override
	public String getType() {
		return ChessPieceType.HORSE.getValue();
	}

}
