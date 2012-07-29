import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import fizzbuzz.FizzBuzz;


public class FizzBuzzTest {
	FizzBuzz fizzbuzz;
	
	@Before
	public void before(){
		fizzbuzz = new FizzBuzz();
	}
	
	@Test
	public void testFizzBuzzReturnsANumber() {
		assertEquals("1", fizzbuzz.getNumber(1));
		assertEquals("2", fizzbuzz.getNumber(2));
	}
	@Test
	public void testFizzBuzzReturnsFizz_when_NumberIsDividableByThree() {
		assertEquals("Fizz", fizzbuzz.getNumber(3));
		assertEquals("Fizz", fizzbuzz.getNumber(6));
	}
	@Test
	public void testFizzBuzzReturnsBuzz_when_NumberIsDividableByFive() {
		assertEquals("Buzz", fizzbuzz.getNumber(5));
		assertEquals("Buzz", fizzbuzz.getNumber(10));
	}
	@Test
	public void testFizzBuzzReturnsFizzBuzz_when_NumberIsDividableByFiveAndThree() {
		assertEquals("FizzBuzz", fizzbuzz.getNumber(15));
		assertEquals("FizzBuzz", fizzbuzz.getNumber(30));
	}
}
