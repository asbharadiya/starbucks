

package starbucks ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StrategyPatternTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StrategyPatternTest
{
    IApp app ;
    
    /**
     * Default constructor for test class StrategyPatternTest
     */
    public StrategyPatternTest()
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
        app = new AppAuthProxy() ;
    }


    @Test
    public void testLandscape()
    {
        // Login to App
        app.touch(1,5) ;
		app.touch(2,5) ;
		app.touch(3,5) ;
		app.touch(1,6) ;
        
        app.execute("A");
        // Put in Landscape Mode   
        app.landscape();
        // Validate App is in Landscape Mode 
        // (replace with correct assert)
        app.execute("B");
        assertEquals("MyCards", app.screen());
    }

    @Test
    public void testPortrait()
    {
        // Login to App
        app.touch(1,5) ;
		app.touch(2,5) ;
		app.touch(3,5) ;
		app.touch(1,6) ;
        
        app.execute("A");
        // Put in Portrait Mode   
        app.potrait();
        // Validate App is in Landscape Mode 
        // (replace with correct assert)
        app.execute("B");
        assertEquals("Payments", app.screen());       
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
