/*
 * FILENAME
 *     Shape.java
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

package chap.eight;

/**
 * <p>
 * The class for purpose of.
 * </p>
 * 
 * @version 1.0
 * @author phunv
 **/
public abstract class Shape
{
    public static class Color
    {
        int m_red, m_green, m_white;

        public Color()
        {
            this(0, 0, 0);
        }

        public Color(int m_red, int m_green, int m_white)
        {
            super();
            this.m_red = m_red;
            this.m_green = m_green;
            this.m_white = m_white;
        }

        /**
         * {@inheritDoc}
         *
         * @see java.lang.Object#toString()
         */
        @Override
        public String toString()
        {
            return "red = " + m_red + ", green = " + m_green + ", white = " + m_white;
        }
    }
}
