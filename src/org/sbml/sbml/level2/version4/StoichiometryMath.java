//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.24 at 04:07:29 PM JST 
//


package org.sbml.sbml.level2.version4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3._1998.math.mathml.Math;


/**
 * <p>Java class for StoichiometryMath complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoichiometryMath">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sbml.org/sbml/level2/version4}SBase">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/1998/Math/MathML}math"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoichiometryMath", propOrder = {
    "math"
})
public class StoichiometryMath
    extends SBase
{

    @XmlElement(namespace = "http://www.w3.org/1998/Math/MathML", required = true)
    protected Math math;

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

}
