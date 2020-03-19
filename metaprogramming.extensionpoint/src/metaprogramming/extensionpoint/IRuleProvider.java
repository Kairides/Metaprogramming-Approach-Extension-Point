package metaprogramming.extensionpoint;

import java.util.Collection;

public interface IRuleProvider {
	
	public abstract Collection<IRule> getValidationRules();

}
