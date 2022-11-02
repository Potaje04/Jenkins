package jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculate {

	@Test
	public void Sumtest() {
	Calculate cal = new Calculate();
	assertEquals(10, cal.sum(5, 5));
	}
	
	public void testSubs() {
		Calculate cal = new Calculate();
		assertEquals(10, cal.subs(20, 10));
	}

}
