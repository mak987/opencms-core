/*
 * File   : $Source: /alkacon/cvs/opencms/src/org/opencms/security/I_CmsPrincipal.java,v $
 * Date   : $Date: 2005/02/17 12:44:41 $
 * Version: $Revision: 1.8 $
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
package org.opencms.security;

import org.opencms.util.CmsUUID;

/**
 * Representation of an identity in the cms (currently user or group), 
 * used to define permissions on a resource.<p>
 * 
 * @version $Revision: 1.8 $ $Date: 2005/02/17 12:44:41 $
 * @author Carsten Weinholz (c.weinholz@alkacon.com)
 */
public interface I_CmsPrincipal {
    
    /** Identifier for group principals. */
    String C_PRINCIPAL_GROUP = "GROUP";
    
    /** Identifier for user principals. */
    String C_PRINCIPAL_USER = "USER";

    /**
     * Compares the given object with this principal.<p>
     * 
     * @param obj object to comapre
     * @return true if the object is equal
     */
    boolean equals(Object obj);

    /**
     * Returns the hash code of this object.<p>
     * 
     * @return the hash code
     */
    int hashCode();

    /**
     * Gets the id of this principal.<p>
     * 
     * @return the unique id of the principal.
     */
    CmsUUID getId();

    /**
     * Gets the name of this principal.<p>
     * 
     * @return the name of the principal
     */
    String getName();
}