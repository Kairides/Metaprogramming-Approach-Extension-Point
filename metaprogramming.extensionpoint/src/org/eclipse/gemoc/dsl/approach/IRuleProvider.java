package org.eclipse.gemoc.dsl.approach;

import java.util.Collection;

public interface IRuleProvider {
	
	public abstract Collection<IRule> getValidationRules();

}
