package br.com.levysiqueira.dsl.textualusecase;

import br.com.levysiqueira.textualusecase.FlowOfEvents;
import br.com.levysiqueira.textualusecase.Statement;
import br.com.levysiqueira.textualusecase.Step;
import br.com.levysiqueira.textualusecase.UseCase;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * Classes with help methods.
 */
@SuppressWarnings("all")
public class TextualUseCaseUtil {
  /**
   * Obtains the container use case from a step.
   */
  public static UseCase findUseCaseFor(final Step s) {
    FlowOfEvents _findFlowOfEventsFor = TextualUseCaseUtil.findFlowOfEventsFor(s);
    EObject _eContainer = _findFlowOfEventsFor.eContainer();
    return ((UseCase) _eContainer);
  }
  
  public static FlowOfEvents findFlowOfEventsFor(final Step s) {
    FlowOfEvents _xifexpression = null;
    FlowOfEvents _flowOfEvents = s.getFlowOfEvents();
    boolean _notEquals = (!Objects.equal(_flowOfEvents, null));
    if (_notEquals) {
      _xifexpression = s.getFlowOfEvents();
    } else {
      Statement _statement = s.getStatement();
      _xifexpression = TextualUseCaseUtil.findFlowOfEventsFor(_statement);
    }
    return _xifexpression;
  }
  
  /**
   * Obtains the hierarchy of Steps of a Step.
   */
  public static EList<Step> getStepHierarchy(final Step s) {
    EList<Step> _xifexpression = null;
    Statement _statement = s.getStatement();
    boolean _equals = Objects.equal(_statement, null);
    if (_equals) {
      EList<Step> _xblockexpression = null;
      {
        final EList<Step> list = new BasicEList<Step>();
        list.add(s);
        _xblockexpression = list;
      }
      _xifexpression = _xblockexpression;
    } else {
      EList<Step> _xblockexpression_1 = null;
      {
        Statement _statement_1 = s.getStatement();
        final EList<Step> list = TextualUseCaseUtil.getStepHierarchy(_statement_1);
        list.add(s);
        _xblockexpression_1 = list;
      }
      _xifexpression = _xblockexpression_1;
    }
    return _xifexpression;
  }
  
  /**
   * Gets all steps from a FlowOfEvents
   */
  public static EList<Step> getAllSteps(final FlowOfEvents f) {
    EList<Step> _xblockexpression = null;
    {
      final EList<Step> stepList = new BasicEList<Step>();
      EList<Step> _steps = f.getSteps();
      boolean _notEquals = (!Objects.equal(_steps, null));
      if (_notEquals) {
        EList<Step> _steps_1 = f.getSteps();
        stepList.addAll(_steps_1);
        EList<Step> _steps_2 = f.getSteps();
        Iterable<Statement> _filter = Iterables.<Statement>filter(_steps_2, Statement.class);
        final Consumer<Statement> _function = new Consumer<Statement>() {
          public void accept(final Statement it) {
            EList<Step> _allSteps = TextualUseCaseUtil.getAllSteps(it);
            stepList.addAll(_allSteps);
          }
        };
        _filter.forEach(_function);
      }
      _xblockexpression = stepList;
    }
    return _xblockexpression;
  }
  
  /**
   * Gets all steps from a Statement
   */
  public static EList<Step> getAllSteps(final Statement s) {
    EList<Step> _xblockexpression = null;
    {
      final EList<Step> stepList = new BasicEList<Step>();
      EList<Step> _steps = s.getSteps();
      boolean _notEquals = (!Objects.equal(_steps, null));
      if (_notEquals) {
        EList<Step> _steps_1 = s.getSteps();
        stepList.addAll(_steps_1);
        Iterable<Statement> _filter = Iterables.<Statement>filter(stepList, Statement.class);
        final Consumer<Statement> _function = new Consumer<Statement>() {
          public void accept(final Statement it) {
            EList<Step> _allSteps = TextualUseCaseUtil.getAllSteps(it);
            stepList.addAll(_allSteps);
          }
        };
        _filter.forEach(_function);
      }
      _xblockexpression = stepList;
    }
    return _xblockexpression;
  }
}
