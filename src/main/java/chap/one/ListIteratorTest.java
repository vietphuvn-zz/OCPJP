/*
 * FILENAME
 *     ListIteratorTest.java
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

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class ListIteratorTest
{

    public static void main(String[] args)
    {
        String palStr = "abcba";
        List<Character> palindrome = new LinkedList<Character>();
        
        for (char ch : palStr.toCharArray()) {
            palindrome.add(ch);
        }
        
        System.out.println("Input string is: " + palindrome);
        
        ListIterator<Character> iterator = palindrome.listIterator();
        ListIterator<Character> revIterator = palindrome.listIterator(palindrome.size());
        
        boolean result = true;
        char reIteratorPrev;
        char iteratorNext;
        
        while (revIterator.hasPrevious() && iterator.hasNext()) 
        {
            reIteratorPrev = revIterator.previous();
            iteratorNext = iterator.next();
            
            System.out.println("revIterator.previous() = " + reIteratorPrev);
            System.out.println("iterator.next() = " + iteratorNext);
            
            if (iteratorNext != reIteratorPrev)
            {
                result = false;
                break;
            }
        }
        
        if (result)
        {
            System.out.println("input string is palindrome");
        } else 
        {
            System.out.println("input string is palindrome");
        }
        
        System.out.println("++++++++++++++++++++");
        iterator = palindrome.listIterator();
        revIterator = palindrome.listIterator();
        result = false;
        
        while (revIterator.hasPrevious() && iterator.hasNext()) 
        {
            reIteratorPrev = revIterator.previous();
            iteratorNext = iterator.next();
            
            System.out.println("revIterator.next() = " + reIteratorPrev);
            System.out.println("iterator.next() = " + iteratorNext);
            
            if (iteratorNext == reIteratorPrev)
            {
                result = true;
                break;
            }
        }
        
        System.out.println(7 >> 1);
    }

}
