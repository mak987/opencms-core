/*
 * File   : $Source: /alkacon/cvs/opencms/src/org/opencms/xml/CmsXmlException.java,v $
 * Date   : $Date: 2005/02/17 12:45:12 $
 * Version: $Revision: 1.3 $
 *
 * This library is part of OpenCms -
 * the Open Source Content Mananagement System
 *
 * Copyright (C) 2002 - 2005 Alkacon Software (http://www.alkacon.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * For further information about Alkacon Software, please see the
 * company website: http://www.alkacon.com
 *
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
 
package org.opencms.xml;

import org.opencms.main.CmsException;

/**
 * Signals that an error occured while processing an xml resource.<p>
 * 
 * @author Alexander Kandzior (a.kandzior@alkacon.com)
 * @version $Revision: 1.3 $
 * @since 5.1.4
 */
public class CmsXmlException extends CmsException {
    
    // the allowed type range for this exception is >=400 and <500    
    
    /** Generic init error. */
    public static final int C_XML_GENERIC_ERROR = 400;
        
    /**
     * Default constructor for a CmsXmlPageException.<p>
     */
    public CmsXmlException() {
        super();
    }
    
    /**
     * Constructs a CmsXmlPageException with the specified description message and type.<p>
     * 
     * @param type the type of the exception
     */
    public CmsXmlException(int type) {
        super(type);
    }
        
    /**
     * Constructs a CmsXmlPageException with the specified description message and type.<p>
     * 
     * @param message the description message
     * @param type the type of the exception
     */
    public CmsXmlException(String message, int type) {
        super(message, type);
    }
    
    /**
     * Constructs a CmsXmlPageException with the specified description message.<p>
     * 
     * @param message the description message
     */
    public CmsXmlException(String message) {
        super(message, C_XML_GENERIC_ERROR);
    }    
    
    /**
     * Constructs a CmsXmlPageException with the specified description message and root cause.<p>
     * 
     * @param message the description message
     * @param rootCause the root cause
     */
    public CmsXmlException(String message, Throwable rootCause) {
        super(message, C_XML_GENERIC_ERROR, rootCause);
    }        
    
    /**
     * Returns the description String for the provided CmsXmlPageException type.<p>
     * 
     * @param type exception error code 
     * @return the description String for the provided CmsXmlPageException type
     */    
    protected String getErrorDescription(int type) {
        switch (type) {
            case C_XML_GENERIC_ERROR:
                return "Error in xml processing";
            default:
                return super.getErrorDescription(type);
        }
    }
}
