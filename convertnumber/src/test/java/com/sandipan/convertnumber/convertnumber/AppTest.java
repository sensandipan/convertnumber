package com.sandipan.convertnumber.convertnumber;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    
	static public Placevalue processor;
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testTensGetName(){
    	processor = new Tens();
    	assertEquals(processor.getName("50"), "fifty");
    }
    
    public void testUnitsGetName(){
    	processor = new Unit();
    	assertEquals(processor.getName("5"), "five");
    }
    public void testHundredGetName(){
    	processor = new Hundred();
    	assertEquals(processor.getName("450"), "four hundred fifty");
    }
    public void testHigherGetName(){
    	processor = new Higher(3);
    	assertEquals(processor.getName("1000"), "one thousand");
    }
    public void testDefaultGetName(){
    	processor = new Default();
    	assertEquals(processor.getName("2.5"), "two and five tenth");
    }
    
}
