/*
 * FILENAME
 *     MainTest.java
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

package chap.test.sth;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
class Parrent {
    public int age = 0;
    
    public void printAge() {
        System.out.println("parrent age = " + age);
    }
    
    public Number getAge() {
        return (Number) age;
    }
}

class Child extends Parrent {
    public int age = 2;
    
    public void printAge() {
        System.out.println("child age = " + age);
    }
    
    public void printAge(int year) {
        System.out.println("child age = " + age + year);
    }
    
    public Integer getAge() {
        return age;
    }
}

public class MainTest
{
    
    
    public static void main(String[] args)
    {
        Parrent p1 = new Child();
        p1.printAge();
        
        Parrent p2 = new Parrent();
        p2.printAge();
        
        Child myChild = new Child();
        
        myChild.printAge(2000);
        
        Child c1 = (Child) p1;
        c1.printAge();
        
        c1.printAge(3);
        
        // ClassCastException
        // Child c2 = (Child) p2;
        
        Parrent p3 = (Parrent) myChild;
        p3.printAge();
        
        
        System.out.println("p3.getAge() = " + p3.getAge());
        
        Number n = new Integer("2");
        System.out.println(n);
    }
}
