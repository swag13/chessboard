package game.chessboard;

import game.chessboard.chesspiece.Bishop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BishopTest {

	@Before
	public void initChessBoard() {
		ChessBoard.init();
	}
	
	@Test
	public void testMoveBoundaryCond1() {
		Bishop bishop = new Bishop("A8");
		String[] expectedPos = {"B7", "C6", "D5", "E4", "F3", "G2", "H1" };
		List<String> movements = new ArrayList<String>();
		movements = bishop.move();
		Assert.assertTrue(Arrays.asList(expectedPos).containsAll(movements));

	}
	
	@Test
	public void testMoveBoundaryCond2() {
		Bishop bishop = new Bishop("H8");
		String[] expectedPos = {"G7", "F6", "E5", "D4", "C3", "B2", "A1"};
		List<String> movements = new ArrayList<String>();
		movements = bishop.move();
		Assert.assertTrue(Arrays.asList(expectedPos).containsAll(movements));

	}
	
	@Test
	public void testMoveBoundaryCond3() {
		Bishop bishop = new Bishop("A1");
		String[] expectedPos = {"B2", "C3", "D4","E5", "F6", "G7", "H8"};
		List<String> movements = new ArrayList<String>();
		movements = bishop.move();
		Assert.assertTrue(Arrays.asList(expectedPos).containsAll(movements));

	}
	
	@Test
	public void testMoveBoundaryCond4() {
		Bishop bishop = new Bishop("H1");
		String[] expectedPos = {"G2", "F3", "E4", "D5", "C6", "B7", "A8"};
		List<String> movements = new ArrayList<String>();
		movements = bishop.move();
		Assert.assertTrue(Arrays.asList(expectedPos).containsAll(movements));

	}
	
	@Test
	public void testMove() {
		Bishop bishop = new Bishop("D5");
		String[] expectedPos = {"E6", "F7", "G8", "C4", "B3", "A2", "E4", "F3", "G2", "H1", "C6", "B7", "A8"} ;
		List<String> movements = new ArrayList<String>();
		movements = bishop.move();
		Assert.assertTrue(Arrays.asList(expectedPos).containsAll(movements));

	}

}
