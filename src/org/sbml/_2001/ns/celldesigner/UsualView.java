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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * Data for drawing object with usual view.
 * 
 * <p>Java class for usualView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="usualView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="innerPosition" type="{http://www.sbml.org/2001/ns/celldesigner}innerPosition" minOccurs="0"/>
 *         &lt;element name="boxSize" type="{http://www.sbml.org/2001/ns/celldesigner}boxSize"/>
 *         &lt;element name="singleLine" type="{http://www.sbml.org/2001/ns/celldesigner}singleLine"/>
 *         &lt;element name="paint" type="{http://www.sbml.org/2001/ns/celldesigner}paint"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usualView", propOrder = {
    "innerPosition",
    "boxSize",
    "singleLine",
    "paint"
})
public class UsualView {

    /** The inner position. */
    protected InnerPosition innerPosition;
    
    /** The box size. */
    @XmlElement(required = true)
    protected BoxSize boxSize;
    
    /** The single line. */
    @XmlElement(required = true)
    protected SingleLine singleLine;
    
    /** The paint. */
    @XmlElement(required = true)
    protected Paint paint;

    /**
     * Gets the value of the innerPosition property.
     * 
     * @return
     *     possible object is
     *     {@link InnerPosition }
     *     
     */
    public InnerPosition getInnerPosition() {
        return innerPosition;
    }

    /**
     * Sets the value of the innerPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link InnerPosition }
     *     
     */
    public void setInnerPosition(InnerPosition value) {
        this.innerPosition = value;
    }

    /**
     * Gets the value of the boxSize property.
     * 
     * @return
     *     possible object is
     *     {@link BoxSize }
     *     
     */
    public BoxSize getBoxSize() {
        return boxSize;
    }

    /**
     * Sets the value of the boxSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoxSize }
     *     
     */
    public void setBoxSize(BoxSize value) {
        this.boxSize = value;
    }

    /**
     * Gets the value of the singleLine property.
     * 
     * @return
     *     possible object is
     *     {@link SingleLine }
     *     
     */
    public SingleLine getSingleLine() {
        return singleLine;
    }

    /**
     * Sets the value of the singleLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleLine }
     *     
     */
    public void setSingleLine(SingleLine value) {
        this.singleLine = value;
    }

    /**
     * Gets the value of the paint property.
     * 
     * @return
     *     possible object is
     *     {@link Paint }
     *     
     */
    public Paint getPaint() {
        return paint;
    }

    /**
     * Sets the value of the paint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paint }
     *     
     */
    public void setPaint(Paint value) {
        this.paint = value;
    }

}
