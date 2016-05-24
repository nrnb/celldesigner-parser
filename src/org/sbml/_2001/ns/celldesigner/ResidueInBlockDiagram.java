//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.24 at 04:07:29 PM JST 
//


package org.sbml._2001.ns.celldesigner;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Residue on the upper side of a block(protein).
 * 
 * <p>Java class for residueInBlockDiagram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="residueInBlockDiagram">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="residue">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.sbml.org/2001/ns/celldesigner}SId">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="phosphorylated"/>
 *             &lt;enumeration value="acetylated"/>
 *             &lt;enumeration value="ubiquitinated"/>
 *             &lt;enumeration value="methylated"/>
 *             &lt;enumeration value="hydroxylated"/>
 *             &lt;enumeration value="empty"/>
 *             &lt;enumeration value="dontcare"/>
 *             &lt;enumeration value="unknown"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="id" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="offsetX" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;enumeration value="-103.82142857142863"/>
 *             &lt;enumeration value="-15.0"/>
 *             &lt;enumeration value="-18.321428571428584"/>
 *             &lt;enumeration value="-23.0"/>
 *             &lt;enumeration value="-45.0"/>
 *             &lt;enumeration value="-75.0"/>
 *             &lt;enumeration value="0.0"/>
 *             &lt;enumeration value="15.0"/>
 *             &lt;enumeration value="23.0"/>
 *             &lt;enumeration value="45.0"/>
 *             &lt;enumeration value="75.0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="name">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="nameOffsetX">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="nameOffsetY">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
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
@XmlType(name = "residueInBlockDiagram")
public class ResidueInBlockDiagram {

    @XmlAttribute(name = "residue")
    protected String residue;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "id", required = true)
    protected short id;
    @XmlAttribute(name = "offsetX", required = true)
    protected BigDecimal offsetX;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "nameOffsetX")
    protected BigDecimal nameOffsetX;
    @XmlAttribute(name = "nameOffsetY")
    protected BigDecimal nameOffsetY;

    /**
     * Gets the value of the residue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidue() {
        return residue;
    }

    /**
     * Sets the value of the residue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidue(String value) {
        this.residue = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public short getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(short value) {
        this.id = value;
    }

    /**
     * Gets the value of the offsetX property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOffsetX() {
        return offsetX;
    }

    /**
     * Sets the value of the offsetX property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOffsetX(BigDecimal value) {
        this.offsetX = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nameOffsetX property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNameOffsetX() {
        return nameOffsetX;
    }

    /**
     * Sets the value of the nameOffsetX property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNameOffsetX(BigDecimal value) {
        this.nameOffsetX = value;
    }

    /**
     * Gets the value of the nameOffsetY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNameOffsetY() {
        return nameOffsetY;
    }

    /**
     * Sets the value of the nameOffsetY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNameOffsetY(BigDecimal value) {
        this.nameOffsetY = value;
    }

}