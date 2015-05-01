/*
 * FILENAME
 *     FormatNumber.java
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

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * <p>
 * The class to demonstrate how to format or parse numbers for a particular locale.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class FormatNumber
{

    public static void main(String[] args)
    {
        long tenMillion = 10_000L;
        // first print ten million in German locale
        NumberFormat germanFormat = NumberFormat.getInstance(Locale.GERMANY);
        String localizedTenMillon = germanFormat.format(tenMillion);
        System.out.println("Ten million in German locale is " + localizedTenMillon);
        
        // now, scan the value ten million given in German locale
        try
        {
            Number parseAmount = germanFormat.parse(localizedTenMillon);
            
            if (tenMillion == parseAmount.longValue())
            {
                System.out.println("Successfully parsed the number for the locale");
            }
        }
        catch (ParseException pe)
        {
            System.err.println("Error: cannot parse the number for the locale");
            pe.printStackTrace();
        }
    }
}
