/*
 * FILENAME
 *     TheOuter.java
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

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
class TheOuter
{
    int count;

    private static class StaticInner
    {
        int age;

        public int getAge()
        {
            return age;
        }

        static void print()
        {

        }
    }

    {
        class LocalInnerCl
        {

        }
    }

    static
    {
        abstract class LocalInnerCl
        {

        }
    }

    class Inner
    {
        static final int store = 1;
    }

    abstract class InnerAbs
    {
        abstract void printLocalName();
    }

    public InnerAbs printSth()
    {
        final String hname = "B";

        class LocalInners extends InnerAbs
        {
            public void printLocalName()
            {
                System.out.println(hname);
            }
        }

        return new LocalInners();
    }

    public static void main(String[] args)
    {
        TheOuter.StaticInner inner = new TheOuter.StaticInner();
        StaticInner inner1 = new StaticInner();

        System.out.println(inner.age);
        System.out.println(inner1.age);
        
        TheOuter.InnerAbs innerAbs = new TheOuter().printSth();
        innerAbs.printLocalName();
    }
}
