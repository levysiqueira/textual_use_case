package br.com.levysiqueira.dsl.textualusecase.serializer;

import br.com.levysiqueira.dsl.textualusecase.services.TextualUseCaseGrammarAccess;
import br.com.levysiqueira.textualusecase.Action;
import br.com.levysiqueira.textualusecase.Actor;
import br.com.levysiqueira.textualusecase.AlternativeFlow;
import br.com.levysiqueira.textualusecase.BasicFlow;
import br.com.levysiqueira.textualusecase.Condition;
import br.com.levysiqueira.textualusecase.ConditionalStatement;
import br.com.levysiqueira.textualusecase.Include;
import br.com.levysiqueira.textualusecase.LoopStatement;
import br.com.levysiqueira.textualusecase.Subject;
import br.com.levysiqueira.textualusecase.TextualUseCasePackage;
import br.com.levysiqueira.textualusecase.UseCase;
import br.com.levysiqueira.textualusecase.UseCaseModel;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class TextualUseCaseSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TextualUseCaseGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == TextualUseCasePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TextualUseCasePackage.ACTION:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getStepRule()) {
					sequence_Action(context, (Action) semanticObject); 
					return; 
				}
				else break;
			case TextualUseCasePackage.ACTOR:
				if(context == grammarAccess.getActorRule() ||
				   context == grammarAccess.getAgentRule()) {
					sequence_Actor(context, (Actor) semanticObject); 
					return; 
				}
				else break;
			case TextualUseCasePackage.ALTERNATIVE_FLOW:
				if(context == grammarAccess.getAlternativeFlowRule()) {
					sequence_AlternativeFlow(context, (AlternativeFlow) semanticObject); 
					return; 
				}
				else break;
			case TextualUseCasePackage.BASIC_FLOW:
				if(context == grammarAccess.getBasicFlowRule()) {
					sequence_BasicFlow(context, (BasicFlow) semanticObject); 
					return; 
				}
				else break;
			case TextualUseCasePackage.CONDITION:
				if(context == grammarAccess.getConditionRule()) {
					sequence_Condition(context, (Condition) semanticObject); 
					return; 
				}
				else break;
			case TextualUseCasePackage.CONDITIONAL_STATEMENT:
				if(context == grammarAccess.getConditionalStatementRule() ||
				   context == grammarAccess.getStepRule()) {
					sequence_ConditionalStatement(context, (ConditionalStatement) semanticObject); 
					return; 
				}
				else break;
			case TextualUseCasePackage.INCLUDE:
				if(context == grammarAccess.getIncludeRule() ||
				   context == grammarAccess.getStepRule()) {
					sequence_Include(context, (Include) semanticObject); 
					return; 
				}
				else break;
			case TextualUseCasePackage.LOOP_STATEMENT:
				if(context == grammarAccess.getLoopStatementRule() ||
				   context == grammarAccess.getStepRule()) {
					sequence_LoopStatement(context, (LoopStatement) semanticObject); 
					return; 
				}
				else break;
			case TextualUseCasePackage.SUBJECT:
				if(context == grammarAccess.getAgentRule() ||
				   context == grammarAccess.getSubjectRule()) {
					sequence_Subject(context, (Subject) semanticObject); 
					return; 
				}
				else break;
			case TextualUseCasePackage.USE_CASE:
				if(context == grammarAccess.getUseCaseRule()) {
					sequence_UseCase(context, (UseCase) semanticObject); 
					return; 
				}
				else break;
			case TextualUseCasePackage.USE_CASE_MODEL:
				if(context == grammarAccess.getUseCaseModelRule()) {
					sequence_UseCaseModel(context, (UseCaseModel) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=StepOrder agent=[Agent|Name] description=Description)
	 */
	protected void sequence_Action(EObject context, Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=Name
	 */
	protected void sequence_Actor(EObject context, Actor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=AlternativeFlowName branchingStep=[Step|QualifiedName] condition=Condition steps+=Step+)
	 */
	protected void sequence_AlternativeFlow(EObject context, AlternativeFlow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='basic' steps+=Step+)
	 */
	protected void sequence_BasicFlow(EObject context, BasicFlow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=Description
	 */
	protected void sequence_Condition(EObject context, Condition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TextualUseCasePackage.Literals.CONDITION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextualUseCasePackage.Literals.CONDITION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConditionAccess().getExpressionDescriptionParserRuleCall_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=StepOrder condition=Condition steps+=Step+)
	 */
	protected void sequence_ConditionalStatement(EObject context, ConditionalStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=StepOrder useCase=[UseCase|ID])
	 */
	protected void sequence_Include(EObject context, Include semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=StepOrder condition=Condition steps+=Step+)
	 */
	protected void sequence_LoopStatement(EObject context, LoopStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=Name
	 */
	protected void sequence_Subject(EObject context, Subject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (subject=Subject actor+=Actor actor+=Actor* useCase+=UseCase*)
	 */
	protected void sequence_UseCaseModel(EObject context, UseCaseModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=Name 
	 *         description=Description 
	 *         actor+=[Actor|Name] 
	 *         actor+=[Actor|Name]* 
	 *         preCondition=Condition? 
	 *         basicFlow=BasicFlow 
	 *         alternativeFlow+=AlternativeFlow* 
	 *         postCondition=Condition?
	 *     )
	 */
	protected void sequence_UseCase(EObject context, UseCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
