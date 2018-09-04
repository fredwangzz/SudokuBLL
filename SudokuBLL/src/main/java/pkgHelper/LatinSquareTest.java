package pkgHelper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LatinSquareTest {

	@Test
    public void hasDuplicates_test1() {
		
		int [] arr= {1,2,3,4,5};
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
		
	}
	
	@Test
    public void hasDuplicates_test2() {
		
		int [] arr= {1,2,2,1,5};
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasDuplicates(arr));
		
	}

}
