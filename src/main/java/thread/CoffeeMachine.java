/*
 * FILENAME
 *     CoffeeMachine.java
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

package thread;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class CoffeeMachine extends Thread
{
    static String coffeeMade = null;
    static final Object lock = new Object();
    private static int coffeeNumber = 1;

    void makeCoffee()
    {
        synchronized (CoffeeMachine.lock)
        {
            if (coffeeMade != null)
            {
                try
                {
                    System.out.println("Coffee machine: Waiting for waiter notification to deliver the coffee");
                    CoffeeMachine.lock.wait();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }

            coffeeMade = "Coffee No. " + coffeeNumber++;
            System.out.println("Coffee machine says: Made " + coffeeMade);
            // once coffee is ready, notify the waiter to pick it up
            CoffeeMachine.lock.notifyAll();
            System.out.println("Coffee machine: Notifying waiter to pick the coffee ");
        }
    }
    
    public void run()
    {
        while (true)
        {
            makeCoffee();
            
            try
            {
                System.out.println("Coffee machine: Making another coffee now");
                // simulate the time taken to make a coffee by calling sleep method
                Thread.sleep(10000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
