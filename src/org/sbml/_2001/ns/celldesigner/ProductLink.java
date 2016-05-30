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


/**
 * Product link type.
 * 
 * <p>Java class for productLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="linkAnchor" type="{http://www.sbml.org/2001/ns/celldesigner}linkAnchor" minOccurs="0"/>
 *         &lt;element name="line" type="{http://www.sbml.org/2001/ns/celldesigner}lineType2"/>
 *       &lt;/sequence>
 *       &lt;attribute name="alias" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.sbml.org/2001/ns/celldesigner}SId">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="product" use="required" type="{http://www.sbml.org/2001/ns/celldesigner}SId" />
 *       &lt;attribute name="targetLineIndex" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="-?[0-9]+,[0-9]+"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productLink", propOrder = {
    "linkAnchor",
    "line"
})
public class ProductLink {

    protected LinkAnchor linkAnchor;
    @XmlElement(required = true)
    protected LineType2 line;
    @XmlAttribute(name = "alias", required = true)
    protected String alias;
    @XmlAttribute(name = "product", required = true)
    protected String product;
    @XmlAttribute(name = "targetLineIndex", required = true)
    protected String targetLineIndex;

    /**
     * Gets the value of the linkAnchor property.
     * 
     * @return
     *     possible object is
     *     {@link LinkAnchor }
     *     
     */
    public LinkAnchor getLinkAnchor() {
        return linkAnchor;
    }

    /**
     * Sets the value of the linkAnchor property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkAnchor }
     *     
     */
    public void setLinkAnchor(LinkAnchor value) {
        this.linkAnchor = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link LineType2 }
     *     
     */
    public LineType2 getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineType2 }
     *     
     */
    public void setLine(LineType2 value) {
        this.line = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the targetLineIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetLineIndex() {
        return targetLineIndex;
    }

    /**
     * Sets the value of the targetLineIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetLineIndex(String value) {
        this.targetLineIndex = value;
    }

}
