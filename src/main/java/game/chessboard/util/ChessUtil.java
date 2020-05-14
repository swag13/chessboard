package game.chessboard.util;

public class ChessUtil {

	public static String convertToProperCase(String input) {
		return Character.toTitleCase(input.charAt(0))+ input.substring(1).toLowerCase();
	}
}
