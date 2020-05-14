package game.chessboard;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChessTest {

	@Before
	public void initChessBoard() {
		ChessBoard.init();
	}
	
	@Test
	public void testIsValid1() {
		Assert.assertTrue(Chess.isValidInput("King D5"));
	}
	
	@Test
	public void testIsValid2() {
		Assert.assertFalse(Chess.isValidInput("King XY"));
	}
	
	@Test
	public void testIsValid3() {
		Assert.assertFalse(Chess.isValidInput("King $Y"));
	}
	
	@Test
	public void testIsValid4() {
		Assert.assertFalse(Chess.isValidInput("jhghfgd $Y"));
	}
}
