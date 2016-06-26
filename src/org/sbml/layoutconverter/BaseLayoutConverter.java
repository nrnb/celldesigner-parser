package org.sbml.layoutconverter;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.stream.XMLStreamException;

import org.sbml.jsbml.Model;
import org.sbml.jsbml.SBMLDocument;
import org.sbml.jsbml.SBMLError;
import org.sbml.jsbml.SBMLErrorLog;
import org.sbml.jsbml.SBMLException;
import org.sbml.jsbml.TidySBMLWriter;
import org.sbml.jsbml.ext.layout.Layout;
import org.sbml.wrapper.ModelWrapper;

// TODO: Auto-generated Javadoc
/**
 * The Class abstractLayoutConverter.
 *
 * @author Kaito Ii
 * 
 * Date Created: Jun 26, 2016
 */

public abstract class BaseLayoutConverter {

	/** The document. */
	protected SBMLDocument document;
	
	/** The model. */
	protected Model model;
	
	/** The m wrapper. */
	protected ModelWrapper mWrapper;
	
	/** The layout. */
	protected Layout layout;
	
	/** The Constant DEFAULT_SPECIES_WIDTH. */
	static final double DEFAULT_SPECIES_WIDTH = 80.0;

	/** The Constant DEFAULT_SPECIES_HEIGHT. */
	static final double DEFAULT_SPECIES_HEIGHT = 40.0;

	/** The Constant DEFAULT_SPECIES_DEPTH. */
	static final double DEFAULT_SPECIES_DEPTH = 1.0;

	
	/**
	 * Instantiates a new abstract layout converter.
	 *
	 * @param file the file
	 * @throws XMLStreamException the XML stream exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public BaseLayoutConverter(File file) throws XMLStreamException, IOException{
		document = ConverterSBMLReader.read(file);
	}
	
	/**
	 * Gets the document.
	 *
	 * @return the document
	 */
	public SBMLDocument getDocument() {
		return document;
	}

	/**
	 * Sets the document.
	 *
	 * @param document the document to set
	 */
	public void setDocument(SBMLDocument document) {
		this.document = document;
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	public Model getModel() {
		return model;
	}

	/**
	 * Sets the model.
	 *
	 * @param model the model to set
	 */
	public void setModel(Model model) {
		this.model = model;
	}

	/**
	 * Convert.
	 */
	public abstract void convert();
	
	/**
	 * Save.
	 */
	public abstract void save();
	
	/**
	 * void TODO.
	 */
	public void validate() {
		document.checkConsistency();
		SBMLErrorLog errorLog = document.getListOfErrors();
		List<SBMLError> errorList = errorLog.getValidationErrors();
		for (SBMLError e : errorList) {
			System.out.println(e.getLine() + " " + e.getMessage());
		}
	}

	/**
	 * void TODO.
	 */
	public void print() {
		try {
			String docStr = new TidySBMLWriter().writeSBMLToString(document);
			System.out.println(docStr);
		} catch (SBMLException e) {
			e.printStackTrace();
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}
	}
	
	
}
