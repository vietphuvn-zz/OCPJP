/*
 * FILENAME
 *     Mutex.java
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
public class Mutex
{

    public static void main(String[] args)
    {
        final StackImpl stack = new StackImpl(20);

        (new Thread("Pusher")
        {
            public void run()
            {
                for (;;)
                {
                    System.out.println("Pushed: " + stack.push(2008));
                }
            }
        }).start();

        (new Thread("Poper")
        {
            public void run()
            {
                for (;;)
                {
                    System.out.println("Popped: " + stack.pop());
                }
            }
        }).start();

        System.out.println("Exit from main().");
    }

}
