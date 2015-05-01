/*
 * FILENAME
 *     BoxPrinter.java
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

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class BoxPrinter<T>
{
    private T val;

    public BoxPrinter(T val)
    {
        super();
        this.val = val;
    }
    
    /**
     * {@inheritDoc}
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "[" + this.val + "]";
    }
    
    /**
     * <p>
     * Getter for val.
     * </p>
     * 
     * @return the val
     */
    public T getVal()
    {
        return val;
    }

    /**
     * <p>
     * Setting value for val.
     * </p>
     * 
     * @param val the val to set
     */
    public void setVal(T val)
    {
        this.val = val;
    }
}
