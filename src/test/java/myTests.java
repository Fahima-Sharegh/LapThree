
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class myTests {

@DisplayName("8 + 1 = 9")
    @Test
    public void testSumOfNumbersWhenPositiveValue() {
        int actual = 8+1;
        Assert.assertEquals(9, actual);

    }

    @Test
    public void testSumOfNumbersWhenNegativeValue() {
        int expected = 2-3;
        int actual = -1;
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testOfNumberWhenPostiveValue() {
        int actual = 9-5;
        Assert.assertEquals(4, actual);

    }
    /*
        @Test
        public void testOfNumbersWhenNegativeValue() {
            int actual = 5*2;
            Assert.assertEquals(-12, actual);

        }
    */
    @Test
    public void testToDivideToNumbers() {
        double actual = 6/2;
        // double expected = 3.0;
        Assert.assertEquals(3.0, actual, 0.0001); // Adding a small delta value


    }

    @DisplayName(" 4* 2 = 8 ")
    @Test
    public void testOfMultiplicationWhenPositiveNumbers() {
        int expected = 4*2;
        int actual = 8;
        Assert.assertEquals(expected,actual);

    }
    }
