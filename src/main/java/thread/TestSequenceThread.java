/*
 * FILENAME
 *     TestSequenceThread.java
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
public class TestSequenceThread
{

    public static void main(String[] args)
    {
        System.out.println("Start thread: " + Thread.currentThread().getName());
        Thread t1 = new Thread(new MyRunnable(), "t1");
        Thread t2 = new Thread(new MyRunnable(), "t2");
        
        t1.start();
        
        try
        {
            t1.join();
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }
        
        t2.start();
        
        try
        {
            
            t2.join();
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }
        
        System.out.println("End thread: " + Thread.currentThread().getName());
    }

}
