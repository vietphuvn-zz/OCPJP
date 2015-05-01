/*
 * FILENAME
 *     SetUtils.java
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

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class SetUtils
{

    public static void main(String[] args)
    {
        Set<String> sets = new HashSet<String>(Arrays.asList("Set", "Map", "List"));
        System.out.println(sets);
        Set<String> copySets = copy(sets);
        System.out.println(copySets);
    }

    public static <T> Set<T> copy(Set<T> sets)
    {
        return new LinkedHashSet<T>(sets);
    }

}
