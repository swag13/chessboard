package game.chessboard.chesspiece;

import game.chessboard.ChessBoard;
import game.chessboard.ChessPiece;
import game.chessboard.DirectionProvider;

import java.util.ArrayList;
import java.util.List;

public class Queen implements ChessPiece{

	String startPosition ;
	List<String> movement = new ArrayList<String>();

	public Queen() {

	}
	public Queen(String startPosition) {
		this.startPosition = startPosition; //D5

	}

	@Override
	public List<String> move() {
		List<String> dir = getDirection();
		for (String s : dir) {
			int x = 0, y = 0;
			switch (s) {
			case "UP":
				y = y+1;
				resolveMovement(x, y, startPosition);
				continue;
			case "DOWN":
				y = y-1;
				resolveMovement(x, y, startPosition);
				continue;
			case "LEFT":
				x = x-1;
				resolveMovement(x, y, startPosition);
				continue;
			case "RIGHT":
				x = x+1;
				resolveMovement(x, y, startPosition);
				continue;
			case "DIAGONAL_UP_LEFT":
				x = x-1;
				y = y+1;
				resolveMovement(x, y, startPosition);
				continue;
			case "DIAGONAL_UP_RIGHT":
				x = x+1;
				y = y+1;
				resolveMovement(x, y, startPosition);
				continue;
			case "DIAGONAL_DOWN_LEFT":
				x = x-1;
				y = y-1;
				resolveMovement(x, y, startPosition);
				continue;
			case "DIAGONAL_DOWN_RIGHT":
				x = x+1;
				y = y-1;
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
		if (j==1 && i==0) { // UP
			while(yPos + j<=7) {
				this.movement.add(board[xPos + i][yPos + j]);
				j++;
			}
		} else if (j==-1 && i==0) { // DOWN
			while(yPos + j>=0) {
				this.movement.add(board[xPos + i][yPos + j]);
				j--;
			}
		} else if (j==0 && i==-1) { // LEFT
			while(xPos + i>=0) {
				this.movement.add(board[xPos + i][yPos + j]);
				i--;
			}
		} else if (j==0 && i==1) { // RIGHT
			while(xPos + i<=7) {
				this.movement.add(board[xPos + i][yPos + j]);
				i++;
			}
		} else if (j==-1 && i==1) { // DIAGONAL_UP_LEFT
			while(xPos + i<=7 && yPos + j>=0) {
				this.movement.add(board[xPos + i][yPos + j]);
				i++;
				j--;
			}
		} else if (j==1 && i==-1) { // DIAGONAL_DOWN_RIGHT
			while(yPos + j<=7 && xPos + i>=0) {
				this.movement.add(board[xPos + i][yPos + j]);
				j++;
				i--;
			}
		}
		else if (j==-1 && i==-1) { // DIAGONAL_DOWN_LEFT
			while(xPos + i>=0 && yPos + j>=0) {
				this.movement.add(board[xPos + i][yPos + j]);
				i--;
				j--;
			}
		} else if (j==1 && i==1) { // DIAGONAL_UP_RIGHT
			while(yPos + j<=7 && xPos + i<=7) {
				this.movement.add(board[xPos + i][yPos + j]);
				j++;
				i++;
			}
		}
	}


	@Override
	public List<String> getDirection() {
		List<String> dir = new DirectionProvider().getDirection(this);
		return dir;
	}

	@Override
	public String getType() {
		return "Queen";
	}

}
