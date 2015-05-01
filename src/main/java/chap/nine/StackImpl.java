/*
 * FILENAME
 *     StackImpl.java
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

package chap.nine;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class StackImpl
{
    private Object[] stackArray;
    private int topOfStack;

    public StackImpl(int capacity)
    {
        stackArray = new Object[capacity];
        topOfStack = -1;
    }

    //    public boolean push(Object element) // (2a) non-synchronized
    public synchronized boolean push(Object element) // (2b) synchronized
    {

        if (isFull())
            return false;
        ++topOfStack;
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
        } // (3) Sleep a little.
        stackArray[topOfStack] = element;
        return true;
    }

    //    public Object pop() // (4a) non-synchronized
    public synchronized Object pop() // (4b) synchronized
    {
        if (isEmpty())
            return null;
        Object obj = stackArray[topOfStack];
        stackArray[topOfStack] = null;
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
        } // (5) Sleep a little.
        topOfStack--;
        return obj;
    }

    public boolean isEmpty()
    {
        return topOfStack < 0;
    }

    public boolean isFull()
    {
        return topOfStack >= stackArray.length - 1;
    }
}
