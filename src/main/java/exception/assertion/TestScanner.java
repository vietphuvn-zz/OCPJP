/*
 * FILENAME
 *     TestExceptions.java
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

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class TestScanner
{
    protected static int count = 0;
    
    public  static void main(String[] args)
    {
        System.out.println("Type an integer in the console:");

        try (Scanner consoleScanner = new Scanner(System.in))
        {
            synchronized (consoleScanner)
            {
                System.out.println("--> You typed the integer value: " + consoleScanner.nextInt());
            }
            
            // bad practice
            // consoleScanner.close();
        }
        catch (InputMismatchException ime)
        {
            // nextInt() throws InputMismatchException in case 
            // anything other than an integer is typed in the console, so handle it
            System.out.println("Error: You typed a some text that is not an integer value");
            ime.printStackTrace();
        }
        /*
        catch (NoSuchElementException | IllegalStateException ise) {
            
        }
        */
        catch (IllegalStateException ise) {
            System.out.println("Error: nextInt()  called on a closed Scanner object");
            ise.printStackTrace();
        }
    }

}
