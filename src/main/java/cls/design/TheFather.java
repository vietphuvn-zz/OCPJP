/*
 * FILENAME
 *     TheFather.java
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

package cls.design;

import chap.one.Father;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class TheFather
{
    public static final String id;

    static
    {
        System.out.println("static block in Father");
        id = "13F";
    }

    public TheFather()
    {
        System.out.println("Father constructor");
    }

    public TheFather(String st)
    {
        System.out.println("Father constructor with String parameter");
    }
    
    {
        System.out.println("initial block in Father");
    }

    public void print() throws RuntimeException
    {
        System.out.println("print() from father");
    }

    public Father getFather() throws Throwable
    {
        System.out.println("getFather from the father");
        return new Father();
    }
}
