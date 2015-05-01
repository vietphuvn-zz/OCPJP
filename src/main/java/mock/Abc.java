/*
 * FILENAME
 *     Abc.java
 *
 * FILE LOCATION
 *     $Source$
 *
 * VERSION
 *     $Id$
 *         @version       $Revision$
 *         Check-Out Tag: $Name$
 *         Locked By:     $Lockers$
 *
 * FORMATTING NOTES
 *     * Lines should be limited to 78 characters.
 *     * Files should contain no tabs.
 *     * Indent code using four-character increments.
 *
 * COPYRIGHT
 *     Copyright (C) 2005 vietsoftware international Inc. All rights reserved.
 *     This software is the confidential and proprietary information of
 *     VSII ("Confidential Information"). You shall not
 *     disclose such Confidential Information and shall use it only in
 *     accordance with the terms of the license agreement you entered into
 *     with VSII.
 */

package mock;

//
// IMPORTS
// NOTE: Import specific classes without using wildcards.
//

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author dungtt
 **/

interface AIF {
    public void load();
}

abstract class ABS
{
    public abstract void load();
}

public class Abc extends ABS implements AIF
{
    
    /**
     * {@inheritDoc}
     *
     * @see mock.ABS#load()
     */
    @Override
    public void load()
    {
        // TODO Auto-generated method stub
        
    }

    public static void print() throws NullPointerException 
    {
        System.out.println("abc");
    }
    
    public static void main(String[] args)
    {
        try
        {
            
        } finally {
            
        }
    }

}

class Line { 
    public static class Point { } 
    } 
    
    class Triangle { 
        Line.Point lp = new Line.Point();
    } 
