/*
 * FILENAME
 *     UseCounter.java
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
public class UseCounter implements Runnable
{
    public synchronized void increment()
    {
        // increments the counter and prints the value
        // of the counter shared between threads
        Counter.count++;
        System.out.println(Thread.currentThread().getName() + ": increase: " + Counter.count);
    }
    
    public void decrement() {
        synchronized (this) {
            Counter.count--;
            System.out.println(Thread.currentThread().getName() + ": decrease: " + Counter.count);
        }
    }
    
    @Override
    public void run()
    {
        increment();
        decrement();
        /*increment();
        increment();*/
    }
}
