package de.mdelab.migmm.history.adapter;

import org.eclipse.emf.ecore.EStructuralFeature;

public class FeatureAccessLocation {

	private final String variable;
	private final EStructuralFeature feature;
	private final int start;
	private final int end;
	
	public FeatureAccessLocation(String variable, EStructuralFeature feature,
			int start, int end) {
		this.variable = variable;
		this.feature = feature;
		this.start = start;
		this.end = end;
	}
	
	public String getVariable() {
		return variable;
	}

	public EStructuralFeature getFeature() {
		return feature;
	}
	
	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}

}
