/*
 * FILENAME
 *     ResBundle_it_IT.java
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

package localization;

import java.util.ListResourceBundle;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class ResBundle_it_IT extends ListResourceBundle
{
    @Override
    protected Object[][] getContents()
    {
        return contents;
    }

    static final Object[][] contents = {
        { "MovieName", "Che Bella Giornata" },
        { "GrossRevenue", (Long) 43000000L }, // in euros
        { "Year", (Integer)2011 }
    };
}
