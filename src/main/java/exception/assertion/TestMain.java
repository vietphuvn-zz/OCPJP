/*
 * FILENAME
 *     TestMain.java
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

package exception.assertion;

import java.io.IOException;


/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class TestMain
{
    transient int age;
    
    {
        
    }
    
    public TestMain() throws IOException
    {
        super();
    }

    public static int getFoo(String st)
    {
        int rt = 1;
        
        try
        {
            return Integer.parseInt(st);
            
        }
        catch (NumberFormatException nfe)
        {
            return rt;
        }
        finally
        {
            rt = 8;
            //return rt;
        }
    }
    
    public static void foo() throws Exception
    {
        try
        {
            Integer.parseInt("eight");
        }
        catch (NumberFormatException e)
        {
            throw e;
        }
    }
    
    public static void main(String[] args)
    {
        System.out.println(getFoo("100"));
        
        try
        {
            foo();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

}
