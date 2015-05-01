/*
 * FILENAME
 *     Prim.java
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

package chap.one;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class Prim
{

    public static void main(String[] args)
    {
        boolean bl = false;
        int i = 10;
        float f = 19.5f;
        float t = 10.9f;
        byte b = 2;
        double d = 1.1D;
        Float T = 10.9f;
        Double D = 2.3;
        long l = 3;
        Long L = 9l;
        System.out.println(d);
        System.out.println(i = b);
        System.out.println(f);
        System.out.println(t);
        System.out.println(T);
        
        String trigger = "MON";
        
        switch(trigger) {
            case "TUE":
                System.out.println("Tue day");
                break;
            default:
                System.out.println(trigger);
                break;
        }
        
        List<Integer> myList = new ArrayList<Integer>();
        List<Integer> myLinkedList = new LinkedList<Integer>();
        Set<String> mySet = new HashSet<String>();
        Set<String> myLinkedSet = new LinkedHashSet<String>();
        Map<String, Integer> hashtable = new Hashtable<String, Integer>(); // not allow neither key = null or value = null
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
        
        mySet.add(null);
        mySet.add("DD");
        
        hashtable.put("OK", 1);
        //hashtable.put(null, 1);
        
        hashMap.put(null, 2);
        hashMap.put(null, null);
        hashMap.put("A", 6);
        hashMap.put("B", 98);
        
        linkedHashMap.put(null, 1);
        linkedHashMap.put(null, 3);
        
        List<String> listNull = null;
        
        System.out.println(hashMap.get(listNull));
        System.out.println(linkedHashMap.get(null));
        
        Iterator<String> it = mySet.iterator();
        
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        Integer[] st = new Integer[3];
        
        for (int j = 0; j < st.length; j++) {
			st[j] = j;
		}
        
        System.out.println("++++++++++++");
        
        for (int j = 0; j < st.length; j++) {
			System.out.println(st[j]);
		}
        
        System.out.println("++++++++++++");
        
        Set<String> hashMapKey = hashMap.keySet();
        Iterator<String> iii = hashMapKey.iterator();
        
        while (iii.hasNext()) {
        	System.out.println(hashMap.get(iii.next()));
        }
        
        System.out.println("++++++++++++");
        
        for (String stt : mySet) {
        	System.out.println(stt);
        }
    }

}
