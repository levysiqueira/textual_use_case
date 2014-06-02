package br.com.levysiqueira.dsl.textualusecase

import br.com.levysiqueira.textualusecase.UseCase
import br.com.levysiqueira.textualusecase.Step
import br.com.levysiqueira.textualusecase.FlowOfEvents
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.BasicEList
import br.com.levysiqueira.textualusecase.Statement

/**
 * Classes with help methods.
 */
class TextualUseCaseUtil {	
	/**
	 * Obtains the container use case from a step.
	 */
	public static def UseCase findUseCaseFor(Step s) {
		findFlowOfEventsFor(s).eContainer as UseCase
	}
	
	public static def FlowOfEvents findFlowOfEventsFor(Step s) {
		if (s.flowOfEvents != null) {
			// directly in a flow of events
			s.flowOfEvents
		} else {
			// inside a statement
			findFlowOfEventsFor(s.statement)
		}
	}
	
	/**
	 * Obtains the hierarchy of Steps of a Step. 
	 */
	public static def EList<Step> getStepHierarchy(Step s) {
		if (s.statement == null) {
			val EList<Step> list = new BasicEList<Step>();
			list.add(s)
			list
		} else {
			val EList<Step> list = getStepHierarchy(s.statement);
			list.add(s)
			list
		}
	}
	
	/**
	 * Gets all steps from a FlowOfEvents
	 */
	public static def EList<Step> getAllSteps(FlowOfEvents f) {
	 	val EList<Step> stepList = new BasicEList<Step>()
	 	
	 	if (f.steps != null) {
	 		stepList.addAll(f.steps)
	 		f.steps.filter(Statement).forEach[stepList.addAll(getAllSteps(it))]	 		
	 	}	 	
	 	stepList
	 }
	 
	 /**
	  * Gets all steps from a Statement
	  */
	 public static def EList<Step> getAllSteps(Statement s) {
	 	val EList<Step> stepList = new BasicEList<Step>()
	 	
	 	if (s.steps != null) {
	 		stepList.addAll(s.steps)
	 		stepList.filter(Statement).forEach[stepList.addAll(getAllSteps(it))]
	 	}
	 	stepList
	 }
}