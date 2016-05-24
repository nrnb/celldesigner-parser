//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.24 at 04:07:29 PM JST 
//


package org.sbml._2001.ns.celldesigner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * End point (residue, binding site, effect site, operator, link, degrade) of the link.
 * 
 * <p>Java class for endPointInBlockDiagram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="endPointInBlockDiagram">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="offsetX" use="required">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}decimal" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="offsetY" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="residue">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="bindingSite">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="effectSite">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="operator">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="link">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="degrade">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *             &lt;minInclusive value="0"/>
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
@XmlType(name = "endPointInBlockDiagram")
public class EndPointInBlockDiagram {

    @XmlAttribute(name = "offsetX", required = true)
    protected List<BigDecimal> offsetX;
    @XmlAttribute(name = "offsetY", required = true)
    protected BigDecimal offsetY;
    @XmlAttribute(name = "residue")
    protected Short residue;
    @XmlAttribute(name = "bindingSite")
    protected Short bindingSite;
    @XmlAttribute(name = "effectSite")
    protected Short effectSite;
    @XmlAttribute(name = "operator")
    protected Short operator;
    @XmlAttribute(name = "link")
    protected Short link;
    @XmlAttribute(name = "degrade")
    protected Short degrade;

    /**
     * Gets the value of the offsetX property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offsetX property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffsetX().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getOffsetX() {
        if (offsetX == null) {
            offsetX = new ArrayList<BigDecimal>();
        }
        return this.offsetX;
    }

    /**
     * Gets the value of the offsetY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOffsetY() {
        return offsetY;
    }

    /**
     * Sets the value of the offsetY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOffsetY(BigDecimal value) {
        this.offsetY = value;
    }

    /**
     * Gets the value of the residue property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getResidue() {
        return residue;
    }

    /**
     * Sets the value of the residue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setResidue(Short value) {
        this.residue = value;
    }

    /**
     * Gets the value of the bindingSite property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBindingSite() {
        return bindingSite;
    }

    /**
     * Sets the value of the bindingSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBindingSite(Short value) {
        this.bindingSite = value;
    }

    /**
     * Gets the value of the effectSite property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getEffectSite() {
        return effectSite;
    }

    /**
     * Sets the value of the effectSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setEffectSite(Short value) {
        this.effectSite = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOperator(Short value) {
        this.operator = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLink(Short value) {
        this.link = value;
    }

    /**
     * Gets the value of the degrade property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDegrade() {
        return degrade;
    }

    /**
     * Sets the value of the degrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDegrade(Short value) {
        this.degrade = value;
    }

}