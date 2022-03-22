import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	GradeBook g1, g2;
	
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(54);
		g1.addScore(13);
		g2.addScore(71);
		g2.addScore(203);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue("54.0 13.0 ".equals(g1.toString()));
		assertTrue("71.0 203.0 ".equals(g2.toString()));
	}
	
	@Test
	void testScoreSize() {
		assertTrue(2 == g1.getScoreSize());
		assertEquals(2, g2.getScoreSize());
	}
	
	@Test
	void testSum() {
		assertTrue(67 == g1.sum());
		assertEquals(274, g2.sum());
	}
	
	@Test
	void testMinimum() {
		assertTrue(13 == g1.minimum());
		assertEquals(71, g2.minimum());
	}
	
	@Test
	void testFinalScore() {
		assertTrue(54 == g1.finalScore());
		assertEquals(203, g2.finalScore());
	}

}
