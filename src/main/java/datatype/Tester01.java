/*
 * FILENAME
 *     Tester01.java
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

package datatype;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class Tester01
{
    private int i;
    
    public static void main(String[] args)
    {
        float x = 0.1f;
        for (int i = 0; i < 5; i++) {
            x += 0.1f;
        }
        System.out.println(x);
        
        // NullPointerException
        /*
        Integer i = null;
        int k = i;
        */
        long l = 9;
        float y = 10;
        double kk = 3.012E3;
        double d = 3.21D;
        System.out.println(kk);
        /*
        byte b1 = (byte) 0b110;
        byte b2 = (byte) 0b11;
        */
        Long b1 = 3L;
        int b2 = 9;
        byte b = (byte) (b1 & b2);
        
        System.out.println(b);
        
        byte i = (byte) 5666.5;
        System.out.println(i);
        
        System.out.println((int) 7 / 3);
        
        int total = 0;
        total *= 5;
        System.out.println(total);
        
        String secondIrene = "Ire\u0300ne";
        System.out.println(secondIrene.substring(1, 3));
        String fistIrene = "Inrènen";
        System.out.println(fistIrene.length());
        System.out.println(Character.isDigit(fistIrene.charAt(2)));
        System.out.println(fistIrene.indexOf('n', 2));
        
        StringBuffer sb = new StringBuffer("World class buffering mechanism");
        sb.replace(6, 8, "C");
        System.out.println(sb);
        
        byte bbbc = -128;
        int inddd = 65535;
        System.out.println(sb);
        System.out.println(sb.length());
        sb.deleteCharAt(29);
        System.out.println(sb);
        
        int limit = 90;
        int state = 50;
        
        if (limit >= 100)
            if (state == 50)
                limit += 10;
            else {
                System.out.println("OK man");
            }
        else 
            limit = -1;
        
        System.out.println(limit);
        
        char c = 'c';
        String str = "str1";
        
        switch(c) {
            case 'a':
                break;
        }
        
        switch (str)
        {
            case "null":
                System.out.println("STR...");
            default:
                System.out.println("Default");
            case "str2":
                System.out.println("STR2...");
            
        }
        
        float num1 = 0.0f;
        
        System.out.println(num1 / 0.0f);
        System.out.println(Math.sqrt(-4));
        System.out.println(Double.NaN + Double.NaN);
        System.out.println(Float.NaN + 2);
        
        System.out.println("Double.NaN: " + (byte) Double.NaN);
        
        System.out.println(Float.NEGATIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Float.POSITIVE_INFINITY);
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Float.POSITIVE_INFINITY+2);
        System.out.println(1.0 / 0.0);
        System.out.println((1.0 / 0.0) - (1.0 / 0.0));
        System.out.println(23.0f / 0.0f);
        System.out.println((int)(1.0 / 0.0));
        System.out.println(Float.NEGATIVE_INFINITY == Double.NEGATIVE_INFINITY);
        System.out.println(Float.NaN == Double.NaN);
        
        float fnbc = 1.2f;
        float fnc = 0.2f;
        
        if (fnbc / fnc == 6)
        {
            System.out.println("Float Expectation");
        }
        else 
        {
            System.out.println("Float Approximately");
        }
        
        double dbc = 1.2f;
        double dnc = 0.2f;
        
        if (dbc / dnc == 6)
        {
            System.out.println("Double Expectation");
        }
        else 
        {
            System.out.println("Double Approximately: " + (dbc / dnc ));
        }
        
        System.out.println(Float.NEGATIVE_INFINITY < (1.0 / 0.0));
        System.out.println(Float.NEGATIVE_INFINITY == Float.NaN);
        System.out.println(Float.NEGATIVE_INFINITY < -0.0);
    }

}
