/*
 * FILENAME
 *     CandidateLocales.java
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
import java.util.ResourceBundle;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class CandidateLocales
{
    public static void loadResourceBundle(String resourceBundleName, Locale locale)
    {
        // Pass an instance of TalkativeResourceBundleControl
        // to print candidate locales
        ResourceBundle resourceBundle =
            ResourceBundle.getBundle(resourceBundleName, locale, new TalkativeResourceBundleControl());
        String rbLocaleName = resourceBundle.getLocale().toString();
        // if the resource bundle locale name is empty,
        // it means default property file
        if (rbLocaleName.equals(""))
        {
            System.out.println("Loaded the default property file with name: " + resourceBundleName);
        }
        else
        {
            System.out.println("Loaded the resource bundle for the locale: " + resourceBundleName + "." + rbLocaleName);
        }
    }

    public static void main(String[] args)
    {
        // trace how ResourceBundle_it_IT_Rome.properties is resolved
        // loadResourceBundle("ResourceBundle", new Locale("it", "IT", "Rome"));
        // loadResourceBundle("ResourceBundle", new Locale("vi", "VI"));
        // loadResourceBundle("ResourceBundle", Locale.getDefault());
        loadResourceBundle("ResourceBundles", Locale.getDefault());
    }
}
