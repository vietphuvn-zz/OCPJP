/*
 * FILENAME
 *     UsableVNO.java
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
public class UsableVNO
{
    private int release;
    private int revision;
    private int patch;

    public UsableVNO(int release, int revision, int patch)
    {
        this.release = release;
        this.revision = revision;
        this.patch = patch;
    }

    public String toString()
    {
        return "(" + release + "." + revision + "." + patch + ")";
    }

    public boolean equals(Object obj)
    { // (1)
        if (obj == this) // (2)
            return true;
        if (!(obj instanceof UsableVNO)) // (3)
            return false;
        UsableVNO vno = (UsableVNO) obj; // (4)
        return vno.patch == this.patch && // (5)
            vno.revision == this.revision && vno.release == this.release;
    }
}
