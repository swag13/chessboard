package game.chessboard.chesspiece;

import game.chessboard.ChessBoard;

import java.util.List;

public abstract class ChessPieceMovement {

	public String resolveStepMovement(int i, int j, String startPosition) {
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
	
	public void resolveAcrossMovement(int i, int j, String startPosition, List<String> movement) {
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
				movement.add(board[xPos + i][yPos + j]);
				j++;
			}
		} else if (j==-1 && i==0) { // DOWN
			while(yPos + j>=0) {
				movement.add(board[xPos + i][yPos + j]);
				j--;
			}
		} else if (j==0 && i==-1) { // LEFT
			while(xPos + i>=0) {
				movement.add(board[xPos + i][yPos + j]);
				i--;
			}
		} else if (j==0 && i==1) { // RIGHT
			while(xPos + i<=7) {
				movement.add(board[xPos + i][yPos + j]);
				i++;
			}
		} else if (j==-1 && i==1) { // DIAGONAL_UP_LEFT
			while(xPos + i<=7 && yPos + j>=0) {
				movement.add(board[xPos + i][yPos + j]);
				i++;
				j--;
			}
		} else if (j==1 && i==-1) { // DIAGONAL_DOWN_RIGHT
			while(yPos + j<=7 && xPos + i>=0) {
				movement.add(board[xPos + i][yPos + j]);
				j++;
				i--;
			}
		}
		else if (j==-1 && i==-1) { // DIAGONAL_DOWN_LEFT
			while(xPos + i>=0 && yPos + j>=0) {
				movement.add(board[xPos + i][yPos + j]);
				i--;
				j--;
			}
		} else if (j==1 && i==1) { // DIAGONAL_UP_RIGHT
			while(yPos + j<=7 && xPos + i<=7) {
				movement.add(board[xPos + i][yPos + j]);
				j++;
				i++;
			}
		}
	}

}
