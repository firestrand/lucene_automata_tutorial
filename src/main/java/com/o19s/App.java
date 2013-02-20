package com.o19s;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AutomatonSet set = new AutomatonSet();
        for (int i = Integer.MAX_VALUE; i != 0; --i) {
        	String s = Integer.toHexString(i);
        	set.add(s);
        	if (i % 1000 == 0) {
        		System.out.format("Writing %d Size %s/%s\r", i, set.numNodes(), set.numTransitions());
        		
        	}
        }
    }
}
