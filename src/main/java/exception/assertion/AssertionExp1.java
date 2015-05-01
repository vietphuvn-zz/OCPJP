/*
 * FILENAME
 *     AssertionExp1.java
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
public class AssertionExp1
{

    public static void main(String[] args)
    {
        int i = -9;
        
        if (i < 0) 
        {
            i = -i;
        }
        
        System.out.println("the value of i is: " + i);
        
        // at this point the assumption is that i cannot be negative;
        // assert this condition since its an assumption that will always hold
        assert (i < 0) : "the value of i is: " + i;
    }

}
