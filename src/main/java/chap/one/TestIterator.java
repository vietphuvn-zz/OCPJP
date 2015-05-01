/*
 * FILENAME
 *     TestIterator.java
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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class TestIterator
{

    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < 11; i++)
        {
            list.add(i);
        }
        
        System.out.println("Original list: " + list);
        
        Iterator<Integer> it = list.iterator();
        
        while (it.hasNext())
        {
            it.next();
            it.remove();
        }
        
        System.out.println("Finall list after removing all elements: " + list);
    }

}
