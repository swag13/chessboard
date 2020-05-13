package game.chessboard;

import game.chessboard.chesspiece.Bishop;
import game.chessboard.chesspiece.Horse;
import game.chessboard.chesspiece.King;
import game.chessboard.chesspiece.Pawn;
import game.chessboard.chesspiece.Queen;
import game.chessboard.chesspiece.Rook;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class DirectionProviderTest {

	@Test
	public void testGetDirectionForKing() {
		DirectionProvider dp = new DirectionProvider();
		Direction[] kingDir = {Direction.UP, Direction.DOWN, Direction.LEFT, Direction.RIGHT, Direction.DIAGONAL_UP_LEFT, Direction.DIAGONAL_UP_RIGHT, Direction.DIAGONAL_DOWN_LEFT, Direction.DIAGONAL_DOWN_RIGHT};
		Assert.assertEquals(Arrays.asList(kingDir), dp.getDirection(new King()));
	}
	
	@Test
	public void testGetDirectionForQueen() {
		DirectionProvider dp = new DirectionProvider();
		Direction[] queenDir = {Direction.UP, Direction.DOWN, Direction.LEFT, Direction.RIGHT, Direction.DIAGONAL_UP_LEFT, Direction.DIAGONAL_UP_RIGHT, Direction.DIAGONAL_DOWN_LEFT, Direction.DIAGONAL_DOWN_RIGHT};
		Assert.assertEquals(Arrays.asList(queenDir), dp.getDirection(new Queen()));
	}
	
	@Test
	public void testGetDirectionForHorse() {
		DirectionProvider dp = new DirectionProvider();
		Direction[] horseDir = {Direction.UP, Direction.DOWN, Direction.LEFT, Direction.RIGHT};
		Assert.assertEquals(Arrays.asList(horseDir), dp.getDirection(new Horse()));
	}
	
	@Test
	public void testGetDirectionForBishop() {
		DirectionProvider dp = new DirectionProvider();
		Direction[] bishopDir = {Direction.DIAGONAL_UP_LEFT, Direction.DIAGONAL_UP_RIGHT, Direction.DIAGONAL_DOWN_LEFT, Direction.DIAGONAL_DOWN_RIGHT};
		Assert.assertEquals(Arrays.asList(bishopDir), dp.getDirection(new Bishop()));
	}
	
	@Test
	public void testGetDirectionForRook() {
		DirectionProvider dp = new DirectionProvider();
		Direction[] rookDir = {Direction.UP, Direction.DOWN, Direction.LEFT, Direction.RIGHT};
		Assert.assertEquals(Arrays.asList(rookDir), dp.getDirection(new Rook()));
	}
	
	@Test
	public void testGetDirectionForPawn() {
		DirectionProvider dp = new DirectionProvider();
		Direction[] pawnDir = {Direction.UP, Direction.DIAGONAL_UP_LEFT, Direction.DIAGONAL_UP_RIGHT};
		Assert.assertEquals(Arrays.asList(pawnDir), dp.getDirection(new Pawn()));
	}

}
