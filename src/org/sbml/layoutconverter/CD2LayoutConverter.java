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
package org.sbml.layoutconverter;

import java.awt.geom.Point2D;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import org.sbml._2001.ns.celldesigner.BaseProduct;
import org.sbml._2001.ns.celldesigner.BaseReactant;
import org.sbml._2001.ns.celldesigner.LinkTarget;
import org.sbml._2001.ns.celldesigner.Modification;
import org.sbml._2001.ns.celldesigner.ProductLink;
import org.sbml._2001.ns.celldesigner.ReactantLink;
import org.sbml.extconverter.FBCConverter;
import org.sbml.extconverter.MultiConverter;
import org.sbml.jsbml.ListOf;
import org.sbml.jsbml.Reaction;
import org.sbml.jsbml.SBMLException;
import org.sbml.jsbml.SBMLWriter;
import org.sbml.jsbml.ext.layout.BoundingBox;
import org.sbml.jsbml.ext.layout.CompartmentGlyph;
import org.sbml.jsbml.ext.layout.Curve;
import org.sbml.jsbml.ext.layout.CurveSegment;
import org.sbml.jsbml.ext.layout.Dimensions;
import org.sbml.jsbml.ext.layout.LayoutConstants;
import org.sbml.jsbml.ext.layout.LayoutModelPlugin;
import org.sbml.jsbml.ext.layout.LineSegment;
import org.sbml.jsbml.ext.layout.Point;
import org.sbml.jsbml.ext.layout.ReactionGlyph;
import org.sbml.jsbml.ext.layout.SpeciesGlyph;
import org.sbml.jsbml.ext.layout.SpeciesReferenceGlyph;
import org.sbml.jsbml.ext.layout.SpeciesReferenceRole;
import org.sbml.jsbml.ext.layout.TextGlyph;
import org.sbml.wrapper.CompartmentAliasWrapper;
import org.sbml.wrapper.CompartmentWrapper;
import org.sbml.wrapper.ComplexSpeciesAliasWrapper;
import org.sbml.wrapper.ModelWrapper;
import org.sbml.wrapper.ObjectFactory;
import org.sbml.wrapper.ReactionWrapper;
import org.sbml.wrapper.SpeciesAliasWrapper;

// TODO: Auto-generated Javadoc
/**
 * The Class CD2LayoutConverter.
 *
 * @author Kaito Ii
 * 
 * Date Created: Jun 26, 2016
 */

public class CD2LayoutConverter extends BaseLayoutConverter {

	/**
	 * Instantiates a new CD 2 layout converter.
	 *
	 * @param file the file
	 * @throws XMLStreamException the XML stream exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws JAXBException the JAXB exception
	 */
	public CD2LayoutConverter(File file) throws XMLStreamException, IOException, JAXBException {
		super(file);
		init(file);
	}
	
	/**
	 * Instantiates a new CD 2 layout converter.
	 *
	 * @param file the file
	 * @param outputFileName the output file name
	 * @throws XMLStreamException the XML stream exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws JAXBException the JAXB exception
	 */
	public CD2LayoutConverter(File file, String outputFileName) throws XMLStreamException, IOException, JAXBException {
		super(file, outputFileName);
		init(file);
	}


	/**
	 * Instantiates a new CD 2 layout converter.
	 *
	 * @param file the file
	 * @param defaultCompartment the default compartment
	 * @param outputFileName the output file name
	 * @throws XMLStreamException the XML stream exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws JAXBException the JAXB exception
	 */
	public CD2LayoutConverter(File file, boolean defaultCompartment, String outputFileName) throws XMLStreamException, IOException, JAXBException {
		super(file, defaultCompartment, outputFileName);
		init(file);
	}

	/**
	 * Instantiates a new CD 2 layout converter.
	 *
	 * @param file the file
	 * @param defaultCompartment the default compartment
	 * @throws XMLStreamException the XML stream exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws JAXBException the JAXB exception
	 */
	public CD2LayoutConverter(File file, boolean defaultCompartment) throws XMLStreamException, IOException, JAXBException {
		super(file, defaultCompartment);
		init(file);
	}

	/**
	 * Instantiates a new CD 2 layout converter.
	 *
	 * @param file the file
	 * @param options the options
	 * @throws XMLStreamException the XML stream exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws JAXBException the JAXB exception
	 */
	public CD2LayoutConverter(File file, ApplicationOption options) throws XMLStreamException, IOException, JAXBException {
		super(file, options);
		convert2FBC = options.isConvert2FBC();
		init(file);
	}

	/**
	 * Inits the.
	 *
	 * @param file the file
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws JAXBException the JAXB exception
	 * @throws XMLStreamException the XML stream exception
	 */
	public void init(File file) throws IOException, JAXBException, XMLStreamException{
		if (!SBMLUtil.isSetCellDesignerNameSpace(document))
			throw new IOException("Missing CellDesigner Namespace");
		if(!SBMLUtil.isLevelAndVersionMatchWithCD(file))
			throw new IOException("Level and Version does not match the CellDesigner defaults Level "  + SBMLUtil.DEFAULT_CELLDESIGNER_SBML_LEVEL + " Version " + SBMLUtil.DEFAULT_CELLDESIGNER_SBML_VERSION);
		
		document = SBMLLevelandVersionHandler.upgrade(document);

		mWrapper = ObjectFactory.unmarshalSBML(file);
		model = document.getModel();
		LayoutModelPlugin mplugin = (LayoutModelPlugin) model.getPlugin(LayoutConstants.shortLabel);
		layout = mplugin.createLayout();
	}
	
	/**
	 * Convert.
	 */
	/* (non-Javadoc)
	 * @see org.sbml.layoutconverter.abstractLayoutConverter#convert()
	 */
	@Override
	public void convert() {
		convertModelToLayout(mWrapper);
		convertCompartmentsToLayout(mWrapper.getListOfCompartmentAliasWrapper());
		convertComplexAliasToLayout(mWrapper.getListOfComplexSpeciesAliasWrapper());
		convertSpeciesAliasToLayout(mWrapper.getListOfSpeciesAliasWrapper());
		convertReactionsToLayout(mWrapper.getListOfReactionWrapper());
		
		if(convert2FBC){
			FBCConverter fbcConverter = new FBCConverter(model, mWrapper);
			fbcConverter.convert();
		}
		
		if(convert2Multi){
			MultiConverter multiConverter = new MultiConverter(model, mWrapper);
			multiConverter.convert();
		}
	}

	/**
	 * Convert model to layout.
	 *
	 * @param mWrapper
	 *            void TODO
	 */
	public void convertModelToLayout(ModelWrapper mWrapper) {
		layout.setId("Layout_" + model.getId());
		layout.createDimensions(mWrapper.getW(), mWrapper.getH(), 1d);
	}

	/**
	 * Convert compartments to layout.
	 *
	 * @param cawList
	 *            the caw list
	 */
	public void convertCompartmentsToLayout(List<CompartmentAliasWrapper> cawList) {
		if (convertDefaultCompartment)
			convertDefaultCompartment();

		cawList = ModelWrapper.reorderCompartmentAccordingToPosition(cawList);

		for (CompartmentAliasWrapper caw : cawList) {
			CompartmentGlyph cg = layout.createCompartmentGlyph("CompartmentGlyph_" + caw.getId());
			cg.setCompartment(caw.getCompartment());
			BoundingBox bb = cg.createBoundingBox();
			Dimensions dimension = bb.createDimensions();
			dimension.setWidth(caw.getW());
			dimension.setHeight(caw.getH());
			dimension.setDepth(1d);
			Point point = bb.createPosition();
			point.setX(caw.getX());
			point.setY(caw.getY());
			point.setZ(0d);

			TextGlyph tg = layout.createTextGlyph("TextGlyph_" + caw.getId());
			tg.setOriginOfText(caw.getCompartment());
			tg.setGraphicalObject(cg);
			BoundingBox bb2 = tg.createBoundingBox();
			Dimensions dimension2 = bb2.createDimensions();
			dimension2.setWidth(caw.getId().length() * 3);
			dimension2.setHeight(10);
			dimension.setDepth(1d);
			Point point2 = bb2.createPosition();
			point2.setX(caw.getNameX());
			point2.setY(caw.getNameY());
			point2.setZ(0d);
		}
	}

	/**
	 * Convert default compartment.
	 */
	public void convertDefaultCompartment() {
		CompartmentWrapper cw = mWrapper.getCompartmentWrapperById("default");
		if (cw != null) {
			CompartmentGlyph cg = layout.createCompartmentGlyph("CompartmentGlyph_" + cw.getId());
			cg.setCompartment(cw.getId());
			BoundingBox bb = cg.createBoundingBox();
			Dimensions dimension = bb.createDimensions();
			dimension.setWidth(mWrapper.getW());
			dimension.setHeight(mWrapper.getH());
			dimension.setDepth(1d);
			bb.createPosition(0, 0, 0);

			TextGlyph tg = layout.createTextGlyph("TextGlyph_" + cw.getId());
			tg.setOriginOfText(cw.getId());
			tg.setGraphicalObject(cg);
			BoundingBox bb2 = tg.createBoundingBox();
			
			Dimensions dimension2 = bb2.createDimensions();
			dimension2.setWidth(cw.getId().length() * 3);
			dimension2.setHeight(10);
			dimension.setDepth(1d);
			Point point2 = bb2.createPosition();
			point2.setX(mWrapper.getW() / 2 - cw.getId().length() * 3 / 2);
			point2.setY(mWrapper.getH() - 10);
			point2.setZ(0d);
		}
	}

	/**
	 * Convert reactions to layout.
	 *
	 * @param rList
	 *            void TODO
	 */
	public void convertReactionsToLayout(List<ReactionWrapper> rList) {
		for (ReactionWrapper rw : rList) {
			ReactionGlyph rg = layout.createReactionGlyph("ReactionGlyph_" + rw.getId());
			rg.setReference(rw.getId());
			ListOf<SpeciesReferenceGlyph> srgList = createSpeciesReferenceGlyph(rg, rw);
			List<BaseReactant> brsList = rw.getBaseReactants();
			List<BaseProduct> prsList = rw.getBaseProducts();
			List<Point2D.Double> editPointList = rw.getEditPointsAsList();
			int rectangleIndex = rw.getRectangleIndex();
			List<LineSegment> lsList = null;
			Point centerPoint = new Point();
			
			BoundingBox reactionBB = rg.createBoundingBox();
			double xmin = Integer.MAX_VALUE, xmax = Integer.MIN_VALUE, ymin = Integer.MAX_VALUE, ymax = Integer.MIN_VALUE;
			
			for(SpeciesReferenceGlyph srg : srgList){
				Point position = srg.getBoundingBox().getPosition();
				Dimensions dim = srg.getBoundingBox().getDimensions();
				
				if(xmin > position.getX())
					xmin = position.getX();
				
				if(ymin > position.getY())
					ymin = position.getY();
				
				if(xmax < position.getX() + dim.getWidth())
					xmax = position.getX() + dim.getWidth();
				
				if(ymax < position.getY() + dim.getHeight())
					ymax = position.getY() + dim.getHeight();
			}
			Dimensions dim = new Dimensions(SBMLUtil.DEFAULT_SBML_LEVEL, SBMLUtil.DEFAULT_SBML_VERSION);
			dim.setWidth(xmax - xmin);
			dim.setHeight(ymax - ymin);
			reactionBB.setDimensions(dim);
			reactionBB.setPosition(new Point(xmin, ymin));		
			
			if (brsList.size() == 1 && prsList.size() == 1) {
				BaseReactant br = brsList.get(0);
				BaseProduct bp = prsList.get(0);
				SpeciesReferenceGlyph srg1 = srgList.get("srGlyphReactant_" + rg.getReaction() + "_" + br.getSpecies());
				SpeciesReferenceGlyph srg2 = srgList.get("srGlyphProduct_" + rg.getReaction() + "_" + bp.getSpecies());

				Point startPoint = LayoutUtil.createAdjustedPoint(srg1, br.getLinkAnchor().getPosition());
				Point endPoint = LayoutUtil.createAdjustedPoint(srg2, bp.getLinkAnchor().getPosition());
				Point reactantPoint = LayoutUtil.createCenterPoint(srg1);
				Point productPoint = LayoutUtil.createCenterPoint(srg2);
				lsList = LayoutUtil.createListOfLineSegment(startPoint,
						endPoint, reactantPoint, productPoint, editPointList, rectangleIndex);

				Curve curve = srg1.createCurve();
				for (int i = 0; i <= rectangleIndex; i++) {
					curve.addCurveSegment(lsList.get(i));
				}

				centerPoint = curve.getCurveSegment(rectangleIndex).getEnd().clone();
				
				curve = srg2.createCurve();
				for (int i = rectangleIndex + 1; i < lsList.size(); i++) {
					curve.addCurveSegment(lsList.get(i));
				}

			} else if (rw.getReactionType().equals("HETERODIMER_ASSOCIATION")) {
				BaseReactant br1 = brsList.get(0);
				SpeciesReferenceGlyph srg1 = srgList.get("srGlyphReactant_" + rg.getReaction() + "_" + br1.getSpecies());
				SpeciesGlyph sg1 = srg1.getSpeciesGlyphInstance();
				Point startPoint = LayoutUtil.createAdjustedPoint(sg1, br1.getLinkAnchor().getPosition());

				BaseReactant br2 = brsList.get(1);
				SpeciesReferenceGlyph srg2 = srgList.get("srGlyphReactant_" + rg.getReaction() + "_" + br2.getSpecies());
				SpeciesGlyph sg2 = srg2.getSpeciesGlyphInstance();
				Point endPoint1 = LayoutUtil.createAdjustedPoint(sg2, br2.getLinkAnchor().getPosition());

				BaseProduct bp1 = prsList.get(0);
				SpeciesReferenceGlyph srg3 = srgList.get("srGlyphProduct_" + rg.getReaction() + "_" + bp1.getSpecies());
				SpeciesGlyph sg3 = srg3.getSpeciesGlyphInstance();
				Point endPoint2 = LayoutUtil.createAdjustedPoint(sg3, bp1.getLinkAnchor().getPosition());

				Point reactantPoint1 = LayoutUtil.createCenterPoint(sg1);
				Point reactantPoint2 = LayoutUtil.createCenterPoint(sg2);
				Point productPoint1 = LayoutUtil.createCenterPoint(sg3);
				int num0 = rw.getEditPoints().getNum0();
				int num1 = rw.getEditPoints().getNum1();
				int num2 = rw.getEditPoints().getNum2();

				lsList = LayoutUtil.createListOfLineSegment(startPoint,
						endPoint1, endPoint2, reactantPoint1, reactantPoint2,
						productPoint1, editPointList, num0, num1, num2, rw.getReactionType(), rw.getEditPoints().getTShapeIndex());
				int reactant1 = num0;
				int reactant2 = num0 + num1 + 1;

				Curve curve = srg1.createCurve();
				for (int i = 0; i <= reactant1; i++) {
					curve.addCurveSegment(lsList.get(i));
				}

				curve = srg2.createCurve();
				for (int i = reactant1 + 1; i <= reactant2; i++) {
					curve.addCurveSegment(lsList.get(i));
				}

				curve = srg3.createCurve();
				for (int i = reactant2 + 1; i < lsList.size(); i++) {
					curve.addCurveSegment(lsList.get(i));
				}

				int tshapeIndex = rw.getEditPoints().getTShapeIndex();
				LineSegment ls = (LineSegment) curve.getCurveSegment(tshapeIndex);
				centerPoint = ls.getStart().clone();

			} else if (rw.getReactionType().equals("DISSOCIATION")
					|| rw.getReactionType().equals("TRUNCATION")) { 
				BaseReactant br1 = brsList.get(0);
				SpeciesReferenceGlyph srg1 = srgList.get("srGlyphReactant_" + rg.getReaction() + "_" + br1.getSpecies());
				Point startPoint = LayoutUtil.createAdjustedPoint(srg1, br1.getLinkAnchor().getPosition());
				
				BaseProduct bp1 = prsList.get(0);
				SpeciesReferenceGlyph srg2 = srgList.get("srGlyphProduct_" + rg.getReaction() + "_" + bp1.getSpecies());
				Point endPoint1 = LayoutUtil.createAdjustedPoint(srg2, bp1.getLinkAnchor().getPosition());

				BaseProduct bp2 = prsList.get(1);
				SpeciesReferenceGlyph srg3 = srgList.get("srGlyphProduct_" + rg.getReaction() + "_" + bp2.getSpecies());
				Point endPoint2 = LayoutUtil.createAdjustedPoint(srg3, bp2.getLinkAnchor().getPosition());

				Point reactantPoint = LayoutUtil.createCenterPoint(srg1);
				Point productPoint1 = LayoutUtil.createCenterPoint(srg2);
				Point productPoint2 = LayoutUtil.createCenterPoint(srg3);

				int num0 = rw.getEditPoints().getNum0();
				int num1 = rw.getEditPoints().getNum1();
				int num2 = rw.getEditPoints().getNum2();

				lsList = LayoutUtil.createListOfLineSegment(startPoint,
						endPoint1, endPoint2, reactantPoint, productPoint1,
						productPoint2, editPointList, num0, num1, num2, rw.getReactionType(), rw.getEditPoints().getTShapeIndex());
				int reactant1 = num0 ;
				int reactant2 = num0 + num1 + 1;

				Curve curve = srg1.createCurve();
				for (int i = 0; i <= reactant1; i++) {
					curve.addCurveSegment(lsList.get(i));
				}

				curve = srg2.createCurve();
				for (int i = reactant1 + 1; i <= reactant2; i++) {
					curve.addCurveSegment(lsList.get(i));
				}

				curve = srg3.createCurve();
				for (int i = reactant2 + 1; i < lsList.size(); i++) {
					curve.addCurveSegment(lsList.get(i));
				}

				curve = srg1.getCurve();
				int tshapeIndex = rw.getEditPoints().getTShapeIndex();
				LineSegment ls = (LineSegment) curve.getCurveSegment(curve.getCurveSegmentCount() - tshapeIndex - 1);
				centerPoint = ls.getEnd().clone();
			}

			if (rw.isSetModifier()) {
				for (Modification m : rw.getListOfModification()) {
					if(m.getType().contains("BOOLEAN"))
						continue;
					editPointList = LayoutUtil.createEditPointsAsList(m.getEditPoints());

					SpeciesReferenceGlyph srg = rg.getSpeciesReferenceGlyph("srGlyphModifier_" + rg.getReaction() + "_" + m.getModifiers());
					SpeciesGlyph sg = srg.getSpeciesGlyphInstance();
					Point modifierPoint = LayoutUtil.createCenterPoint(sg);
					LinkTarget lt = rw.getLinkTargetByModifier(m);
					Point startPoint = LayoutUtil.createAdjustedPoint(sg, lt.getLinkAnchor().getPosition());
					List<LineSegment> lsList2 = LayoutUtil.createListOfLineSegment(startPoint, centerPoint,
									modifierPoint, centerPoint, editPointList);
					Curve curve = srg.createCurve();
					for (LineSegment ls : lsList2) {
						curve.addCurveSegment(ls);
					}
				}
			}

			List<ReactantLink> rlList = rw.getListOfReactantLinks();
			List<ProductLink> plList = rw.getListOfProductLinks();

			for (ReactantLink link : rlList) {
				String lineType = link.getLine().getType();
				SpeciesReferenceGlyph srg = srgList.get("srGlyphReactant_" + rg.getReaction() + "_" + link.getReactant());
				SpeciesGlyph sg = srg.getSpeciesGlyphInstance();
				String position = link.getLinkAnchor() != null ? link.getLinkAnchor().getPosition() : "INACTIVE" ;
				Point startPoint = LayoutUtil.createAdjustedPoint(sg, position);
				Point endPoint = centerPoint;
				
				editPointList = new ArrayList<Point2D.Double>();
				List<LineSegment> lsList2;
				
				if (lineType.equals("Curve")){
					lsList2 = LayoutUtil.createListOfBezier(startPoint, endPoint, lsList.get(rectangleIndex).getStart());
					
				} else if(rw.getReactionType().equals("HETERODIMER_ASSOCIATION")){
					int num0 = rw.getEditPoints().getNum0();
					int num1 = rw.getEditPoints().getNum1();
					int tshapeIndex = rw.getEditPoints().getTShapeIndex();

					Point linkPoint = LayoutUtil.createLinkPoint(lsList.get(num0 + 1 + num1 + 1 + tshapeIndex).getStart(), endPoint);		
					lsList2 = LayoutUtil.createListOfLineSegment(startPoint, linkPoint, editPointList);
			
				} else if(rw.getReactionType().equals("DISSOCIATION") || rw.getReactionType().equals("TRUNCATION")){
					int num0 = rw.getEditPoints().getNum0();
					int tshapeIndex = rw.getEditPoints().getTShapeIndex();
					Point linkPoint = LayoutUtil.createLinkPoint(lsList.get(num0 - tshapeIndex).getStart(), endPoint);		
					lsList2 = LayoutUtil.createListOfLineSegment(startPoint, linkPoint, editPointList);
			
				} else {
					Point linkPoint = LayoutUtil.createLinkPoint(lsList.get(rectangleIndex).getStart(), endPoint);		
					lsList2 = LayoutUtil.createListOfLineSegment(startPoint, linkPoint, editPointList);
				}
				Curve curve = srg.createCurve();
				for (LineSegment ls : lsList2) {
					curve.addCurveSegment(ls);
				}
			}

			for (ProductLink link : plList) {
				String lineType = link.getLine().getType();
				SpeciesReferenceGlyph srg = srgList.get("srGlyphProduct_" + rg.getReaction() + "_" + link.getProduct());
				SpeciesGlyph sg = srg.getSpeciesGlyphInstance();
				String position = link.getLinkAnchor() != null ? link.getLinkAnchor().getPosition() : "INACTIVE" ;
				Point endPoint = LayoutUtil.createAdjustedPoint(sg, position);
				Point startPoint = centerPoint;
				editPointList = new ArrayList<Point2D.Double>();
				List<LineSegment> lsList2;
				
				if (lineType.equals("Curve")){
					lsList2 = LayoutUtil.createListOfBezier(startPoint, endPoint, lsList.get(rectangleIndex + 1).getEnd());
					
				} else if(rw.getReactionType().equals("HETERODIMER_ASSOCIATION")){
					int num0 = rw.getEditPoints().getNum0();
					int num1 = rw.getEditPoints().getNum1();
					int tshapeIndex = rw.getEditPoints().getTShapeIndex();

					Point linkPoint = LayoutUtil.createLinkPoint(lsList.get(num0 + 1 + num1 + 1 + tshapeIndex).getEnd(), startPoint);		
					lsList2 = LayoutUtil.createListOfLineSegment(linkPoint, endPoint, editPointList);
			
				} else if(rw.getReactionType().equals("DISSOCIATION") || rw.getReactionType().equals("TRUNCATION")){
					int num0 = rw.getEditPoints().getNum0();
					int tshapeIndex = rw.getEditPoints().getTShapeIndex();
					
					Point linkPoint = LayoutUtil.createLinkPoint(lsList.get(num0 - tshapeIndex).getEnd(), startPoint);		
					lsList2 = LayoutUtil.createListOfLineSegment(linkPoint, endPoint, editPointList);
			
				} else {
					Point linkPoint = LayoutUtil.createLinkPoint(lsList.get(rectangleIndex + 1).getEnd(), startPoint);
					lsList2 = LayoutUtil.createListOfLineSegment(linkPoint, endPoint, editPointList);
				}
				
				Curve curve = srg.createCurve();
				for (LineSegment ls : lsList2) {
					curve.addCurveSegment(ls);
				}
			}
			
			TextGlyph tg = layout.createTextGlyph("TextGlyph_" + rw.getId());
			tg.setOriginOfText(rw.getId());
			tg.setGraphicalObject(rg);
			BoundingBox bb = tg.createBoundingBox(20, 10, 1d);
			bb.setPosition(centerPoint);
		
			for(SpeciesReferenceGlyph srg : srgList){
				if(srg.getSpeciesReferenceRole() == SpeciesReferenceRole.PRODUCT){
					CurveSegment cs = (LineSegment) srg.getCurve().getListOfCurveSegments().getLast();
					cs.setEnd(LayoutUtil.adjustOverlappingEndPoint(cs, srg));
				}
			}
		}
	}

	/**
	 * Creates the species reference glyph.
	 *
	 * @param rg the rg
	 * @param rw the rw
	 * @return the list of
	 */
	public ListOf<SpeciesReferenceGlyph> createSpeciesReferenceGlyph(ReactionGlyph rg, ReactionWrapper rw) {
		Reaction reaction = (Reaction) rg.getReactionInstance();
		ListOf<SpeciesReferenceGlyph> srgList = rg.getListOfSpeciesReferenceGlyphs();
		List<BaseReactant> baseReactantList = rw.getBaseReactants();
		List<BaseProduct> baseProductList = rw.getBaseProducts();
		List<ReactantLink> reactantLinkList = rw.getListOfReactantLinks();
		List<ProductLink> productLinkList = rw.getListOfProductLinks();
		List<Modification> modificationList = rw.getListOfModification();
		
		for (BaseReactant br : baseReactantList) {
			SpeciesReferenceGlyph srg = rg.createSpeciesReferenceGlyph("srGlyphReactant_" + rg.getReaction() + "_" + br.getSpecies());
			if(SBMLUtil.containsReferencingSpecies(reaction.getListOfReactants(), br.getSpecies()))
				srg.setSpeciesReference(br.getSpecies());
			srg.setRole(SpeciesReferenceRole.SUBSTRATE);
			srg.setSpeciesGlyph("SpeciesGlyph_" + br.getAlias());
			srg.setBoundingBox(srg.getSpeciesGlyphInstance().getBoundingBox().clone());
		}

		for(ReactantLink link : reactantLinkList){
			SpeciesReferenceGlyph srg = rg.createSpeciesReferenceGlyph("srGlyphReactant_" + rg.getReaction() + "_" + link.getReactant());
			if(SBMLUtil.containsReferencingSpecies(reaction.getListOfReactants(), link.getReactant()))
				srg.setSpeciesReference(link.getReactant());
			srg.setRole(SpeciesReferenceRole.SUBSTRATE);
			srg.setSpeciesGlyph("SpeciesGlyph_" + link.getAlias());
			srg.setBoundingBox(srg.getSpeciesGlyphInstance().getBoundingBox().clone());			
		}
		
		for (BaseProduct bp : baseProductList) {
			SpeciesReferenceGlyph srg = rg.createSpeciesReferenceGlyph("srGlyphProduct_" + rg.getReaction() + "_" + bp.getSpecies());
			if(SBMLUtil.containsReferencingSpecies(reaction.getListOfProducts(), bp.getSpecies()))
				srg.setSpeciesReference(bp.getSpecies());
			srg.setRole(SpeciesReferenceRole.PRODUCT);
			srg.setSpeciesGlyph("SpeciesGlyph_" + bp.getAlias());
			srg.setBoundingBox(srg.getSpeciesGlyphInstance().getBoundingBox().clone());
		}

		for(ProductLink link : productLinkList){
			SpeciesReferenceGlyph srg = rg.createSpeciesReferenceGlyph("srGlyphProduct_" + rg.getReaction() + "_" + link.getProduct());
			if(SBMLUtil.containsReferencingSpecies(reaction.getListOfProducts(), link.getProduct()))
				srg.setSpeciesReference(link.getProduct());
			srg.setRole(SpeciesReferenceRole.PRODUCT);
			srg.setSpeciesGlyph("SpeciesGlyph_" + link.getAlias());
			srg.setBoundingBox(srg.getSpeciesGlyphInstance().getBoundingBox().clone());			
		}

		if (rw.isSetModifier()) {
			for (Modification m : modificationList) {
				if(m.getType().contains("BOOLEAN"))
					continue;
				SpeciesReferenceGlyph srg = rg.createSpeciesReferenceGlyph("srGlyphModifier_" + rg.getReaction() + "_" + m.getModifiers());
				srg.setSpeciesReference(m.getModifiers());
				srg.setSpeciesGlyph("SpeciesGlyph_" + m.getAliases());
				srg.setBoundingBox(srg.getSpeciesGlyphInstance().getBoundingBox().clone());
				String s = rw.getModifierTypeByModifierId(m.getModifiers());

				if (s.equals("CATALYSIS") || s.equals("UNKNOWN_CATALYSIS")) {
					srg.setRole(SpeciesReferenceRole.ACTIVATOR);
				} else if (s.equals("INHIBITION")
						|| s.equals("UNKNOWN_INHIBITION")) {
					srg.setRole(SpeciesReferenceRole.INHIBITOR);
				} else {
					srg.setRole(SpeciesReferenceRole.MODIFIER);
				}
			}
		}

		return srgList;
	}
	
	/**
	 * Convert species alias to layout.
	 *
	 * @param saList
	 *            void TODO
	 */
	public void convertSpeciesAliasToLayout(List<SpeciesAliasWrapper> saList) {
		for (SpeciesAliasWrapper saw : saList) {
			SpeciesGlyph sg = layout.createSpeciesGlyph("SpeciesGlyph_" + saw.getId());
			if (model.getSpecies(saw.getSpecies()) != null)
				sg.setReference(saw.getSpecies());

			BoundingBox bb = sg.createBoundingBox();
			Dimensions dimension = bb.createDimensions();
			dimension.setWidth(saw.getW());
			dimension.setHeight(saw.getH());
			dimension.setDepth(1d);
			bb.setDimensions(dimension);
			Point point = bb.createPosition();
			point.setX(saw.getX());
			point.setY(saw.getY());
			point.setZ(0d);
			bb.setPosition(point);

			TextGlyph tg = layout.createTextGlyph("TextGlyph_" + saw.getId());
			if (model.getSpecies(saw.getSpecies()) != null)
				tg.setReference(saw.getSpecies());
			else
				tg.setText(saw.getSpecies());

			tg.setGraphicalObject(sg);
			BoundingBox bb2 = tg.createBoundingBox();
			Dimensions dimension2 = bb2.createDimensions();
			dimension2.setWidth(saw.getId().length() * 3);
			dimension2.setHeight(10d);
			dimension.setDepth(1d);
			Point point2 = bb2.createPosition();
			point2.setX(saw.getX() + saw.getW() / 2 - dimension2.getWidth() / 2);
			point2.setY(saw.getY() + saw.getH() / 2 - dimension2.getHeight() / 2);
			point2.setZ(0d);

		}
	}

	/**
	 * Convert complex alias to layout.
	 *
	 * @param csaList
	 *            void TODO
	 */
	public void convertComplexAliasToLayout(
			List<ComplexSpeciesAliasWrapper> csaList) {
		for (ComplexSpeciesAliasWrapper csaw : csaList) {
			SpeciesGlyph sg = layout.createSpeciesGlyph("SpeciesGlyph_" + csaw.getId());
			if (model.getSpecies(csaw.getSpecies()) != null)
				sg.setReference(csaw.getSpecies());
			
			BoundingBox bb = sg.createBoundingBox();
			Dimensions dimension = bb.createDimensions();
			dimension.setWidth(csaw.getW());
			dimension.setHeight(csaw.getH());
			dimension.setDepth(1d);
			bb.setDimensions(dimension);
			Point point = bb.createPosition();
			point.setX(csaw.getX());
			point.setY(csaw.getY());
			point.setZ(0d);
			bb.setPosition(point);

			TextGlyph tg = layout.createTextGlyph("TextGlyph_" + csaw.getId());
			tg.setOriginOfText(csaw.getSpecies());
			tg.setGraphicalObject(sg);
			BoundingBox bb2 = tg.createBoundingBox();
			Dimensions dimension2 = bb2.createDimensions();
			dimension2.setWidth(csaw.getId().length() * 3);
			dimension2.setHeight(10);
			dimension.setDepth(1d);
			Point point2 = bb2.createPosition();
			point2.setX(csaw.getX() + csaw.getW() / 2 - dimension2.getWidth() / 2);
			point2.setY(csaw.getY() + csaw.getH());
			point2.setZ(0d);

		}
	}
	
}
