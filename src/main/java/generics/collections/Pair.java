/*
 * FILENAME
 *     Pair.java
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
public class Pair<T1, T2>
{
    T1 object1;
    T2 object2;

    public Pair(T1 object1, T2 object2)
    {
        super();
        this.object1 = object1;
        this.object2 = object2;
    }

    /**
     * <p>
     * Getter for object1.
     * </p>
     * 
     * @return the object1
     */
    public T1 getObject1()
    {
        return object1;
    }

    /**
     * <p>
     * Setting value for object1.
     * </p>
     * 
     * @param object1
     *            the object1 to set
     */
    public void setObject1(T1 object1)
    {
        this.object1 = object1;
    }

    /**
     * <p>
     * Getter for object2.
     * </p>
     * 
     * @return the object2
     */
    public T2 getObject2()
    {
        return object2;
    }

    /**
     * <p>
     * Setting value for object2.
     * </p>
     * 
     * @param object2
     *            the object2 to set
     */
    public void setObject2(T2 object2)
    {
        this.object2 = object2;
    }
}
