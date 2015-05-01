/*
 * FILENAME
 *     TestUsableVNO.java
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

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class TestUsableVNO
{

    public static void main(String[] args)
    {
        // Three individual version numbers.
        UsableVNO latest = new UsableVNO(9, 1, 1); // (1)
        UsableVNO inShops = new UsableVNO(9, 1, 1); // (2)
        UsableVNO older = new UsableVNO(6, 6, 6); // (3)
        // An array of version numbers.
        UsableVNO[] versions = new UsableVNO[] { // (4)
                new UsableVNO(3, 49, 1),
                new UsableVNO(8, 19, 81),
                new UsableVNO(2, 48, 28),
                new UsableVNO(10, 23, 78),
                new UsableVNO(9, 1, 1)
            };
        // An array with number of downloads.
        Integer[] downloads = {
            245, 786, 54, 1010, 123
        }; // (5)
        TestCaseVNO.test(latest, inShops, older, versions, downloads); // (6)
    }

}
