/*
 * FILENAME
 *     FractionDigits.java
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

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class FractionDigits
{

    public static void main(String[] args)
    {
        String[] numbers = {"1.222", "0.12345F"};
        double[] doubles = {1.222, 0.12345F};
        NumberFormat numFormat = NumberFormat.getInstance();
        numFormat.setMaximumFractionDigits(2);
        
        System.out.println("Using format method:");
        for (double d : doubles)
        {
            System.out.println(numFormat.format(d));
        }
        
        System.out.println("Using parse method:");
        for (String st : numbers)
        {
            try
            {
                System.out.println(numFormat.parse(st));
            }
            catch (ParseException pe)
            {
                pe.printStackTrace();
            }
        }
    }

}
