package game.chessboard;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ChessPieceTypeTest {

	@Test
	public void testGetStringValues() {
		String[] expected = {"King", "Queen", "Horse", "Bishop", "Pawn", "Rook"};
		List<String> actuals = ChessPieceType.getStringValues();
		Assert.assertTrue(Arrays.asList(expected).containsAll(actuals));
	}

}
