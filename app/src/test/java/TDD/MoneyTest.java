package TDD;

import org.junit.Test;
import static org.junit.Assert.*;

public class MoneyTest {

	@Test public void testDollarMultiplication() {
		assertEquals(Money.dollar(10), Money.dollar(5).times(2));
		assertEquals(Money.dollar(15), Money.dollar(5).times(3));
	}

	@Test public void testFrancMultiplication() {
		assertEquals(Money.franc(10), Money.franc(5).times(2));
		assertEquals(Money.franc(15), Money.franc(5).times(3));
	}

	@Test public void testDollarEquality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
	}

	@Test public void testFrancEquality() {
		assertTrue(Money.franc(5).equals(Money.franc(5)));
		assertFalse(Money.franc(5).equals(Money.franc(6)));
	}

	@Test public void testMixedEquality() {
		assertFalse(Money.dollar(5).equals(Money.franc(5)));
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}
	
	@Test public void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}
	
}
