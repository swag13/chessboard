package game.chessboard;

public class ChessBoard {
	public static String[][] chessBoard;
	public static String[] positions;


	/** This method initiates the chess board which is a 2D array
	 * This method also creates an array of possible chess board positions.
	 */
	public static void init() {
		String[] rowPos = {"A", "B", "C", "D", "E", "F", "G", "H"};
		String[] colPos = {"1", "2", "3", "4" , "5", "6", "7", "8"};
		String[][] board = new String[8][8];
		String[] boardPositions = new String[64];
		int counter = 0;
		for (int i=0; i<8;i++) {
			for (int j=0; j<8;j++) {
				board[i][j] = rowPos[i] + colPos[j];
				boardPositions[counter] = rowPos[i] + colPos[j];
				counter++;
			}
		}
		chessBoard = board;
		positions = boardPositions;
	}


}
