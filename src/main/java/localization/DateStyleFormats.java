/*
 * FILENAME
 *     DateStyleFormats.java
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

import java.text.DateFormat;
import java.util.Date;

/**
 * <p>
 * The class for purpose of demonstrate use of constants in DateFormat that determines the display style.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class DateStyleFormats
{

    public static void main(String[] args)
    {
        Date now = new Date();
        int[] dateStyleFormats = {DateFormat.SHORT, DateFormat.MEDIUM, DateFormat.LONG, DateFormat.FULL, DateFormat.DEFAULT};
        System.out.println("Today's date in different type are:");
        
        for (int dateStyle : dateStyleFormats)
        {
            DateFormat dateFormat = DateFormat.getDateInstance(dateStyle);
            System.out.println(dateFormat.format(now));
        }
    }

}
