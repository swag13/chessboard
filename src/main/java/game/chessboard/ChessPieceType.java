package game.chessboard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public enum ChessPieceType {
	KING ("King"),
	QUEEN ("Queen"),
	BISHOP ("Bishop"),
	HORSE ("Horse"),
	ROOK ("Rook"),
	PAWN ("Pawn");
	
	private static final Map<String, ChessPieceType> lookup = new HashMap<String, ChessPieceType>();

	public static Map<String, ChessPieceType> getLookup() {
		return lookup;
	}
	
	static {
		for (ChessPieceType chessPieceType : ChessPieceType.values() ) {
			lookup.put(chessPieceType.getValue(), chessPieceType);
		}
	}

	private ChessPieceType(String value) {
		this.value = value;
	}

	String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static List<String> getStringValues() {
		List<String> enumValues = new ArrayList<String>(); 
		enumValues.add(ChessPieceType.KING.getValue());
		enumValues.add(ChessPieceType.QUEEN.getValue());
		enumValues.add(ChessPieceType.BISHOP.getValue());
		enumValues.add(ChessPieceType.HORSE.getValue());
		enumValues.add(ChessPieceType.ROOK.getValue());
		enumValues.add(ChessPieceType.PAWN.getValue());
		return enumValues;
	}

}
