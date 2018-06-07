/* SPDX-License-Identifier: Apache-2.0 */
package org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.typedefs;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;

/**
 * TypeDefGalleryResponse contains details of the AttributeTypeDefs and full TypeDefs supported by a rep
 */
@JsonAutoDetect(getterVisibility=PUBLIC_ONLY, setterVisibility=PUBLIC_ONLY, fieldVisibility=NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class TypeDefGallery
{
    private List<AttributeTypeDef> attributeTypeDefs = null;
    private List<TypeDef>          typeDefs          = null;


    /**
     * Default constructor
     */
    public TypeDefGallery()
    {
    }


    /**
     * Copy/clone constructor
     *
     * @param template - template to copy
     */
    public TypeDefGallery(TypeDefGallery    template)
    {
        if (template != null)
        {
            List<AttributeTypeDef> templateAttributeTypeDefs = template.getAttributeTypeDefs();
            List<TypeDef>          templateTypeDefs          = template.getTypeDefs();

            this.setAttributeTypeDefs(templateAttributeTypeDefs);
            this.setTypeDefs(templateTypeDefs);
        }
    }


    /**
     * Return the list of attribute type definitions from the gallery.
     *
     * @return list of attribute type definitions
     */
    public List<AttributeTypeDef> getAttributeTypeDefs()
    {
        if (attributeTypeDefs == null)
        {
            return null;
        }
        else
        {
            return new ArrayList<>(attributeTypeDefs);
        }
    }


    /**
     * Set up the list of attribute type definitions from the gallery.
     *
     * @param attributeTypeDefs - list of attribute type definitions
     */
    public void setAttributeTypeDefs(List<AttributeTypeDef> attributeTypeDefs)
    {
        if (attributeTypeDefs == null)
        {
            this.attributeTypeDefs = null;
        }
        else
        {
            this.attributeTypeDefs = new ArrayList<>(attributeTypeDefs);
        }
    }


    /**
     * Return the list of type definitions from the gallery.
     *
     * @return list of type definitions
     */
    public ArrayList<TypeDef> getTypeDefs()
    {
        if (typeDefs == null)
        {
            return null;
        }
        else
        {
            return new ArrayList<>(typeDefs);
        }
    }


    /**
     * Set up the list of type definitions from the gallery.
     *
     * @param typeDefs - list of type definitions
     */
    public void setTypeDefs(List<TypeDef> typeDefs)
    {
        if (typeDefs == null)
        {
            this.typeDefs = null;
        }
        else
        {
            this.typeDefs = new ArrayList<>(typeDefs);
        }
    }
}