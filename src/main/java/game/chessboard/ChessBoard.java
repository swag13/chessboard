package game.chessboard;

public class ChessBoard {
	static String[][] chessBoard;


	public static void init() {
		String[] rowPos = {"A", "B", "C", "D", "E", "F", "G", "H"};
		String[] colPos = {"1", "2", "3", "4" , "5", "6", "7", "8"};
		String[][] board = new String[8][8];

		for (int i=0; i<8;i++) {
			for (int j=0; j<8;j++) {
				board[i][j] = rowPos[i] + colPos[j];
			}
		}
		chessBoard = board;
	}
}
