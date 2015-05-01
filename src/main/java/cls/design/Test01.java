/*
 * FILENAME
 *     Test01.java
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

import java.io.IOException;


/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class Test01
{
    StringBuffer sb = new StringBuffer("A");

    public static void main(String[] args)
    {
        AbstractFather af = new AbstractFather()
        {
            
        };
        
        try
        {
            af.readFile("");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
        /*
        TheOuter outer = new TheOuter();
        TheOuter.Inner inner = outer.new Inner();
        */
        
        /*
        TheOuter.Inner inner = new TheOuter().new Inner();
        System.out.println(TheOuter.Inner.store);
        */
        
        /*
        TheFather ancestry = new TheFather();
        ancestry.print();
        */
        
        TheFather father = new TheChild();
        
        /*
        try
        {
            father.print();
        } finally {
            System.out.println("finally...");
        }
        
        
        TheChild child = new TheChild();
        
        try
        {
            child.getFather();
        } catch (Throwable ta){
            
        } finally {
            System.out.println("finally...");
        }
        */
    }

}
