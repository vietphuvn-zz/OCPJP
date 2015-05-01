/*
 * FILENAME
 *     Client.java
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
public class Client
{

    public static void main(String[] args)
    {
        Counter counterA = new Counter();
        Thread worker = new Thread(counterA, "Counter A");
        
        System.out.println(worker.getName());
        
        worker.start();
//        worker.run();
        
        try
        {
            int val;
            
            do
            {
                val = counterA.getValue();
                System.out.println("Counter value read by " + Thread.currentThread().getName() + ", priority: " + Thread.currentThread().getPriority() + ", val = " + val);
                Thread.sleep(500);
            } while (val < 5);
        }
        catch (InterruptedException ie)
        {
            System.out.println("The main thread is interrupted.");
            ie.printStackTrace();
        }
        
        System.out.println("Exist from main method");
    }

}
