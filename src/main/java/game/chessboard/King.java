package game.chessboard;

import java.util.ArrayList;
import java.util.List;

public class King implements ChessPiece{

	String startPosition ;
	String endPosition;


	public King() {

	}

	public King(String startPosition) {
		this.startPosition = startPosition; //D5
	}



	@Override
	public List<String> move() {
		List<String> dir = getDirection();
		List<String> movement = new ArrayList<String>();
		for (String s : dir) {
			int x = 0, y = 0;
			switch (s) {
			case "UP":
				y = y+1;
				getPossibleMoves(movement, x, y);
				continue;
			case "DOWN":
				y = y-1;
				getPossibleMoves(movement, x, y);
				continue;
			case "LEFT":
				x = x-1;
				getPossibleMoves(movement, x, y);
				continue;
			case "RIGHT":
				x = x+1;
				getPossibleMoves(movement, x, y);
				continue;
			case "DIAGONAL_UP_LEFT":
				x = x-1;
				y = y+1;
				getPossibleMoves(movement, x, y);
				continue;
			case "DIAGONAL_UP_RIGHT":
				x = x+1;
				y = y+1;
				getPossibleMoves(movement, x, y);
				continue;
			case "DIAGONAL_DOWN_LEFT":
				x = x-1;
				y = y-1;
				getPossibleMoves(movement, x, y);
				continue;
			case "DIAGONAL_DOWN_RIGHT":
				x = x+1;
				y = y-1;
				getPossibleMoves(movement, x, y);
				continue;
			default:
				continue;
			}
		}
		return movement;
	}

	private void getPossibleMoves(List<String> movement, int x, int y) {
		String endPos = resolveMovement(x, y, startPosition);
		if (!endPos.isEmpty()) {
			movement.add(resolveMovement(x, y, startPosition));
		}
	}

	public String resolveMovement(int i, int j, String startPosition) {
		ChessBoard.init();
		String endPos = "";
		String[][] board = ChessBoard.chessBoard;
		for (int y=7; y>=0;y--) {
			for (int x=0; x<8;x++) {
				if (board[x][y].equals(startPosition)){
					if (y+j <= 7 && x+i <= 7 && y+j > -1 && x+i > -1) {
						endPos = (board[x+i][y+j]);
					}
					
				}
			}
		}
		return endPos;
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
