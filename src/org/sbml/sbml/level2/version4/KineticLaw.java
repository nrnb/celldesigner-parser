//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.30 at 07:47:34 PM JST 
//


package org.sbml.sbml.level2.version4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3._1998.math.mathml.Math;


/**
 * <p>Java class for KineticLaw complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KineticLaw">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sbml.org/sbml/level2/version4}SBase">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/1998/Math/MathML}math"/>
 *         &lt;element name="listOfParameters" type="{http://www.sbml.org/sbml/level2/version4}ListOfParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="timeUnits" type="{http://www.sbml.org/sbml/level2/version4}SId" />
 *       &lt;attribute name="substanceUnits" type="{http://www.sbml.org/sbml/level2/version4}SId" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KineticLaw", propOrder = {
    "math",
    "listOfParameters"
})
public class KineticLaw
    extends SBase
{

    @XmlElement(namespace = "http://www.w3.org/1998/Math/MathML", required = true)
    protected Math math;
    protected ListOfParameters listOfParameters;
    @XmlAttribute(name = "timeUnits")
    protected String timeUnits;
    @XmlAttribute(name = "substanceUnits")
    protected String substanceUnits;

    /**
     * Gets the value of the math property.
     * 
     * @return
     *     possible object is
     *     {@link Math }
     *     
     */
    public Math getMath() {
        return math;
    }

    /**
     * Sets the value of the math property.
     * 
     * @param value
     *     allowed object is
     *     {@link Math }
     *     
     */
    public void setMath(Math value) {
        this.math = value;
    }

    /**
     * Gets the value of the listOfParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfParameters }
     *     
     */
    public ListOfParameters getListOfParameters() {
        return listOfParameters;
    }

    /**
     * Sets the value of the listOfParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfParameters }
     *     
     */
    public void setListOfParameters(ListOfParameters value) {
        this.listOfParameters = value;
    }

    /**
     * Gets the value of the timeUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeUnits() {
        return timeUnits;
    }

    /**
     * Sets the value of the timeUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeUnits(String value) {
        this.timeUnits = value;
    }

    /**
     * Gets the value of the substanceUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstanceUnits() {
        return substanceUnits;
    }

    /**
     * Sets the value of the substanceUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstanceUnits(String value) {
        this.substanceUnits = value;
    }

}
