import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class RangeTests {
	RangeClass rangeClass;

	@Before
	public void setInitial() {
		rangeClass = new RangeClass();
	}

	@Test
	public void test() {
		// fail("Not yet implemented");
		assertTrue("expect to be True", true);
	}

	@Test
	public void closeZeroFiveCloseIncluseZeroToFive()
			throws InvalidRangeException {
		assertEquals("CloseZeroFiveCloseIncluseZeroToFive", "{0,1,2,3,4,5}",
				rangeClass.getInput("[0,5]"));
	}

	@Test
	public void openZeroFiveCloseIncluseOneToFive()
			throws InvalidRangeException {
		assertEquals("CloseZeroFiveCloseIncluseZeroToFive", "{1,2,3,4,5}",
				rangeClass.getInput("(0,5]"));
	}

	@Test
	public void closeZeroFiveOpenIncluseZeroToFour()
			throws InvalidRangeException {
		assertEquals("CloseZeroFiveCloseIncluseZeroToFive", "{0,1,2,3,4}",
				rangeClass.getInput("[0,5)"));
	}

	@Test
	public void openZeroFiveOpenIncluseOneToFour() throws InvalidRangeException {
		assertEquals("CloseZeroFiveCloseIncluseZeroToFive", "{1,2,3,4}",
				rangeClass.getInput("(0,5)"));
	}

	@Test
	public void openOneOneOpenIncluseNull() throws InvalidRangeException {
		assertEquals("CloseZeroFiveCloseIncluseZeroToFive", "{}",
				rangeClass.getInput("(1,1)"));
	}

	@Test
	public void closeTwoTwoCloseIncluseTwo() throws InvalidRangeException {
		assertEquals("CloseZeroFiveCloseIncluseZeroToFive", "{2}",
				rangeClass.getInput("[2,2]"));
	}

	@Test(expected = InvalidRangeException.class)
	public void beginMoreThanEndReturnInvalidRangeException()
			throws InvalidRangeException {
		rangeClass.getInput("[4,2]");

	}

	@Test
	public void openMoreThanOneDigitCloseReturnInvalidRangeException()
			throws InvalidRangeException {
		assertEquals("CloseZeroFiveCloseIncluseZeroToFive", "{100,101,102}",
				rangeClass.getInput("[100,102]"));
	}

	@Test(expected = InvalidRangeException.class)
	public void stringReturnInvalidRangeException()
			throws InvalidRangeException {
		rangeClass.getInput("[aaa,aaa]");
	}

}
