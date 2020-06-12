import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TetrisTest {

	Tetris instance= new Tetris();
	Board board = new Board(instance);
	Shape shape = new Shape();
	
	
	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
		instance = new Tetris();
	}

	@After
	public void tearDown() {
		
	}
	
	@Test
	public void testTetrisMove(){
		System.out.println("testTetrisMove");
		board.tryMove(shape, 6, 21);
		assertTrue(board.tryMove(shape, 6, 21));
	}
	@Test
	public void testTetrisShape() {
		System.out.println("testTetrisShape");
		shape.setShape(Tetrominoes.NoShape);
		
		assertTrue(shape.getShape() == Tetrominoes.NoShape);
		
	}

	
	

}
