package game.chessboard;

import java.util.List;
import java.util.Scanner;

public class Chess {
	public static void main(String[] args) {
		String input = "";
		Scanner sc = new Scanner(System.in);
		//while (sc.hasNext()) {
			input = sc.nextLine();
		//}
		play(input);
		sc.close();
	}

	private static void play(String input) {
		String[] inputs = input.split(" ");
		String type = inputs[0];
		String position = inputs[1];
		ChessBoard.init();
		ChessPiece chessPiece = ChessPieceFactory.create(type, position);
		List<String> movements = chessPiece.move();
		for (String movement : movements) {
			System.out.print(movement+", ");
		}
	}
}
