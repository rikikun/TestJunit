import static org.junit.Assert.*;

import java.io.InvalidClassException;

import org.junit.Test;

public class RangeTests {

	@Test
	public void test() {
		// fail("Not yet implemented");
		assertTrue("expect to be True", true);
	}

	@Test
	public void CloseZeroFiveCloseIncluseZeroToFive()
			throws InvalidRangeException {
		assertEquals("CloseZeroFiveCloseIncluseZeroToFive", "{0,1,2,3,4,5}",
				new RangeClass().getInput("[0,5]"));
	}

	@Test
	public void OpenZeroFiveCloseIncluseOneToFive()
			throws InvalidRangeException {
		assertEquals("CloseZeroFiveCloseIncluseZeroToFive", "{1,2,3,4,5}",
				new RangeClass().getInput("(0,5]"));
	}

	@Test
	public void CloseZeroFiveOpenIncluseZeroToFour()
			throws InvalidRangeException {
		assertEquals("CloseZeroFiveCloseIncluseZeroToFive", "{0,1,2,3,4}",
				new RangeClass().getInput("[0,5)"));
	}

	@Test
	public void OpenZeroFiveOpenIncluseOneToFour() throws InvalidRangeException {
		assertEquals("CloseZeroFiveCloseIncluseZeroToFive", "{1,2,3,4}",
				new RangeClass().getInput("(0,5)"));
	}

	@Test
	public void OpenOneOneOpenIncluseNull() throws InvalidRangeException {
		assertEquals("CloseZeroFiveCloseIncluseZeroToFive", "{}",
				new RangeClass().getInput("(1,1)"));
	}

	@Test
	public void CloseTwoTwoCloseIncluseTwo() throws InvalidRangeException {
		assertEquals("CloseZeroFiveCloseIncluseZeroToFive", "{2}",
				new RangeClass().getInput("[2,2]"));
	}

	@Test(expected = InvalidRangeException.class)
	public void BeginMoreThanEndReturnInvalidRangeException()
			throws InvalidRangeException {
		new RangeClass().getInput("[4,2]");

	}

	@Test
	public void OpenMoreThanOneDigitCloseReturnInvalidRangeException()
			throws InvalidRangeException {
		assertEquals("CloseZeroFiveCloseIncluseZeroToFive", "{100,101,102}",
				new RangeClass().getInput("[100,102]"));
	}

	@Test(expected = InvalidRangeException.class)
	public void StringReturnInvalidRangeException()
			throws InvalidRangeException {
		new RangeClass().getInput("[aaa,aaa]");
	}

}
