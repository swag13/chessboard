package game.chessboard;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChessBoardTest {

	@Before
	public void init() {
		ChessBoard.init();
	}
	
	@Test
	public void testPosition() {
		String[][] board = ChessBoard.chessBoard;
		for (int i=7; i>=0;i--) {
			for (int j=0; j<8;j++) {
				System.out.print(board[j][i]+" ");
			}
			System.out.println();
		}
		Assert.assertNotNull(board);
	}

}
