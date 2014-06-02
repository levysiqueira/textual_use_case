package br.com.levysiqueira.dsl.textualusecase;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import br.com.levysiqueira.dsl.textualusecase.TextualUseCaseUtil;
import br.com.levysiqueira.textualusecase.AlternativeFlow;
import br.com.levysiqueira.textualusecase.BasicFlow;
import br.com.levysiqueira.textualusecase.FlowOfEvents;
import br.com.levysiqueira.textualusecase.Step;

public class TextualUseCaseNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	public QualifiedName qualifiedName(BasicFlow b) {
		return QualifiedName.create(b.getUseCase().getName(), b.getName());
	}
	
	public QualifiedName qualifiedName(Step s) {
		List<String> strings = new ArrayList<String>();
		FlowOfEvents foe = TextualUseCaseUtil.findFlowOfEventsFor(s);
		
		if (foe instanceof AlternativeFlow) {
			//strings.add(((AlternativeFlow) foe).getUseCase().getName());
			strings.add(foe.getName());
		} else {
			//strings.add(((BasicFlow) foe).getUseCase().getName());
		}
		
		for (Step st : TextualUseCaseUtil.getStepHierarchy(s)) {
			strings.add(st.getName());
		}
		
		return QualifiedName.create(strings);
	}
}
