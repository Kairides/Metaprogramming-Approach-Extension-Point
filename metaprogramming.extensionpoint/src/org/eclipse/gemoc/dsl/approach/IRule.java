package org.eclipse.gemoc.dsl.approach;

import org.eclipse.gemoc.dsl.Dsl;
import org.eclipse.gemoc.dsl.Entry;

public interface IRule {
		
	public abstract Message execute(Dsl dsl);
	
	public abstract Message execute(Entry entry);

}
