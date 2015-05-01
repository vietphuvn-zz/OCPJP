/*
 * FILENAME
 *     BoxPrinterTest2.java
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

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class BoxPrinterTest2
{
    public static void main(String[] args)
    {
        BoxPrinterObjectBase value1 = new BoxPrinterObjectBase(new Integer(10));
        System.out.println(value1);
        Integer intValue1 = (Integer) value1.getValue();
        
        BoxPrinterObjectBase value2 = new BoxPrinterObjectBase("Hello world");
        System.out.println(value2);
        // OOPs! by mistake, we did (Integer) cast instead of (String)
        Integer intValue2 = (Integer) value2.getValue();
    }
}
