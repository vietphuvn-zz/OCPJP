/*
 * FILENAME
 *     TimeBomb.java
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

package thread;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class TimeBomb extends Thread
{
    String [] timeStr = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
    
    public void run()
    {
        for (int i = 0; i < timeStr.length; i++)
        {
            try
            {
                System.out.println(timeStr[i]);
                sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args)
    {
        TimeBomb thead = new TimeBomb();
        System.out.println("Starting 10 second count down. . . ");
        thead.start();
        
        try
        {
            thead.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        
        System.out.println("Boom!!!");
    }
}
