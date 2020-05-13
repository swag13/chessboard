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
		String[] expectedPos = {"A7", "A6", "A5", "A4", "A3", "A2", "A1", "B8", "C8", "D8", "E8", "F8", "G8", "H8", "B7", "C6", "D5", "E4", "F3", "G2", "H1"};
		List<String> movements = new ArrayList<String>();
		movements = queen.move();
		Assert.assertTrue(Arrays.asList(expectedPos).containsAll(movements));

	}
	
	@Test
	public void testMoveBoundaryCond2() {
		Queen queen = new Queen("H8");
		String[] expectedPos = {"H7", "H6", "H5", "H4", "H3", "H2", "H1", "G8", "F8", "E8", "D8", "C8", "B8", "A8", "G7", "F6", "E5", "D4", "C3", "B2", "A1"};
		List<String> movements = new ArrayList<String>();
		movements = queen.move();
		Assert.assertTrue(Arrays.asList(expectedPos).containsAll(movements));

	}
	
	@Test
	public void testMoveBoundaryCond3() {
		Queen queen = new Queen("A1");
		String[] expectedPos = {"A2", "A3", "A4", "A5", "A6", "A7", "A8", "B1", "C1", "D1", "E1", "F1", "G1", "H1", "B2", "C3", "D4", "E5", "F6", "G7", "H8"};
		List<String> movements = new ArrayList<String>();
		movements = queen.move();
		Assert.assertTrue(Arrays.asList(expectedPos).containsAll(movements));

	}
	
	@Test
	public void testMoveBoundaryCond4() {
		Queen queen = new Queen("H1");
		String[] expectedPos = {"H2", "H3", "H4", "H5", "H6", "H7", "H8", "G1", "F1", "E1", "D1", "C1", "B1", "A1", "G2", "F3", "E4", "D5", "C6", "B7", "A8"};
		List<String> movements = new ArrayList<String>();
		movements = queen.move();
		Assert.assertTrue(Arrays.asList(expectedPos).containsAll(movements));

	}
	
	@Test
	public void testMove() {
		Queen queen = new Queen("D5");
		String[] expectedPos = {"D6", "D7", "D8", "D4", "D3", "D2", "D1", "C5", "B5", "A5", "E5", "F5", "G5", "H5", "C6", "B7", "A8", "E6", "F7", "G8", "C4", "B3", "A2", "E4", "F3", "G2", "H1"};
		List<String> movements = new ArrayList<String>();
		movements = queen.move();
		Assert.assertTrue(Arrays.asList(expectedPos).containsAll(movements));

	}

}
