/*
 * FILENAME
 *     DatePrint.java
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
 * The class for purpose of demonstrate the use of DateFormat class to format the date and print it.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class DatePrint
{

    public static void main(String[] args)
    {
        // the default constructor for the Date set the date/time for current date/time
        Date date = new Date();
        Locale[] locales = {Locale.CANADA, Locale.FRANCE, Locale.GERMANY, Locale.ITALY};
        
        for (Locale locale : locales)
        {
            DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
            System.out.printf("Date in locale %s is %s %n", locale, dateFormat.format(date));
        }
    }

}
