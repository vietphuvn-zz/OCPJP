/*
 * FILENAME
 *     Tester.java
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

package chap.three;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class Tester
{
    public static void swapPerson(Person p1, Person p2) 
    {
        Person p3 = p1;
        p1 = p2;
        p2 = p3;
        p2.setName("Ann");
    }
    
    
    public static void main(String[] args)
    {
        Person p1 = new Person("John");
        Person p2 = new Person("Marry");
        swapPerson(p1, p2);
        System.out.println(p1.getName());
        System.out.println(p2.getName());
        
        System.out.println(subNums((byte) 1, 1, 3));
        System.out.println(subSthm(1l, 1l, Short.valueOf("1")));
        
        
        float f1 = 2.2f;
        int d = 3;
        d = (int) f1;
        System.out.println(d);
        
        System.out.println("---------------");
        
        String st1 = "Ngong";
        String st2 = new String("Ngong");
        String st3 = "Ngong";
        System.out.println(st1 == st3);
        StringBuilder sb = new StringBuilder(10 + 2 + "SUN" + 4 + 5);
        sb.delete(3, 6);
        System.out.println(sb);
        byte b = 3;
        int ii;
        char cc = '#';
        ii = cc;
        System.out.println(ii);
        int [][][] aa = {{{1},{2, 2, 3}}, {{2,3}}};
        System.out.println(aa[1][0][1]);
        
        System.out.println("Array list - ------");
        List<String> l1 = new ArrayList<String>();
        l1.add("A");
        l1.add("B");
        
        List<String> l2 = l1;
        
        l2.set(0, "GG");
        System.out.println("l1-----");
        for (String st : l1)  System.out.print(st + " ");
        System.out.println();
        System.out.println("l2-----");
        for (String st : l2)  System.out.print(st + " ");
        
        ArrayList<String> ar1 = new ArrayList<String>();
        ar1.add("AR1");
        ar1.add("AR2");
        List<String> ar2 = (List<String>) ar1.clone();
        ar2.set(0, "PR0");
        System.out.println();
        System.out.println("ar1-----");
        for (String st : ar1)  System.out.print(st + " ");
        System.out.println();
        System.out.println("ar2-----");
        for (String st : ar2)  System.out.print(st + " ");
        
        System.out.println();
        System.out.println("li-----");
        
        ListIterator<String> li = l1.listIterator();
        
        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }
        
//        l1.clear();
        
        System.out.println();
        System.out.println(l1);
        
        List<Double> lint = new ArrayList<Double>();
        System.out.println(lint.size());
        lint.add(1.00);
        lint.add(2.0);
        System.out.println(lint.size());
        System.out.println(lint.contains(1.000));
        
        Double d1 = new Double(1.00);
        double d2 = 1.00;
        System.out.println(d1.equals(d2));
        
        
    }

    public static double subtract(byte b, int i, int j) {
        double d = b + i + j;
        return d;
    }
    
    public static double subNums(byte b, long l, double d) {
        return b + l + d;
    }
    
    public static float subSthm(long l1, long l2, short s) {
        double d = l1 + l2 + s;
        return (float) d;
    }
}
