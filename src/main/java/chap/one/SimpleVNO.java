/*
 * FILENAME
 *     SimpleVNO.java
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

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class SimpleVNO
{
    private int release;
    private int revision;
    private int patch;

    public SimpleVNO(int release, int revision, int patch)
    {
        this.release = release;
        this.revision = revision;
        this.patch = patch;
    }

    public String toString()
    {
        return "(" + release + "." + revision + "." + patch + ")";
    }

    /**
     * {@inheritDoc}
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        
        if (obj == null)
        {
            return false;
        }

        if (obj instanceof SimpleVNO)
        {
            SimpleVNO sv = (SimpleVNO) obj;
            return (this.patch == sv.patch && this.release == sv.release && this.revision == sv.revision);
        }
        
        return false;
    }
}
