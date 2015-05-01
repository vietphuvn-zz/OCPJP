/*
 * FILENAME
 *     StatusReporter.java
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
public class StatusReporter
{
    public static final String CONST;

    static
    {
        CONST = "A";
        System.out.println("Exec Static block");
    }

    {

        System.out.println("Exec Init block");
    }

    public StatusReporter()
    {
        System.out.println("Exec construct block");
    }

    static Shape.Color getDescriptiveColor(final Shape.Color color)
    {
        if (color != null)
        {
            class DescriptiveColor extends Shape.Color
            {
                /**
                 * {@inheritDoc}
                 *
                 * @see chap.eight.Shape.Color#toString()
                 */
                @Override
                public String toString()
                {
                    return "You select a color with RGB values " + color;
                }
            }

            return new DescriptiveColor();
        }
        else
        {
            return null;
        }
    }

    public static void main(String[] args)
    {
        StatusReporter st = new StatusReporter();
        Shape.Color colorDescriptive = StatusReporter.getDescriptiveColor(new Shape.Color(1, 2, 3));
        System.out.println(colorDescriptive);
    }
}
