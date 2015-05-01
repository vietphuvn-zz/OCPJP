/*
 * FILENAME
 *     Counter.java
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

package chap.nine;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class Counter implements Runnable
{
    private int currentValue;

    public Counter()
    {
        currentValue = 0;
    }

    public int getValue()
    {
        return currentValue;
    }

    @Override
    public void run()
    {
        try
        {
            while (currentValue < 5)
            {
                System.out.println(Thread.currentThread().getName() + ", priority: " + Thread.currentThread().getPriority() + ", current Val: " + currentValue++);
                Thread.sleep(250);
            }
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }
        
        System.out.println("Exit from " + Thread.currentThread().getName());
    }

}
