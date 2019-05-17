package com.sandipan.convertnumber.convertnumber;

import com.sandipan.convertnumber.exception.NotANumberException;

public class App 
{
	static public Placevalue processor;
    public static void main( String[] args )
    {
    	
    		processor = new Default();
    		long[] values = new long[] {
    	           
    	            0,
    	            2040,
    	            45213,
    	            100000,
    	            10000007,
    	            999999999,
    	            -7834,
    	            -89999
              
    	        };

    	        String[] strValues = new String[] {
    	            "00567.782",
    	            "-7893.3891",
    	            "abc"
    	        };
    	        
    	        for (long val : values) {
    	            
    	        	System.out.println(val + " = " + processor.getName(val) );
    	        }
    	        
    	        for (String strVal : strValues) {
    	           
    	            	try{
    	            		System.out.println(strVal + " = " + processor.getName(strVal) );
    	            		    	            		
    	            	} catch (NumberFormatException ex){
    	            		try {
    	            			throw new NotANumberException(strVal +" = "+"This is not a number");
    	            		} catch (NotANumberException e){
    	            			System.out.println(e.getMessage());
    	            			break;
    	            		}
    	            		
    	            		
    	            	}
    	            
    	        	
    	        }

    	}
    }

