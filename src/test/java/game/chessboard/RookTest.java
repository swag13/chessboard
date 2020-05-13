package game.chessboard;

import game.chessboard.chesspiece.Rook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RookTest {

	@Before
	public void initChessBoard() {
		ChessBoard.init();
	}
	
	@Test
	public void testMoveBoundaryCond1() {
		Rook rook = new Rook("A8");
		String[] expectedPos = {"A7", "A6", "A5", "A4", "A3", "A2", "A1", "B8", "C8", "D8", "E8", "F8", "G8", "H8"};
		List<String> movements = new ArrayList<String>();
		movements = rook.move();
		Assert.assertTrue(Arrays.asList(expectedPos).containsAll(movements));

	}
	
	@Test
	public void testMoveBoundaryCond2() {
		Rook rook = new Rook("H8");
		String[] expectedPos = {"H7", "H6", "H5","H4", "H3", "H2", "H1","A8", "B8", "C8", "D8", "E8", "F8", "G8" };
		List<String> movements = new ArrayList<String>();
		movements = rook.move();
		Assert.assertTrue(Arrays.asList(expectedPos).containsAll(movements));

	}
	
	@Test
	public void testMoveBoundaryCond3() {
		Rook rook = new Rook("A1");
		String[] expectedPos = {"A2", "A3", "A4", "A5", "A6", "A7", "A8", "B1", "C1", "D1", "E1","F1", "G1", "H1"};
		List<String> movements = new ArrayList<String>();
		movements = rook.move();
		Assert.assertTrue(Arrays.asList(expectedPos).containsAll(movements));

	}
	
	@Test
	public void testMoveBoundaryCond4() {
		Rook rook = new Rook("H1");
		String[] expectedPos = {"A1", "B1", "C1", "D1", "E1","F1", "G1","H8","H7", "H6", "H5","H4", "H3", "H2"};
		List<String> movements = new ArrayList<String>();
		movements = rook.move();
		Assert.assertTrue(Arrays.asList(expectedPos).containsAll(movements));

	}
	
	@Test
	public void testMove() {
		Rook rook = new Rook("D5");
		String[] expectedPos = {"D6", "D7", "D8", "D4", "D3", "D2", "D1", "E5", "F5", "G5", "H5", "C5", "B5", "A5"};
		List<String> movements = new ArrayList<String>();
		movements = rook.move();
		Assert.assertTrue(Arrays.asList(expectedPos).containsAll(movements));

	}

}
