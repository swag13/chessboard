package game.chessboard;

import java.util.Scanner;

public class Chess {
	public static void main(String[] args) {
		String input = "";
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			input = sc.nextLine();
		}
		String[] inputs = input.split(" ");
		String type = inputs[0];
		String position = inputs[1];
		
		ChessPiece chessPiece = ChessPieceFactory.create(type, position);
		chessPiece.move();
		
		sc.close();
	}
}
