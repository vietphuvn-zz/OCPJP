/*
 * FILENAME
 *     Posterity.java
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
import java.io.IOException;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class Posterity
{
    {

        try (FileInputStream fis = new FileInputStream(""))
        {
            System.out.println("You typed: " + fis.getFD());
        }
        catch (FileNotFoundException e)
        {
            throw new FileNotFoundException();
        }

        try (FileInputStream fis = new FileInputStream(""))
        {
            System.out.println("You typed: " + fis.getFD());
        }
        catch (IOException e)
        {
            throw new IOException();
        }
    }

    public Posterity() throws FileNotFoundException, IOException
    {

    }

    public static void main(String[] args)
    {
        try
        {
            Posterity p = new Posterity();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        System.out.println("End@");
        
        try
        {
            Posterity.fooo();
        }
        catch (WrongInputException e)
        {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }

    public static void fooo() throws WrongInputException
    {
        throw new WrongInputException("Ooopp! ex is:", new Throwable("ABC"));
    }
}
