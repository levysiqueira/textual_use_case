/*
* generated by Xtext
*/
package br.com.levysiqueira.dsl.textualusecase;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TextualUseCaseStandaloneSetup extends TextualUseCaseStandaloneSetupGenerated{

	public static void doSetup() {
		new TextualUseCaseStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

