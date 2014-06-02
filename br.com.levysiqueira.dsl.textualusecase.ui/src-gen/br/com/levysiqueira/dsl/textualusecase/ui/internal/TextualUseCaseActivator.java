/*
 * generated by Xtext
 */
package br.com.levysiqueira.dsl.textualusecase.ui.internal;

import java.util.Collections;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.osgi.framework.BundleContext;

import com.google.common.collect.Maps;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class TextualUseCaseActivator extends AbstractUIPlugin {
	
	public static final String BR_COM_LEVYSIQUEIRA_DSL_TEXTUALUSECASE_TEXTUALUSECASE = "br.com.levysiqueira.dsl.textualusecase.TextualUseCase";
	
	private static final Logger logger = Logger.getLogger(TextualUseCaseActivator.class);
	
	private static TextualUseCaseActivator INSTANCE;
	
	private Map<String, Injector> injectors = Collections.synchronizedMap(Maps.<String, Injector> newHashMapWithExpectedSize(1));
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		injectors.clear();
		INSTANCE = null;
		super.stop(context);
	}
	
	public static TextualUseCaseActivator getInstance() {
		return INSTANCE;
	}
	
	public Injector getInjector(String language) {
		synchronized (injectors) {
			Injector injector = injectors.get(language);
			if (injector == null) {
				injectors.put(language, injector = createInjector(language));
			}
			return injector;
		}
	}
	
	protected Injector createInjector(String language) {
		try {
			Module runtimeModule = getRuntimeModule(language);
			Module sharedStateModule = getSharedStateModule();
			Module uiModule = getUiModule(language);
			Module mergedModule = Modules2.mixin(runtimeModule, sharedStateModule, uiModule);
			return Guice.createInjector(mergedModule);
		} catch (Exception e) {
			logger.error("Failed to create injector for " + language);
			logger.error(e.getMessage(), e);
			throw new RuntimeException("Failed to create injector for " + language, e);
		}
	}

	protected Module getRuntimeModule(String grammar) {
		if (BR_COM_LEVYSIQUEIRA_DSL_TEXTUALUSECASE_TEXTUALUSECASE.equals(grammar)) {
			return new br.com.levysiqueira.dsl.textualusecase.TextualUseCaseRuntimeModule();
		}
		
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getUiModule(String grammar) {
		if (BR_COM_LEVYSIQUEIRA_DSL_TEXTUALUSECASE_TEXTUALUSECASE.equals(grammar)) {
			return new br.com.levysiqueira.dsl.textualusecase.ui.TextualUseCaseUiModule(this);
		}
		
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getSharedStateModule() {
		return new SharedStateModule();
	}
	
}