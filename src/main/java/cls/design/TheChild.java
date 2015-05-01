/*
 * FILENAME
 *     TheChild.java
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

import chap.one.Child;
import chap.one.Father;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class TheChild extends TheFather
{
    public static final String id;

    static
    {
        System.out.println("static block in Child");
        id = "131F";
    }

    public TheChild()
    {
        System.out.println("Child constructor");
    }
    
    public TheChild(String st)
    {
        System.out.println("Child constructor");
    }
    
    {
        System.out.println("initial block in Child");
    }
    
    public void print()  throws IllegalStateException {
        System.out.println("print() from child");
    }
    
    /**
     * {@inheritDoc}
     *
     * @see cls.design.TheFather#getFather()
     */
    @Override
    public Father getFather() throws Throwable
    {
        System.out.println("getFather from the child");
        return new Child();
    }


    protected void print(String t)  throws Exception {
       System.out.println("print(String) from child"); 
    }
}
