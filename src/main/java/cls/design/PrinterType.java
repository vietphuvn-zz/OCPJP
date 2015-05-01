/*
 * FILENAME
 *     PrinterType.java
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

package cls.design;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public enum PrinterType
{
    DOTMATRIX(5),
    INKJET(10),
    LASER(50);

    public int pagePrintCapacity;

    private PrinterType(int printCapacity)
    {
        this.pagePrintCapacity = printCapacity;
    }

    public int getPagePrintCapacity()
    {
        return this.pagePrintCapacity;
    }

    public static List<PrinterType> list()
    {
        return Arrays.asList(values());
    }
}
