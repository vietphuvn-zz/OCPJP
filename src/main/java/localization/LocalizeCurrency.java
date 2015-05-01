/*
 * FILENAME
 *     LocalizeCurrency.java
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
import java.util.Locale;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class LocalizeCurrency
{

    public static void main(String[] args)
    {
        Long tenMillion = 10000L;
        Locale[] locales = {Locale.CANADA, Locale.FRANCE, Locale.GERMANY, Locale.TAIWAN};
        // for each of the four locales, print the currency amount as it looks in that locale
        for (Locale locale : locales) {
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
            System.out.printf("Ten million in %s id %s %n", locale.getDisplayName(), currencyFormat.format(tenMillion));
        }
    }

}
