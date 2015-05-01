/*
 * FILENAME
 *     TestSimpleVNO.java
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
public class TestSimpleVNO
{

    public static void main(String[] args)
    {
        SimpleVNO spl1 = new SimpleVNO(1, 2, 3);
        SimpleVNO spl2 = new SimpleVNO(1, 2, 3);
        SimpleVNO spl3 = spl1;
        System.out.println(spl1.equals(spl2));
        System.out.println(spl1.equals(spl3));
        
        System.out.println(spl1.hashCode());
        System.out.println(spl2.hashCode());
    }

}
