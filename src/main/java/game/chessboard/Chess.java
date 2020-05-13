package game.chessboard;

import java.util.List;
import java.util.Scanner;

public class Chess {
	public static void main(String[] args) {
		String input = "";
		System.out.println("------- Chess Board Game -------"
				+ "\nPlease enter chess piece type and starting position to find out possible moves\n");
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			input = sc.nextLine();
			if (isValidInput(input)) {
				play(input);
				System.out.println();
			}
		}
		sc.close();
	}

	/** This method checks the validity of the inputs
	 * @param input
	 * @return boolean
	 */
	private static boolean isValidInput(String input) {
		boolean isValid = false;
		String[] inputs = input.split(" ");
		String type = inputs[0];
		Integer position = Integer.parseInt(inputs[1]);
		if (ChessPieceType.getStringValues().contains(type) && position >= 1 && position <= 8){
			isValid = true;
		} else
			System.out.println("Please enter valid inputs.");
		return isValid;
	}

	/** This method creates the chess piece type based on inputs and prints the possible moves
	 * @param input
	 */
	private static void play(String input) {
		int counter = 0;
		String[] inputs = input.split(" ");
		String type = inputs[0];
		String position = inputs[1];
		ChessBoard.init();
		ChessPiece chessPiece = ChessPieceFactory.create(type, position);
		List<String> movements = chessPiece.move();
		for (String movement : movements) {
			if (counter == 0) {
				System.out.print(movement);
			} else {
				System.out.print(", "+movement);
			}
			counter++;
		}
	}
}
