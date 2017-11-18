package starbucks ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KeyPadPressTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KeyPadPressTest
{
    KeyPad kp ;
    
    /**
     * Default constructor for test class KeyPadPressTest
     */
    public KeyPadPressTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        kp = new KeyPad() ;
    }


    @Test
    public void testOne()
    {
        kp.touch(1, 5);
        assertEquals(kp.lastKey(), "1");
    }

   @Test
    public void testTwo()
    {
        kp.touch(2, 5);
        assertEquals(kp.lastKey(), "2");
    }

   @Test
    public void testThree()
    {
        kp.touch(3, 5);
        assertEquals(kp.lastKey(), "3");
    }

   @Test
    public void testFour()
    {
        kp.touch(1, 6);
        assertEquals(kp.lastKey(), "4");
    }

   @Test
    public void testFive()
    {
        kp.touch(2, 6);
        assertEquals(kp.lastKey(), "5");
    }

   @Test
    public void testSix()
    {
        kp.touch(3, 6);
        assertEquals(kp.lastKey(), "6");
    }

   @Test
    public void testSeven()
    {
        kp.touch(1, 7);
        assertEquals(kp.lastKey(), "7");
    }

   @Test
    public void testEight()
    {
        kp.touch(2, 7);
        assertEquals(kp.lastKey(), "8");
    }

   @Test
    public void testNine()
    {
        kp.touch(3, 7);
        assertEquals(kp.lastKey(), "9");
    }

   @Test
    public void testZero()
    {
        kp.touch(2, 8);
        assertEquals(kp.lastKey(), "0");
    }

   @Test
    public void testBackspace()
    {
        kp.touch(3, 8);
        assertEquals(kp.lastKey(), "X");
    }

   @Test
    public void testNoKey()
    {
        kp.touch(1, 8);
        assertEquals(kp.lastKey(), " ");
    }


    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
