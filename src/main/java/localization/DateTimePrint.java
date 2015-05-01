/*
 * FILENAME
 *     DateTimePrint.java
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
import java.util.Locale;

/**
 * <p>
 * The class for purpose of demonstrate the use of DateFormat class to get date, time or date with time.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class DateTimePrint
{

    public static void main(String[] args)
    {
        Date now = new Date();
        Locale[] locales = {Locale.CANADA, Locale.FRANCE, Locale.GERMANY, Locale.ITALY};
        
        // print the header first
        System.out.printf("%5s \t %10s \t %10s \t %10s %n", "Locale", "Date", "Time", "Date with Time");
        
        // print date, time, date with time for each locale
        for (Locale locale : locales)
        {
            DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, locale);
            DateFormat timeFormat = DateFormat.getTimeInstance(DateFormat.SHORT, locale);
            DateFormat dateTimeFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL,locale);
            
            System.out.printf("%5s \t %10s \t %10s \t %10s %n", locale, dateFormat.format(now), timeFormat.format(now), dateTimeFormat.format(now));
            
        }
    }

}
