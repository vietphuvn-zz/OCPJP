/*
 * FILENAME
 *     CurrencyDetails.java
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

import java.util.Currency;
import java.util.Locale;

/**
 * <p>
 * The class for purpose of get the Currency details of the default Locale (en_US locale).
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class CurrencyDetails
{

    public static void main(String[] args)
    {
        Currency currency = Currency.getInstance(Locale.getDefault());
        System.out.printf("The currency code for locale %s is %s %n", Locale.getDefault(), currency.getCurrencyCode());
        System.out.printf("The currency symbol is %s %n", currency.getSymbol());
        System.out.printf("The currency name is %s %n", currency.getDisplayName());
    }

}
