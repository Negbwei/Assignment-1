public class primenumbertest {
    import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class PrimeCheckerTest {

        // Test cases for the isPrime method
        @Test
        public void testIsPrime() {
            assertFalse(PrimeChecker.isPrime(1), "1 should not be prime");
            assertTrue(PrimeChecker.isPrime(2), "2 should be prime");
            assertTrue(PrimeChecker.isPrime(3), "3 should be prime");
            assertFalse(PrimeChecker.isPrime(4), "4 should not be prime");
            assertTrue(PrimeChecker.isPrime(5), "5 should be prime");
            assertFalse(PrimeChecker.isPrime(16), "16 should not be prime");
            assertTrue(PrimeChecker.isPrime(17), "17 should be prime");
            assertFalse(PrimeChecker.isPrime(18), "18 should not be prime");
            assertTrue(PrimeChecker.isPrime(19), "19 should be prime");
            assertFalse(PrimeChecker.isPrime(25), "25 should not be prime");
        }
    }

}
