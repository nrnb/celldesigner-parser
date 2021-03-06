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


package org.sbml.sbml.level2.version4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.sbml._2001.ns.celldesigner.ReactionAnnotationType;


// TODO: Auto-generated Javadoc
/**
 * Redefined reaction.
 * 
 * <p>Java class for Reaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reaction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sbml.org/sbml/level2/version4}Reaction">
 *       &lt;redefine>
 *         &lt;complexType name="Reaction">
 *           &lt;complexContent>
 *             &lt;extension base="{http://www.sbml.org/sbml/level2/version4}SBase">
 *               &lt;sequence>
 *                 &lt;element name="listOfReactants" type="{http://www.sbml.org/sbml/level2/version4}ListOfSpeciesReferences" minOccurs="0"/>
 *                 &lt;element name="listOfProducts" type="{http://www.sbml.org/sbml/level2/version4}ListOfSpeciesReferences" minOccurs="0"/>
 *                 &lt;element name="listOfModifiers" type="{http://www.sbml.org/sbml/level2/version4}ListOfModifierSpeciesReferences" minOccurs="0"/>
 *                 &lt;element name="kineticLaw" type="{http://www.sbml.org/sbml/level2/version4}KineticLaw" minOccurs="0"/>
 *               &lt;/sequence>
 *               &lt;attribute name="id" use="required" type="{http://www.sbml.org/sbml/level2/version4}SId" />
 *               &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;attribute name="reversible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *               &lt;attribute name="fast" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *             &lt;/extension>
 *           &lt;/complexContent>
 *         &lt;/complexType>
 *       &lt;/redefine>
 *       &lt;sequence>
 *         &lt;element name="annotation" type="{http://www.sbml.org/2001/ns/celldesigner}reactionAnnotationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reaction", propOrder = {
    "annotation"
})
public class Reaction
    extends OriginalReaction
{

    /** The annotation. */
    protected ReactionAnnotationType annotation;

    /**
     * Gets the value of the annotation property.
     * 
     * @return
     *     possible object is
     *     {@link ReactionAnnotationType }
     *     
     */
    public ReactionAnnotationType getAnnotation() {
        return annotation;
    }

    /**
     * Sets the value of the annotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactionAnnotationType }
     *     
     */
    public void setAnnotation(ReactionAnnotationType value) {
        this.annotation = value;
    }

}
