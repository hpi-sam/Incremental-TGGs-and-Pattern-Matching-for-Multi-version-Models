package de.mdelab.migmm.history.tggh.mote2history.impl.sdm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.HistoryPackage;
import de.mdelab.migmm.history.Interval;
import de.mdelab.migmm.history.TimingUnit;
import de.mdelab.migmm.history.timing.DAGVersion;
import de.mdelab.migmm.history.timing.TimingPackage;
import de.mdelab.mltgg.mote2.TGGEngine;
import de.mdelab.mltgg.mote2.TGGNode;
import de.mdelab.mltgg.mote2.TransformationDirectionEnum;
import de.mdelab.mltgg.mote2.TransformationQueue;
import de.mdelab.mltgg.mote2.impl.MoTE2ChangeListener;
import tggh.TgghPackage;

public class MoTE2HistoryChangeListener extends MoTE2ChangeListener {

	private TransformationDirectionEnum direction;

	public MoTE2HistoryChangeListener(TGGEngine tggEngine, TransformationQueue transformationQueue,
			final EMap<EObject, TGGNode> coveredElementsMap, final EMap<EObject, Object> uncoveredElementsMap, TransformationDirectionEnum direction) {
		super(tggEngine, transformationQueue, coveredElementsMap, uncoveredElementsMap);
		this.direction = direction;
	}

	@Override
	public void notifyChanged(final Notification notification)
	{
		Object notifier = notification.getNotifier();
		
		if(this.active && notification.getFeature() == TimingPackage.Literals.DAG_INTERVAL__DTS && isAdd(notification)) {
			ElementWithHistory element = (ElementWithHistory) ((Interval) notifier).eContainer();
			if(!isTGGNode(element)) {
				Collection<TimingUnit> newDts = new ArrayList<TimingUnit>();
				for(EObject timingUnit:getNewEReferenceTargets(notification)) {
					newDts.add((TimingUnit) timingUnit);
				}
				((MoTE2HistorySdm) tggEngine).registerDeletion(element, newDts, direction);
			}
		}
		else if(notification.getFeature() != HistoryPackage.Literals.ELEMENT_WITH_HISTORY__UNHANDLED) {
			super.notifyChanged(notification);	//TODO check if this is needed
			
			if (this.active && notifier instanceof ElementWithHistory &&
					isAdd(notification))
			{
				for(EObject element:getNewEReferenceTargets(notification)) {
					if(element instanceof ElementWithHistory) {
						((MoTE2HistorySdm) tggEngine).registerCreation((ElementWithHistory) notifier, (ElementWithHistory) element, direction);
					}
				}
			}
			else if(this.active && notification.getFeature() == TimingPackage.Literals.DAG_INTERVAL__CTS && isAdd(notification)) {
				((MoTE2HistorySdm) tggEngine).registerCreation((ElementWithHistory) notifier, null, direction);
			}
			
			if(notifier instanceof DAGVersion && notification.getFeature() == TimingPackage.Literals.DAG_VERSION__SUCCESSORS && isAdd(notification)) {
				for(EObject successor:getNewEReferenceTargets(notification)) {
					if(successor instanceof DAGVersion && ((DAGVersion) successor).getPredecessors().size() > 1) {
						((MoTE2HistorySdm) tggEngine).registerMerge((DAGVersion) successor, direction);
					}
				}
			}
		}
	}
	
	private boolean isTGGNode(ElementWithHistory element) {
		return element.eClass().getEAllSuperTypes().contains(TgghPackage.Literals.TGG_NODE_WITH_HISTORY);
	}

	private boolean isAdd(Notification notification) {
		return notification.getEventType() == Notification.ADD ||
				(notification.getEventType() == Notification.SET && notification.getNewValue() != null) ||
				notification.getEventType() == Notification.ADD_MANY;
	}

	@SuppressWarnings("unchecked")
	private Collection<EObject> getNewEReferenceTargets(Notification notification) {
		if(notification.getFeature() instanceof EReference) {
			if(notification.getEventType() == Notification.ADD) {
				return Collections.singleton((EObject) notification.getNewValue());
			}
			if(notification.getEventType() == Notification.SET && notification.getNewValue() != null) {
				return Collections.singleton((EObject) notification.getNewValue());
			}
			else if(notification.getEventType() == Notification.ADD_MANY){
				return (Collection<EObject>) notification.getNewValue();
			}
			else {
				return Collections.emptySet();
			}
		}
		else {
			return Collections.emptySet();
		}
	}

}
