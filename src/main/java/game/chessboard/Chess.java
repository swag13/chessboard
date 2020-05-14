package game.chessboard;

import game.chessboard.util.ChessConstant;
import game.chessboard.util.ChessUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Chess {
	public static void main(String[] args) {
		String input = "";
		System.out.println("------- Chess Board Game -------"
				+ "\nPlease enter chess piece type and starting position to find out possible moves\n");
		ChessBoard.init();
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			input = sc.nextLine();
			if (isValidInput(input)) {
				play(input);
				System.out.println();
			} else {
				System.out.println("Please enter valid input to play...");
			}
		}
		sc.close();
	}

	/** This method checks the validity of the inputs
	 * @param input
	 * @return boolean
	 */
	public static boolean isValidInput(String input) {
		boolean isValid = false;
		if (input.indexOf(ChessConstant.SPACE) > 0) {
			String[] inputs = input.split(ChessConstant.SPACE);
			String type = ChessUtil.convertToProperCase(inputs[0]);
			String position = ChessUtil.convertToProperCase(inputs[1]);
			if (ChessPieceType.getStringValues().contains(type) && Arrays.asList(ChessBoard.positions).contains(position))
				isValid = true;
		}
		
		return isValid;
	}

	/** This method creates the chess piece type based on inputs and prints the possible moves
	 * @param input
	 */
	private static void play(String input) {
		int counter = 0;
		String[] inputs = input.split(ChessConstant.SPACE);
		String type = ChessUtil.convertToProperCase(inputs[0]);
		String position = ChessUtil.convertToProperCase(inputs[1]);
		ChessPiece chessPiece = ChessPieceFactory.create(type, position);
		List<String> movements = chessPiece.move();
		for (String movement : movements) {
			if (counter == 0) {
				System.out.print(movement);
			} else {
				System.out.print(ChessConstant.COMMA + movement);
			}
			counter++;
		}
	}
}
