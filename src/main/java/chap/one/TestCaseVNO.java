/*
 * FILENAME
 *     TestCaseVNO.java
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

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class TestCaseVNO
{
    /** Type parameter N represents a class implementing a version number. */
    public static <N> void test( // (1)
        N latest, // (2a)
        N inShops, // (2b)
        N older, // (2c)
        N[] versions, // (3)
        Integer[] downloads)
    { // (4)
        // Print the class name.
        System.out.println(latest.getClass()); // (5)
        // Various tests.
        System.out.println("Test object reference and value equality:");
        System.out.printf(" latest: %s, inShops: %s, older: %s%n", latest, inShops, older);
        System.out.println(" latest == inShops: " + (latest == inShops)); // (6)
        System.out.println(" latest.equals(inShops): " + (latest.equals(inShops))); // (7)
        System.out.println(" latest == older: " + (latest == older)); // (8)
        System.out.println(" latest.equals(older): " + latest.equals(older));// (9)
        N searchKey = inShops; // (10)
        boolean found = false;
        for (N version : versions)
        {
            found = searchKey.equals(version); // (11)
            if (found)
                break;
        }
        System.out.println("Array: " + Arrays.toString(versions)); // (12)
        System.out.println(" Search key " + searchKey + " found in array: " + found); // (13)
        List<N> vnoList = Arrays.asList(versions); // (14)
        System.out.println("List: " + vnoList);
        System.out.println(" Search key " + searchKey + " contained in list: " + vnoList.contains(searchKey)); // (15)
        Map<N, Integer> versionStatistics = new HashMap<N, Integer>(); // (16)
        for (int i = 0; i < versions.length; i++)
            // (17)
            versionStatistics.put(versions[i], downloads[i]);
        System.out.println("Map: " + versionStatistics); // (18)
        System.out.println(" Hash code for keys in the map:");
        for (N version : versions)
            // (19)
            System.out.printf(" %10s: %s%n", version, version.hashCode());
        System.out.println(" Search key " + searchKey + " has hash code: " + searchKey.hashCode()); // (20)
        System.out.println(" Map contains search key " + searchKey + ": " + versionStatistics.containsKey(searchKey)); // (21)
        System.out.println("Sorted set:\n " + (new TreeSet<N>(vnoList))); // (22)
        System.out.println("Sorted map:\n " + (new TreeMap<N, Integer>(versionStatistics))); // (23)
        System.out.println("List before sorting: " + vnoList);
        Collections.sort(vnoList, null); // (24)
        System.out.println("List after sorting: " + vnoList);
        int resultIndex = Collections.binarySearch(vnoList, searchKey, null);// (25)
        System.out.println("Binary search in list found key " + searchKey + " at index: " + resultIndex);
        
    }
}
