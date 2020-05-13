package game.chessboard;

import game.chessboard.chesspiece.King;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class DirectionProviderTest {

	@Test
	public void testGetDirectionForKing() {
		DirectionProvider dp = new DirectionProvider();
		String[] kingDir = {"UP", "DOWN", "LEFT", "RIGHT", "DIAGONAL_UP_LEFT", "DIAGONAL_UP_RIGHT", "DIAGONAL_DOWN_LEFT", "DIAGONAL_DOWN_RIGHT"};
		Assert.assertEquals(Arrays.asList(kingDir), dp.getDirection(new King()));
	}
	
	@Test
	public void testGetDirectionForQueen() {
		DirectionProvider dp = new DirectionProvider();
		String[] kingDir = {"UP", "DOWN", "LEFT", "RIGHT", "DIAGONAL_UP_LEFT", "DIAGONAL_UP_RIGHT", "DIAGONAL_DOWN_LEFT", "DIAGONAL_DOWN_RIGHT"};
		Assert.assertEquals(Arrays.asList(kingDir), dp.getDirection(new King()));
	}

}
