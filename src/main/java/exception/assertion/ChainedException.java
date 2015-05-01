/*
 * FILENAME
 *     ChainedException.java
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

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class ChainedException
{
    public static void foo()
    {
        try
        {
            String[] foo = {
                "ABC"
            };
            String st = foo[10];
            System.out.println(st);
        }
        catch (ArrayIndexOutOfBoundsException aiobe)
        {
            IllegalStateException ise = new IllegalStateException(aiobe);
            
            RuntimeException re = new RuntimeException(ise);

            // re.initCause(new IllegalStateException());

            throw re;
        }
    }

    public static void main(String[] args)
    {
        try
        {
            foo();
        }
        catch (Exception e)
        {
            System.out.println("The caught exception in main is: " + e.getClass());
            System.out.println("The cause of exception is: " + e.getCause());
            e.printStackTrace();
        }
    }

}
