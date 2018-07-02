package org.miliconvert.otg.model;

public abstract class AbstractMTFElement {
	@Override
	public abstract String toString();
	
	@Override
	public abstract boolean equals(Object obj);

	public abstract String dump();

	
}
