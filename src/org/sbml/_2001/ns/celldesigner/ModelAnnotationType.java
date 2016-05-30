//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.30 at 07:47:34 PM JST 
//


package org.sbml._2001.ns.celldesigner;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Annotation for model.
 * 
 * <p>Java class for modelAnnotationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modelAnnotationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extension">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.sbml.org/2001/ns/celldesigner}modelVersion"/>
 *                   &lt;element name="modelDisplay" type="{http://www.sbml.org/2001/ns/celldesigner}modelDisplay"/>
 *                   &lt;element name="listOfIncludedSpecies" type="{http://www.sbml.org/2001/ns/celldesigner}listOfIncludedSpecies" minOccurs="0"/>
 *                   &lt;element name="listOfCompartmentAliases" type="{http://www.sbml.org/2001/ns/celldesigner}listOfCompartmentAliases"/>
 *                   &lt;element name="listOfComplexSpeciesAliases" type="{http://www.sbml.org/2001/ns/celldesigner}listOfComplexSpeciesAliases"/>
 *                   &lt;element name="listOfSpeciesAliases" type="{http://www.sbml.org/2001/ns/celldesigner}listOfSpeciesAliases"/>
 *                   &lt;element name="listOfGroups" type="{http://www.sbml.org/2001/ns/celldesigner}listOfGroups"/>
 *                   &lt;element name="listOfProteins" type="{http://www.sbml.org/2001/ns/celldesigner}listOfProteins"/>
 *                   &lt;element name="listOfGenes" type="{http://www.sbml.org/2001/ns/celldesigner}listOfGenes"/>
 *                   &lt;element name="listOfRNAs" type="{http://www.sbml.org/2001/ns/celldesigner}listOfRNAs"/>
 *                   &lt;element name="listOfAntisenseRNAs" type="{http://www.sbml.org/2001/ns/celldesigner}listOfAntisenseRNAs"/>
 *                   &lt;element name="listOfLayers" type="{http://www.sbml.org/2001/ns/celldesigner}listOfLayers" minOccurs="0"/>
 *                   &lt;element name="listOfBlockDiagrams" type="{http://www.sbml.org/2001/ns/celldesigner}listOfBlockDiagrams" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modelAnnotationType", propOrder = {
    "extension"
})
public class ModelAnnotationType {

    @XmlElement(required = true)
    protected ModelAnnotationType.Extension extension;

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ModelAnnotationType.Extension }
     *     
     */
    public ModelAnnotationType.Extension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelAnnotationType.Extension }
     *     
     */
    public void setExtension(ModelAnnotationType.Extension value) {
        this.extension = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.sbml.org/2001/ns/celldesigner}modelVersion"/>
     *         &lt;element name="modelDisplay" type="{http://www.sbml.org/2001/ns/celldesigner}modelDisplay"/>
     *         &lt;element name="listOfIncludedSpecies" type="{http://www.sbml.org/2001/ns/celldesigner}listOfIncludedSpecies" minOccurs="0"/>
     *         &lt;element name="listOfCompartmentAliases" type="{http://www.sbml.org/2001/ns/celldesigner}listOfCompartmentAliases"/>
     *         &lt;element name="listOfComplexSpeciesAliases" type="{http://www.sbml.org/2001/ns/celldesigner}listOfComplexSpeciesAliases"/>
     *         &lt;element name="listOfSpeciesAliases" type="{http://www.sbml.org/2001/ns/celldesigner}listOfSpeciesAliases"/>
     *         &lt;element name="listOfGroups" type="{http://www.sbml.org/2001/ns/celldesigner}listOfGroups"/>
     *         &lt;element name="listOfProteins" type="{http://www.sbml.org/2001/ns/celldesigner}listOfProteins"/>
     *         &lt;element name="listOfGenes" type="{http://www.sbml.org/2001/ns/celldesigner}listOfGenes"/>
     *         &lt;element name="listOfRNAs" type="{http://www.sbml.org/2001/ns/celldesigner}listOfRNAs"/>
     *         &lt;element name="listOfAntisenseRNAs" type="{http://www.sbml.org/2001/ns/celldesigner}listOfAntisenseRNAs"/>
     *         &lt;element name="listOfLayers" type="{http://www.sbml.org/2001/ns/celldesigner}listOfLayers" minOccurs="0"/>
     *         &lt;element name="listOfBlockDiagrams" type="{http://www.sbml.org/2001/ns/celldesigner}listOfBlockDiagrams" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "modelVersion",
        "modelDisplay",
        "listOfIncludedSpecies",
        "listOfCompartmentAliases",
        "listOfComplexSpeciesAliases",
        "listOfSpeciesAliases",
        "listOfGroups",
        "listOfProteins",
        "listOfGenes",
        "listOfRNAs",
        "listOfAntisenseRNAs",
        "listOfLayers",
        "listOfBlockDiagrams"
    })
    public static class Extension {

        @XmlElement(required = true)
        protected BigDecimal modelVersion;
        @XmlElement(required = true)
        protected ModelDisplay modelDisplay;
        protected ListOfIncludedSpecies listOfIncludedSpecies;
        @XmlElement(required = true)
        protected ListOfCompartmentAliases listOfCompartmentAliases;
        @XmlElement(required = true)
        protected ListOfComplexSpeciesAliases listOfComplexSpeciesAliases;
        @XmlElement(required = true)
        protected ListOfSpeciesAliases listOfSpeciesAliases;
        @XmlElement(required = true)
        protected ListOfGroups listOfGroups;
        @XmlElement(required = true)
        protected ListOfProteins listOfProteins;
        @XmlElement(required = true)
        protected ListOfGenes listOfGenes;
        @XmlElement(required = true)
        protected ListOfRNAs listOfRNAs;
        @XmlElement(required = true)
        protected ListOfAntisenseRNAs listOfAntisenseRNAs;
        protected ListOfLayers listOfLayers;
        protected ListOfBlockDiagrams listOfBlockDiagrams;

        /**
         * Gets the value of the modelVersion property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getModelVersion() {
            return modelVersion;
        }

        /**
         * Sets the value of the modelVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setModelVersion(BigDecimal value) {
            this.modelVersion = value;
        }

        /**
         * Gets the value of the modelDisplay property.
         * 
         * @return
         *     possible object is
         *     {@link ModelDisplay }
         *     
         */
        public ModelDisplay getModelDisplay() {
            return modelDisplay;
        }

        /**
         * Sets the value of the modelDisplay property.
         * 
         * @param value
         *     allowed object is
         *     {@link ModelDisplay }
         *     
         */
        public void setModelDisplay(ModelDisplay value) {
            this.modelDisplay = value;
        }

        /**
         * Gets the value of the listOfIncludedSpecies property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfIncludedSpecies }
         *     
         */
        public ListOfIncludedSpecies getListOfIncludedSpecies() {
            return listOfIncludedSpecies;
        }

        /**
         * Sets the value of the listOfIncludedSpecies property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfIncludedSpecies }
         *     
         */
        public void setListOfIncludedSpecies(ListOfIncludedSpecies value) {
            this.listOfIncludedSpecies = value;
        }

        /**
         * Gets the value of the listOfCompartmentAliases property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfCompartmentAliases }
         *     
         */
        public ListOfCompartmentAliases getListOfCompartmentAliases() {
            return listOfCompartmentAliases;
        }

        /**
         * Sets the value of the listOfCompartmentAliases property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfCompartmentAliases }
         *     
         */
        public void setListOfCompartmentAliases(ListOfCompartmentAliases value) {
            this.listOfCompartmentAliases = value;
        }

        /**
         * Gets the value of the listOfComplexSpeciesAliases property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfComplexSpeciesAliases }
         *     
         */
        public ListOfComplexSpeciesAliases getListOfComplexSpeciesAliases() {
            return listOfComplexSpeciesAliases;
        }

        /**
         * Sets the value of the listOfComplexSpeciesAliases property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfComplexSpeciesAliases }
         *     
         */
        public void setListOfComplexSpeciesAliases(ListOfComplexSpeciesAliases value) {
            this.listOfComplexSpeciesAliases = value;
        }

        /**
         * Gets the value of the listOfSpeciesAliases property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfSpeciesAliases }
         *     
         */
        public ListOfSpeciesAliases getListOfSpeciesAliases() {
            return listOfSpeciesAliases;
        }

        /**
         * Sets the value of the listOfSpeciesAliases property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfSpeciesAliases }
         *     
         */
        public void setListOfSpeciesAliases(ListOfSpeciesAliases value) {
            this.listOfSpeciesAliases = value;
        }

        /**
         * Gets the value of the listOfGroups property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfGroups }
         *     
         */
        public ListOfGroups getListOfGroups() {
            return listOfGroups;
        }

        /**
         * Sets the value of the listOfGroups property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfGroups }
         *     
         */
        public void setListOfGroups(ListOfGroups value) {
            this.listOfGroups = value;
        }

        /**
         * Gets the value of the listOfProteins property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfProteins }
         *     
         */
        public ListOfProteins getListOfProteins() {
            return listOfProteins;
        }

        /**
         * Sets the value of the listOfProteins property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfProteins }
         *     
         */
        public void setListOfProteins(ListOfProteins value) {
            this.listOfProteins = value;
        }

        /**
         * Gets the value of the listOfGenes property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfGenes }
         *     
         */
        public ListOfGenes getListOfGenes() {
            return listOfGenes;
        }

        /**
         * Sets the value of the listOfGenes property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfGenes }
         *     
         */
        public void setListOfGenes(ListOfGenes value) {
            this.listOfGenes = value;
        }

        /**
         * Gets the value of the listOfRNAs property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfRNAs }
         *     
         */
        public ListOfRNAs getListOfRNAs() {
            return listOfRNAs;
        }

        /**
         * Sets the value of the listOfRNAs property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfRNAs }
         *     
         */
        public void setListOfRNAs(ListOfRNAs value) {
            this.listOfRNAs = value;
        }

        /**
         * Gets the value of the listOfAntisenseRNAs property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfAntisenseRNAs }
         *     
         */
        public ListOfAntisenseRNAs getListOfAntisenseRNAs() {
            return listOfAntisenseRNAs;
        }

        /**
         * Sets the value of the listOfAntisenseRNAs property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfAntisenseRNAs }
         *     
         */
        public void setListOfAntisenseRNAs(ListOfAntisenseRNAs value) {
            this.listOfAntisenseRNAs = value;
        }

        /**
         * Gets the value of the listOfLayers property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfLayers }
         *     
         */
        public ListOfLayers getListOfLayers() {
            return listOfLayers;
        }

        /**
         * Sets the value of the listOfLayers property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfLayers }
         *     
         */
        public void setListOfLayers(ListOfLayers value) {
            this.listOfLayers = value;
        }

        /**
         * Gets the value of the listOfBlockDiagrams property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfBlockDiagrams }
         *     
         */
        public ListOfBlockDiagrams getListOfBlockDiagrams() {
            return listOfBlockDiagrams;
        }

        /**
         * Sets the value of the listOfBlockDiagrams property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfBlockDiagrams }
         *     
         */
        public void setListOfBlockDiagrams(ListOfBlockDiagrams value) {
            this.listOfBlockDiagrams = value;
        }

    }

}
