/*
 * File   : $Source: /alkacon/cvs/opencms/src/com/opencms/legacy/Attic/CmsResourceTypeCompatiblePlain.java,v $
 * Date   : $Date: 2005/02/17 12:43:47 $
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

package com.opencms.legacy;

import org.opencms.db.CmsSecurityManager;
import org.opencms.file.CmsObject;
import org.opencms.file.CmsResource;
import org.opencms.file.types.A_CmsResourceType;
import org.opencms.loader.CmsDumpLoader;

import java.util.List;

/**
 * Describes the resource type "compatiblePlain" (that only exists for backward compatibility for 
 * some very old OpenCms version).<p>
 *
 * @author Alexander Kandzior (a.kandzior@alkacon.com)
 * @version $Revision: 1.8 $
 * 
 * @deprecated Will not be supported past the OpenCms 6 release.
 */
public class CmsResourceTypeCompatiblePlain extends A_CmsResourceType {

    /** The type id of this resource. */
    public static final int C_RESOURCE_TYPE_ID = 7;
    
    /** The name of this resource. */
    public static final String C_RESOURCE_TYPE_NAME = "compatiblePlain";
    
    /**
     * @see org.opencms.file.types.I_CmsResourceType#getTypeId()
     */
    public int getTypeId() {
        return C_RESOURCE_TYPE_ID;
    }

    /**
     * @see org.opencms.file.types.A_CmsResourceType#getTypeName()
     */
    public String getTypeName() {
        return C_RESOURCE_TYPE_NAME;
    }

    /**
     * @see org.opencms.file.types.I_CmsResourceType#getLoaderId()
     */
    public int getLoaderId() {
        return CmsDumpLoader.C_RESOURCE_LOADER_ID;
    }      
    
    /**
     * @see org.opencms.file.types.A_CmsResourceType#createResource(org.opencms.file.CmsObject, org.opencms.db.CmsSecurityManager, java.lang.String, byte[], java.util.List)
     */
    public CmsResource createResource(
        CmsObject cms,
        CmsSecurityManager securityManager,
        String resourcename,
        byte[] content,
        List properties) {

        throw new RuntimeException("createResource(): The resource type 'compatiblePlain' is deprecated and not longer supported");
    }    
}