package de.mdelab.migmm.history.adapter;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.ecore.utilities.AbstractVisitor;
import org.eclipse.ocl.expressions.PropertyCallExp;
import org.eclipse.ocl.expressions.VariableExp;

/**
 * This is an implementation of the visitor in the visitor pattern
 * which can visit the abstract syntax tree of an OCL expression
 * and collects all accessed features of variables in the expression
 * and the corresponding locations in the course of the visiting process.
 * 
 * @author Matthias.Barkowsky
 *
 */
public class OCLFeatureAccessLocationVisitor extends AbstractVisitor<Object> {

	/*
	 * Collection of all collected variable names.
	 */
	private List<FeatureAccessLocation> featureLocations;
	
	public OCLFeatureAccessLocationVisitor() {
		super();
		featureLocations = new ArrayList<FeatureAccessLocation>();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ocl.utilities.AbstractVisitor#visitVariableExp(org.eclipse.ocl.expressions.VariableExp)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object visitPropertyCallExp(PropertyCallExp<EClassifier, EStructuralFeature> call) {
		if(call.getSource() instanceof VariableExp && call.getSource().getStartPosition() != -1) {
			VariableExp<EClassifier, EParameter> variable = (VariableExp<EClassifier, EParameter>) call.getSource();
			featureLocations.add(new FeatureAccessLocation(variable.getReferredVariable().getName(), call.getReferredProperty(), variable.getStartPosition(), call.getEndPosition()));
		}
		
		return super.visitPropertyCallExp(call);
	}
	
	public List<FeatureAccessLocation> getFeatureLocations(){
		return featureLocations;
	}

}
