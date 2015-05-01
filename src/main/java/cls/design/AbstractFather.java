/*
 * FILENAME
 *     TheFatherInterface.java
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

package cls.design;

import java.io.IOException;

import chap.one.Ancestry;
import chap.one.Cousin;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public abstract class AbstractFather implements Ancestry, Cousin
{
    private String secondWife = "Boooooo";
    String ANCESTRY = "Nguyen";
    protected String visaNo = "TN";
    public String addrs = "TN";
    
    public AbstractFather()
    {
        super();
    }
    
    public AbstractFather(String addrs)
    {
        super();
        this.addrs = addrs;
    }

    public void readFile(String path) throws IOException {
        System.out.println(ANCESTRY_NAME);
    }

    /**
     * <p>
     * Getter for secondWife.
     * </p>
     * 
     * @return the secondWife
     */
    public String getSecondWife()
    {
        return secondWife;
    }

    /**
     * <p>
     * Setting value for secondWife.
     * </p>
     * 
     * @param secondWife the secondWife to set
     */
    public void setSecondWife(String secondWife)
    {
        this.secondWife = secondWife;
    }
    
}
