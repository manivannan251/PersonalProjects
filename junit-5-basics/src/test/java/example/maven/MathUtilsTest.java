package example.maven;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When running Math Utils")
class MathUtilsTest {
	
	MathUtils mathUtils;
	
	TestInfo testInfo;
	
	TestReporter testReporter;
	
	@BeforeEach
	void init(TestInfo testInfo,TestReporter testReporter) {
		this.testInfo = testInfo;
		this.testReporter = testReporter;
		testReporter.publishEntry("Running "+testInfo.getDisplayName()+" with tags "+testInfo.getTags());
		mathUtils = new MathUtils();
		
	}
	
	@BeforeAll
	static void beforeAll() {
		//System.out.println("Before All");
	}
	
	@AfterEach
	void cleanUp() {
		//System.out.println("Cleaning up...");
	}
	
	@Nested
	@DisplayName("Testing add method")
	@Tag("Math")
	class AddTest{
		@Test
		@DisplayName("Test for Positive numbers")
		void testAddPositive() {		
			int expected = 2;
			int actual = mathUtils.add(1, 1);
			assertEquals(expected, actual,"add method should add two numbers");
		}
		
		@Test
		@DisplayName("Test for Negative numbers")
		void testAddNegative() {
			int expected = -1;
			int actual = mathUtils.add(-3, 2);
			assertEquals(-1, actual,()->"expected is "+expected+" but got "+actual);
		}
	}
	
	
	
	@Test
	@Tag("Circle")
	void testcomputeCircleArea() {			
		boolean cond = false;
		assumeTrue(cond);
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10),"Circle should compute radius");
	}
	
	@Test
	@EnabledOnOs(OS.MAC)
	void testDivide() {		
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0),"Should throw Arithmetic exception");
	}
	
	@Test
	@Tag("Math")
	void testMultiply() {
		
		assertAll(
				() -> assertEquals(4, mathUtils.multiply(2, 2)),
				() -> assertEquals(6, mathUtils.multiply(2, 3)),
				() -> assertEquals(8, mathUtils.multiply(4, 2)),
				() -> assertEquals(9, mathUtils.multiply(3, 3))
				);
		
		
	}
	
	@Test
	@DisplayName("Work in progress")
	@Disabled
	void TestDisabled() {
		fail("Work is still in progress");
	}
	
	@RepeatedTest(3)
	void testRepeatedTest(RepetitionInfo repInfo) {
		System.out.println(repInfo.getCurrentRepetition());
		assertEquals(40, mathUtils.add(20, 20));
	}

}
