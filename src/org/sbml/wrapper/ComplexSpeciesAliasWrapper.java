/*******************************************************************************
 * Copyright 2016 Kaito Ii
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
/*
 * 
 */
package org.sbml.wrapper;

import java.math.BigDecimal;
import java.util.List;

import org.sbml._2001.ns.celldesigner.ComplexSpeciesAlias;
import org.sbml._2001.ns.celldesigner.ListOfSpeciesTag;
import org.sbml._2001.ns.celldesigner.SpeciesTag;
import org.sbml.jsbml.ext.layout.SpeciesGlyph;

// TODO: Auto-generated Javadoc
/**
 * The Class ComplexSpeciesAliasWrapper.
 *
 * @author Kaito Ii
 * 
 * Date Created: Jun 20, 2016
 */

public class ComplexSpeciesAliasWrapper extends ComplexSpeciesAlias {
	
	/** The complex species alias. */
	private ComplexSpeciesAlias complexSpeciesAlias;
	
	/** The model wrapper. */
	private ModelWrapper modelWrapper;
	
	/** The h. */
	private double H;
	
	/** The w. */
	private double W;
	
	/** The x. */
	private double X;
	
	/** The y. */
	private double Y;
	
	/** The species wrapper. */
	private SpeciesWrapper speciesWrapper;
	
	/** The compartment alias wrapper. */
	private CompartmentAliasWrapper compartmentAliasWrapper;
	
	/** The species tags. */
	private List<SpeciesTag> speciesTags;
	
	/**
	 * Instantiates a new complex species alias wrapper.
	 *
	 * @param complexSpeciesAlias the complex species alias
	 * @param modelWrapper the model wrapper
	 */
	public ComplexSpeciesAliasWrapper(ComplexSpeciesAlias complexSpeciesAlias, ModelWrapper modelWrapper){
		this.modelWrapper = modelWrapper;
		this.complexSpeciesAlias = complexSpeciesAlias;
		this.activity = complexSpeciesAlias.getActivity();
		this.bounds = complexSpeciesAlias.getBounds();
		this.briefView = complexSpeciesAlias.getBriefView();
		this.id = complexSpeciesAlias.getId();
		this.info = complexSpeciesAlias.getInfo();
		this.structuralState = complexSpeciesAlias.getStructuralState();
		this.usualView = complexSpeciesAlias.getUsualView();
		this.compartmentAlias = complexSpeciesAlias.getCompartmentAlias();
		this.compartmentAliasWrapper = modelWrapper.getCompartmentAliasWrapperByCompartmentId(complexSpeciesAlias.getCompartmentAlias());
		this.speciesWrapper = modelWrapper.getSpeciesWrapperById(complexSpeciesAlias.getSpecies());
		this.view = complexSpeciesAlias.getView();
		this.species = complexSpeciesAlias.getSpecies();
		
		this.listOfSpeciesTag = complexSpeciesAlias.getListOfSpeciesTag();
		if(listOfSpeciesTag != null)
			this.speciesTags = listOfSpeciesTag.getSpeciesTag();
		

		this.H = bounds.getH().doubleValue();
		this.W = bounds.getW().doubleValue();
		this.X = bounds.getX().doubleValue();
		this.Y = bounds.getY().doubleValue();
	}
	
	/**
	 * Instantiates a new complex species alias wrapper.
	 *
	 * @param sg the sg
	 * @param modelWrapper the model wrapper
	 */
	//TODO 
	public ComplexSpeciesAliasWrapper(SpeciesGlyph sg, ModelWrapper modelWrapper){
		this.modelWrapper = modelWrapper;
		complexSpeciesAlias = new ComplexSpeciesAlias();
		//modelWrapper.addComplexSpeciesAlias(complexSpeciesAlias);
	}
	
	
	/**
	 * Gets the h.
	 *
	 * @return double
	 * TODO
	 */
	public double getH(){
		return H;
	}

	/**
	 * Sets the h.
	 *
	 * @param h void
	 * TODO
	 */
	public void setH(double h){
		bounds.setH(new BigDecimal(h));
		this.H = h;
	}
	
	/**
	 * Gets the w.
	 *
	 * @return double
	 * TODO
	 */
	public double getW(){
		return W;
	}

	/**
	 * Sets the w.
	 *
	 * @param w void
	 * TODO
	 */
	public void setW(double w){
		bounds.setW(new BigDecimal(w));
		this.W = w;
	}
	
	/**
	 * Gets the x.
	 *
	 * @return double
	 * TODO
	 */
	public double getX(){
		return X;
	}
	
	/**
	 * Sets the x.
	 *
	 * @param x void
	 * TODO
	 */
	public void setX(double x){
		bounds.setX(new BigDecimal(x));
		this.X = x;
	}
	
	/**
	 * Gets the y.
	 *
	 * @return double
	 * TODO
	 */
	public double getY(){
		return Y;
	}
	
	/**
	 * Sets the y.
	 *
	 * @param y void
	 * TODO
	 */
	public void setY(double y){
		bounds.setY(new BigDecimal(y));
		this.Y = y;
	}
	

	/**
	 * Gets the list of species tags.
	 *
	 * @return List<SpeciesTag>
	 * TODO
	 */
	public List<SpeciesTag> getListOfSpeciesTags() {
        return speciesTags;
    }

	/**
	 * Sets the list of species tags.
	 *
	 * @param value void
	 * TODO
	 */
    public void setListOfSpeciesTags(ListOfSpeciesTag value) {
        this.listOfSpeciesTag = value;
    }

    /**
     * Gets the complex species aliased.
     *
     * @return ComplexSpeciesAlias
     * TODO
     */
    public ComplexSpeciesAlias getComplexSpeciesAliased() {
        return complexSpeciesAlias;
    }

	/**
	 * @return the speciesWrapper
	 */
	public SpeciesWrapper getSpeciesWrapper() {
		return speciesWrapper;
	}

	/**
	 * @param speciesWrapper the speciesWrapper to set
	 */
	public void setSpeciesWrapper(SpeciesWrapper speciesWrapper) {
		this.speciesWrapper = speciesWrapper;
	}

	/**
	 * @return the compartmentAliasWrapper
	 */
	public CompartmentAliasWrapper getCompartmentAliasWrapper() {
		return compartmentAliasWrapper;
	}

	/**
	 * @param compartmentAliasWrapper the compartmentAliasWrapper to set
	 */
	public void setCompartmentAliasWrapper(
			CompartmentAliasWrapper compartmentAliasWrapper) {
		this.compartmentAliasWrapper = compartmentAliasWrapper;
	}

	/**
	 * @return the modelWrapper
	 */
	public ModelWrapper getModelWrapper() {
		return modelWrapper;
	}
	
}
