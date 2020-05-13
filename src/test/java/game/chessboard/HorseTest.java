package game.chessboard;

import game.chessboard.chesspiece.Horse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HorseTest {

	@Before
	public void initChessBoard() {
		ChessBoard.init();
	}
	
	@Test
	public void testMoveBoundaryCond1() {
		Horse horse = new Horse("A8");
		String[] expectedPos = {"C7", "B6"};
		List<String> movements = new ArrayList<String>();
		movements = horse.move();
		Assert.assertTrue(movements.containsAll(Arrays.asList(expectedPos)));

	}
	
	@Test
	public void testMoveBoundaryCond2() {
		Horse horse = new Horse("H8");
		String[] expectedPos = {"F7", "G6"};
		List<String> movements = new ArrayList<String>();
		movements = horse.move();
		Assert.assertTrue(movements.containsAll(Arrays.asList(expectedPos)));

	}
	
	@Test
	public void testMoveBoundaryCond3() {
		Horse horse = new Horse("A1");
		String[] expectedPos = {"B3", "C2"};
		List<String> movements = new ArrayList<String>();
		movements = horse.move();
		Assert.assertTrue(movements.containsAll(Arrays.asList(expectedPos)));

	}
	
	@Test
	public void testMoveBoundaryCond4() {
		Horse horse = new Horse("H1");
		String[] expectedPos = {"G3", "F2"};
		List<String> movements = new ArrayList<String>();
		movements = horse.move();
		Assert.assertTrue(movements.containsAll(Arrays.asList(expectedPos)));

	}
	
	@Test
	public void testMove() {
		Horse horse = new Horse("E3");
		String[] expectedPos = {"F5", "G4", "G2", "F1", "D1", "C2", "C4", "D5"};
		List<String> movements = new ArrayList<String>();
		movements = horse.move();
		Assert.assertTrue(movements.containsAll(Arrays.asList(expectedPos)));

	}

}
