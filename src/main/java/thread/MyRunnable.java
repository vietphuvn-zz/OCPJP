/*
 * FILENAME
 *     MyRunnable.java
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
public class MyRunnable implements Runnable
{

    @Override
    public void run()
    {
        System.out.println("start thead: " + Thread.currentThread().getName());

        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }
        System.out.println("end thead: " + Thread.currentThread().getName());
    }

}
