/*
 * FILENAME
 *     LocalizedHello.java
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
public class LocalizedHello
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.ITALIAN);
        Locale currentResource = Locale.getDefault();
        ResourceBundle resourceBundle = ResourceBundle.getBundle("ResourceBundle", currentResource);
        System.out.printf(resourceBundle.getString("Greeting"));
    }
}
