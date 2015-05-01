/*
 * FILENAME
 *     OtherEnumTest.java
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

package generics.collections;

import cls.design.PrinterType;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class OtherEnumTest
{
    private PrinterType printerType;
    
    public OtherEnumTest(PrinterType printerType)
    {
        super();
        this.printerType = printerType;
    }

    public void feature()
    {
        switch(printerType)
        {
            case DOTMATRIX:
                break;
            case INKJET:
                break;
            case LASER:
                break;
        }
    }

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

    }

}
