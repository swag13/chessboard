package game.chessboard;

import game.chessboard.chesspiece.Queen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueenTest {

	@Before
	public void initChessBoard() {
		ChessBoard.init();
	}
	
	@Test
	public void testMoveBoundaryCond1() {
		Queen queen = new Queen("A8");
		String[] expectedPos = {"A7", "B8", "B7"};
		List<String> movements = new ArrayList<String>();
		movements = queen.move();
		Assert.assertTrue(movements.containsAll(Arrays.asList(expectedPos)));

	}
	
	@Test
	public void testMoveBoundaryCond2() {
		Queen queen = new Queen("H8");
		String[] expectedPos = {"G7", "G8", "H7"};
		List<String> movements = new ArrayList<String>();
		movements = queen.move();
		Assert.assertTrue(movements.containsAll(Arrays.asList(expectedPos)));

	}
	
	@Test
	public void testMoveBoundaryCond3() {
		Queen queen = new Queen("A1");
		String[] expectedPos = {"A2", "B2", "B1"};
		List<String> movements = new ArrayList<String>();
		movements = queen.move();
		Assert.assertTrue(movements.containsAll(Arrays.asList(expectedPos)));

	}
	
	@Test
	public void testMoveBoundaryCond4() {
		Queen queen = new Queen("H1");
		String[] expectedPos = {"H2", "G2", "G1"};
		List<String> movements = new ArrayList<String>();
		movements = queen.move();
		Assert.assertTrue(movements.containsAll(Arrays.asList(expectedPos)));

	}
	
	@Test
	public void testMove() {
		Queen queen = new Queen("D5");
		String[] expectedPos = {};//[D6, D7, D8, D4, D3, D2, D1, C5, B5, A5, E5, F5, G5, H5, C6, B7, A8, E6, F7, G8, C4, B3, A2, E4, F3, G2, H1]};
		List<String> movements = new ArrayList<String>();
		movements = queen.move();
		Assert.assertTrue(movements.containsAll(Arrays.asList(expectedPos)));

	}

}
