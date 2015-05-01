/*
 * FILENAME
 *     TheFatherInterfaceImpl.java
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

import java.io.IOException;

import cls.design.AbstractFather;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public class TheFatherInterfaceImpl extends AbstractFather
{

    /**
     * {@inheritDoc}
     *
     * @see cls.design.AbstractFather#readFile(java.lang.String)
     */
    @Override
    public void readFile(String path) throws IOException
    {
        System.out.println(ANCESTRY_NAME);
    }
}
