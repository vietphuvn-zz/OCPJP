/*
 * FILENAME
 *     TalkativeResourceBundleControl.java
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

import java.util.List;
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

// Extend ResourceBundle.Control and override getCandidateLocales method
// to get the list of candidate locales that Java searches for
public class TalkativeResourceBundleControl extends ResourceBundle.Control
{
    // override the default getCandidateLocales method to print
    // the candidate locales first
    public List<Locale> getCandidateLocales(String baseName, Locale locale)
    {
        List<Locale> candidateLocales = super.getCandidateLocales(baseName, locale);

        System.out.printf("Candidate locales for base bundle name %s and locale %s %n", baseName,
            locale.getDisplayName());
        for (Locale candidateLocale : candidateLocales)
        {
            System.out.println(candidateLocale);
        }

        return candidateLocales;
    }
}
