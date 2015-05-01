/*
 * FILENAME
 *     TestItem.java
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

import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class TestItem
{
    public static abstract class Vary
    {
        int lenght;
        
        public Vary(int lenghtVar)
        {
            this.lenght = lenghtVar;
        }
        
        abstract void show();
    }
    
    public abstract class VaryAbstract extends Vary
    {
        public VaryAbstract()
        {
            super(5);
        }
    }
    
    public class VarySub extends Vary
    {
        public VarySub()
        {
            super(3);
        }
        
        /**
         * {@inheritDoc}
         *
         * @see generics.collections.TestItem.Vary#show()
         */
        @Override
        void show()
        {
            System.out.println("lenght = " + lenght);
        }
    }
    
    public static void main(String[] args)
    {
        TestItem.Vary vs = new TestItem().new VarySub();
        vs.show();
        
        Item it1 = new Item("it1", "Item 1");
        Item it2 = new Item("it1", "Item 1");
        Item it3 = new Item("it3", "Item 3");
        Item it4 = new Item("it4", "Item 4");
        Item it5 = new Item("it5", "Item 5");
        
        /*
        System.out.println("------------------------");
        Set<Item> hashSet = new HashSet<Item>();
        
        System.out.println("HashSet --> before add");
        
        hashSet.add(it1);
        hashSet.add(it3);
        hashSet.add(it4);
        hashSet.add(it5);
        
        System.out.println("HashSet --> after added");
        
        it = hashSet.iterator();
        
        while (it.hasNext())
        {
            item = (Item) it.next();
            System.out.println(item.getSerial());
        }
        
        System.out.println("hash set: " + hashSet.contains(it2));
        */
        
        /*
        System.out.println("------------------------");
        
        Set<Item> linkHashSet = new LinkedHashSet<Item>();
        System.out.println("--- 1 ---");
        linkHashSet.add(it1);
        System.out.println("--- 3 ---");
        linkHashSet.add(it3);
        System.out.println("--- 4 ---");
        linkHashSet.add(it4);
        System.out.println("--- 5 ---");
        linkHashSet.add(it5);
        
        System.out.println(linkHashSet);
        for (Item i : linkHashSet)
        {
            System.out.println(i.getSerial());
        }

        System.out.println();
        System.out.println("Searching...");
        
        System.out.println("linked hash set: " + linkHashSet.contains(it2));
        */
        
        
        System.out.println("------------------------");
        Set<Item> treeSet = new TreeSet<Item>();
        
        System.out.println("--- 1 ---");
        treeSet.add(it1);
        System.out.println("--- 3 ---");
        treeSet.add(it3);
        System.out.println("--- 4 ---");
        treeSet.add(it4);
        System.out.println("--- 5 ---");
        treeSet.add(it5);
        
        System.out.println();
        System.out.println("Searching...");
        // does not allow null item, will throw NullPointerException cause TreeMap use compareTo method to compare its elements
        // treeSet.add(null);
        System.out.println("tree set: " + treeSet.contains(it2));

        System.out.println("--------------------");
        
        /*
        Map<COItem, String> hashMap = new HashMap<COItem, String>();
        COItem coit1 = new COItem("it1", "Item 1");
        COItem coit2 = new COItem("it1", "Item 1");
        COItem coit3 = new COItem("it3", "Item 3");

        hashMap.put(coit1, "ABC");
        System.out.println("hash map: " + hashMap.containsKey(coit2));
        
        Map<String, COItem> linkHashMap = new LinkedHashMap<String, COItem>();
        linkHashMap.put("CDE", coit1);

        System.out.println("linked hash map: " + linkHashMap.containsValue(coit2));
        */
        
        /*
        Map<COItem, Integer> treeMap = new TreeMap<COItem, Integer>();
        treeMap.put(coit1, 1);
        treeMap.put(coit3, 3);

        System.out.println("tree map: " + treeMap.containsKey(coit2));

        for (COItem key : treeMap.keySet())
            System.out.println(key.getSerial());
        
        System.out.println(treeMap.get(coit2));
        */
        
        /*
        Map<String, String> ht = new Hashtable<String, String>();
        Set<Entry<String, String>> seeet = ht.entrySet();
        Iterator<Entry<String, String>> itt = seeet.iterator();
        while(itt.hasNext())
        {
            Entry<String, String> et = itt.next();
            et.getKey();
            et.getValue();
        }
        */
        
        /*
        Hashtable<String, Integer> htble = new Hashtable<String, Integer>();
        htble.put("A", 1);
        htble.put("A", 2);
        htble.put("B", 3);
        Enumeration<Integer> enu = htble.elements();
        System.out.println("+++++++++");
        while (enu.hasMoreElements())
        {
            System.out.println(enu.nextElement());
        }
        */
        
        Date date = new Date(1425280785226L);
        System.out.println(date);
        Date date1 = new Date(1425281685226L);
        System.out.println(date1);
    }
}

