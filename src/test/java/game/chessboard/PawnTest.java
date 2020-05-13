package game.chessboard;

import game.chessboard.chesspiece.Pawn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PawnTest {

	@Before
	public void initChessBoard() {
		ChessBoard.init();
	}
	
	@Test
	public void testMoveBoundaryCond1() {
		Pawn pawn = new Pawn("A8");
		String[] expectedPos = {"A7", "B8", "B7"};
		List<String> movements = new ArrayList<String>();
		movements = pawn.move();
		Assert.assertTrue(Arrays.asList(expectedPos).containsAll(movements));

	}
	
	@Test
	public void testMoveBoundaryCond2() {
		Pawn pawn = new Pawn("H8");
		String[] expectedPos = {"G7", "G8", "H7"};
		List<String> movements = new ArrayList<String>();
		movements = pawn.move();
		Assert.assertTrue(Arrays.asList(expectedPos).containsAll(movements));

	}
	
	@Test
	public void testMoveBoundaryCond3() {
		Pawn pawn = new Pawn("A1");
		String[] expectedPos = {"A2", "B2", "B1"};
		List<String> movements = new ArrayList<String>();
		movements = pawn.move();
		Assert.assertTrue(Arrays.asList(expectedPos).containsAll(movements));

	}
	
	@Test
	public void testMoveBoundaryCond4() {
		Pawn pawn = new Pawn("H1");
		String[] expectedPos = {"H2", "G2", "G1"};
		List<String> movements = new ArrayList<String>();
		movements = pawn.move();
		Assert.assertTrue(Arrays.asList(expectedPos).containsAll(movements));

	}
	
	@Test
	public void testMove() {
		Pawn pawn = new Pawn("D5");
		String[] expectedPos = {"D6", "E6", "E5", "E4", "D4", "C4", "C5", "C6"};
		List<String> movements = new ArrayList<String>();
		movements = pawn.move();
		Assert.assertTrue(Arrays.asList(expectedPos).containsAll(movements));

	}

}
