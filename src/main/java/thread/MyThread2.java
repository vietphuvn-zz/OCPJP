/*
 * FILENAME
 *     MyThread2.java
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
public class MyThread2 implements Runnable
{

    @Override
    public void run()
    {
        try
        {
            Thread.sleep(1500);
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }
        
        System.out.println("current runnable is: " + Thread.currentThread().getName());
    }

    public static void main(String[] args)
    {
        Thread t2 = new Thread(new MyThread2());
        t2.setPriority(10);
        System.out.println("thread info: " + t2);
        // t2.run(); // if you call run() method directly, it simply executes as part of the calling thread
        
        t2.start();
        System.out.println("In main method, thread's name is: " + Thread.currentThread().getName());
    }
}
