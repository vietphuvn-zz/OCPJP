/*
 * FILENAME
 *     EnumTest.java
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

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class EnumTest
{
    private static enum Category {
        
    }
    
    private PrinterType printerType;

    public EnumTest(PrinterType printerType)
    {
        super();
        this.printerType = printerType;
    }

    public void feature()
    {
        switch (printerType)
        {
            case DOTMATRIX:
                System.out.println("Dot-matrix printers are economical");
                break;
            case INKJET:
                System.out.println("Inkjet printers provide decent quality prints");
                break;
            case LASER:
                System.out.println("Laser printers provide the best quality prints");
                break;
        }
        
        System.out.println("Print page capacity per minute: " + printerType.getPagePrintCapacity());
    }

    public static void main(String[] args)
    {
        EnumTest et = new EnumTest(PrinterType.DOTMATRIX);
        et.feature();
        
        for (PrinterType pt : PrinterType.values()) 
        {
            System.out.println(pt.name());
            System.out.println(pt.ordinal());
        }
            
    }

}
