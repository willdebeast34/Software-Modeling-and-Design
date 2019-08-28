import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FinderTest {

    @Test
    public void testMaxArray(){
        int[] arrTest = new int[]{1, 2, 3, 4};
        int test = Finder.findMax(arrTest);
        int actual = 4;
        assertEquals(actual, test);
    }
    @Test
    public void testMinArray(){
        int[] arrTest = new int[]{1, 2, 3, 4};
        int test = Finder.findMin(arrTest);
        int actual = 1;
        assertEquals(actual, test);
    }
    @Test
    public void testEmptyArray(){
        int[] arrTest = new int[]{0};
        int testMax = Finder.findMax(arrTest);
        int actual = 0;
        assertEquals(actual, testMax);
        int testMin = Finder.findMin(arrTest);
        assertEquals(actual, testMin);

    }
    @Test
    public void testNullArrayForFindMax(){
        assertEquals(Finder.findMax(null), null);
    }
    @Test
    public void testNullArrayForFindMin(){
        assertEquals(Finder.findMin(null), null);
    }
}