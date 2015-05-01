/*
 * FILENAME
 *     QueueTest.java
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

package chap.one;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class QueueTest
{

    public static void main(String[] args)
    {
        Queue<String> loginSequence = new LinkedList<String>();
        
        loginSequence.add("Harrison");
        loginSequence.add("McCartney");
        loginSequence.add("Starr");
        loginSequence.add("Lennon");
        
        System.out.println("The login sequence is: " + loginSequence);
        
        while (!loginSequence.isEmpty())
        {
            System.out.println("Removing " + loginSequence.remove());
        }
        
        Deque<String> deque = new LinkedList<String>();
    }

}
