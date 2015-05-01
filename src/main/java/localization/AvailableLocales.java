/*
 * FILENAME
 *     AvailableLocales.java
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

import java.util.Locale;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class AvailableLocales
{

    public static void main(String[] args)
    {
        Locale[] locates = Locale.getAvailableLocales();

        System.out.printf("No. of available locale is: %d, and they are:%n", locates.length);
        System.out.println();

        for (Locale lc : locates)
        {
            System.out.println(lc + " and it's stand for: " + lc.getDisplayLanguage());
        }

        System.out.println();

        System.out.println("the default locate is: " + Locale.getDefault().getLanguage());
        System.out.println();

        for (Locale lc : locates)
        {
            // filter & display only English locates
            if (lc.getLanguage().equals("en"))
            {
                System.out.printf("Locale code: %s, it's stand for %s%n", lc, lc.getDisplayName());
            }
        }
        
        System.out.println();
        
        Locale.setDefault(Locale.CANADA_FRENCH);
        Locale defaultLocale = Locale.getDefault();
        
        System.out.printf("The default locale is %s%n", defaultLocale);
        System.out.printf("The default language code is %s and the name is %s %n", defaultLocale.getLanguage(), defaultLocale.getDisplayLanguage());
        System.out.printf("The default country code is %s and the name is %s %n", defaultLocale.getCountry(), defaultLocale.getDisplayCountry());
        System.out.printf("The default variant code is %s and the name is %s %n", defaultLocale.getVariant(), defaultLocale.getDisplayVariant());
        
        System.out.println();
        
        Locale.setDefault(new Locale("fr", "CA", "CU"));
        defaultLocale = Locale.getDefault();
        
        System.out.printf("The default locale is %s%n", defaultLocale);
        System.out.printf("The default language code is %s and the name is %s %n", defaultLocale.getLanguage(), defaultLocale.getDisplayLanguage());
        System.out.printf("The default country code is %s and the name is %s %n", defaultLocale.getCountry(), defaultLocale.getDisplayCountry());
        System.out.printf("The default variant code is %s and the name is %s %n", defaultLocale.getVariant(), defaultLocale.getDisplayVariant());
        
        System.out.println();
        System.out.printf("The boolean is %h %n", "axu");
    }

}
