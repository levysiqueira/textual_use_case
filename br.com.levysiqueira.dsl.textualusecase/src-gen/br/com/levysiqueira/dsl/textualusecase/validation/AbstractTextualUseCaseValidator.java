/*
 * generated by Xtext
 */
package br.com.levysiqueira.dsl.textualusecase.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractTextualUseCaseValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://wwww.levysiqueira.com.br/TextualUseCase.ecore"));
		return result;
	}
}
