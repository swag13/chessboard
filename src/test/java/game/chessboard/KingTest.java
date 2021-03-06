package game.chessboard;

import game.chessboard.chesspiece.King;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KingTest {

	@Before
	public void initChessBoard() {
		ChessBoard.init();
	}
	
	@Test
	public void testMoveBoundaryCond1() {
		King king = new King("A8");
		String[] expectedPos = {"A7", "B8", "B7"};
		List<String> movements = new ArrayList<String>();
		movements = king.move();
		Assert.assertTrue(Arrays.asList(expectedPos).containsAll(movements));

	}
	
	@Test
	public void testMoveBoundaryCond2() {
		King king = new King("H8");
		String[] expectedPos = {"G7", "G8", "H7"};
		List<String> movements = new ArrayList<String>();
		movements = king.move();
		Assert.assertTrue(Arrays.asList(expectedPos).containsAll(movements));

	}
	
	@Test
	public void testMoveBoundaryCond3() {
		King king = new King("A1");
		String[] expectedPos = {"A2", "B2", "B1"};
		List<String> movements = new ArrayList<String>();
		movements = king.move();
		Assert.assertTrue(Arrays.asList(expectedPos).containsAll(movements));

	}
	
	@Test
	public void testMoveBoundaryCond4() {
		King king = new King("H1");
		String[] expectedPos = {"H2", "G2", "G1"};
		List<String> movements = new ArrayList<String>();
		movements = king.move();
		Assert.assertTrue(Arrays.asList(expectedPos).containsAll(movements));

	}
	
	@Test
	public void testMove() {
		King king = new King("D5");
		String[] expectedPos = {"D6", "E6", "E5", "E4", "D4", "C4", "C5", "C6"};
		List<String> movements = new ArrayList<String>();
		movements = king.move();
		Assert.assertTrue(Arrays.asList(expectedPos).containsAll(movements));

	}

}
