/*
 * FILENAME
 *     RawTest.java
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

package generics.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class RawTest
{

    public static void main(String[] args)
    {
        List<String>  list1 = new LinkedList<>();
        list1.add("A");
        list1.add("B");
        List list2 = list1;
        list2.add(10);
        
        for (Iterator<String> it = list2.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }

}
