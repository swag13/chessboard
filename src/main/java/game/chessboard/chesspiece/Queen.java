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
			switch (s) {
			case "UP":
				resolveMovement(0, 1, startPosition);
				continue;
			case "DOWN":
				resolveMovement(0, -1, startPosition);
				continue;
			case "LEFT":
				resolveMovement(-1, 0, startPosition);
				continue;
			case "RIGHT":
				resolveMovement(1, 0, startPosition);
				continue;
			case "DIAGONAL_UP_LEFT":
				resolveMovement(-1, 1, startPosition);
				continue;
			case "DIAGONAL_UP_RIGHT":
				resolveMovement(1, 1, startPosition);
				continue;
			case "DIAGONAL_DOWN_LEFT":
				resolveMovement(-1, -1, startPosition);
				continue;
			case "DIAGONAL_DOWN_RIGHT":
				resolveMovement(1, -1, startPosition);
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
