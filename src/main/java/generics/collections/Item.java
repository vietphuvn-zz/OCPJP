/*
 * FILENAME
 *     Item.java
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

import java.util.Objects;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class Item implements Comparable<Item>
{
    private String serial;
    private String name;

    public Item()
    {
        super();
    }

    public Item(String serial, String name)
    {
        super();
        this.serial = serial;
        this.name = name;
    }

    /**
     * <p>
     * Getter for serial.
     * </p>
     * 
     * @return the serial
     */
    public String getSerial()
    {
        return serial;
    }

    /**
     * <p>
     * Setting value for serial.
     * </p>
     * 
     * @param serial
     *            the serial to set
     */
    public void setSerial(String serial)
    {
        this.serial = serial;
    }

    /**
     * <p>
     * Getter for name.
     * </p>
     * 
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * <p>
     * Setting value for name.
     * </p>
     * 
     * @param name
     *            the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * {@inheritDoc}
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj)
    {
        System.out.println("reach equals()...");
        System.out.println(this);
        System.out.println(obj);
        
        if (this == obj)
        {
            return true;
        }

        if (obj == null)
        {
            return false;
        }

        if (obj instanceof Item)
        {
            Item it = (Item) obj;

            return (this.serial.equals(it.serial) && this.name.equals(it.name));
        }

        return false;
    }

    /**
     * {@inheritDoc}
     *
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        System.out.println(this);
        return Objects.hash(this.name) ^ Objects.hash(this.serial);
    }

    /**
     * {@inheritDoc}
     *
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Item o)
    {
        System.out.println("reach compareTo()...");
        System.out.println(this);
        System.out.println(o);
        if (this.equals(o)) {
            return 0;
        }
        
        return this.serial.compareTo(o.serial);
    }

    /**
     * {@inheritDoc}
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Item info: [" + this.getSerial() + ", " + this.getName() + "] --> hashCode() = " + (Objects.hash(this.name) ^ Objects.hash(this.serial));
    }
    
    
}
