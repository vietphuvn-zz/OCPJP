/*
 * FILENAME
 *     TheSevenTester.java
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

package exception.assertion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class TheSevenTester
{

    public void readFile(String path) throws FileNotFoundException
    {
        try
        {
            InputStream is = new FileInputStream(path);
        }
        catch (NullPointerException npe)
        {
            npe.printStackTrace();
        }
        catch (OutOfMemoryError oome)
        {
            oome.printStackTrace();
        }
        finally
        {
            System.out.println("in finally block");
        }
    }
    
    public static void main(String[] args)
    {
        try
        {
            FileInputStream file = new FileInputStream("");
        }
        catch (FileNotFoundException fnfe)
        {
            fnfe.printStackTrace();
        }
        finally 
        {
            System.out.println("Finally...");
        }
    }

}
