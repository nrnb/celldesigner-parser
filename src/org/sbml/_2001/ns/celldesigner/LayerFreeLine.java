/*******************************************************************************
 * Copyright 2016 Kaito Ii, Akira Funahashi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.30 at 07:47:34 PM JST 
//


package org.sbml._2001.ns.celldesigner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for layerFreeLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="layerFreeLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bounds" type="{http://www.sbml.org/2001/ns/celldesigner}layerLineBounds"/>
 *         &lt;element name="line" type="{http://www.sbml.org/2001/ns/celldesigner}line"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isArrow" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isDotted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "layerFreeLine", propOrder = {
    "bounds",
    "line"
})
public class LayerFreeLine {

    /** The bounds. */
    @XmlElement(required = true)
    protected LayerLineBounds bounds;
    
    /** The line. */
    @XmlElement(required = true)
    protected Line line;
    
    /** The is arrow. */
    @XmlAttribute(name = "isArrow")
    protected Boolean isArrow;
    
    /** The is dotted. */
    @XmlAttribute(name = "isDotted")
    protected Boolean isDotted;

    /**
     * Gets the value of the bounds property.
     * 
     * @return
     *     possible object is
     *     {@link LayerLineBounds }
     *     
     */
    public LayerLineBounds getBounds() {
        return bounds;
    }

    /**
     * Sets the value of the bounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link LayerLineBounds }
     *     
     */
    public void setBounds(LayerLineBounds value) {
        this.bounds = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link Line }
     *     
     */
    public Line getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link Line }
     *     
     */
    public void setLine(Line value) {
        this.line = value;
    }

    /**
     * Gets the value of the isArrow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsArrow() {
        return isArrow;
    }

    /**
     * Sets the value of the isArrow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsArrow(Boolean value) {
        this.isArrow = value;
    }

    /**
     * Gets the value of the isDotted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDotted() {
        return isDotted;
    }

    /**
     * Sets the value of the isDotted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDotted(Boolean value) {
        this.isDotted = value;
    }

}
