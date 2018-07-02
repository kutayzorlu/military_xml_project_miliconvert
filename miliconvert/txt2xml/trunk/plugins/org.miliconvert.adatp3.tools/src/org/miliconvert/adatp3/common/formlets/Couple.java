package org.miliconvert.adatp3.common.formlets;

/**
 * A generic object which permits to construct a couple of values easily.
 * @author ngapaillard
 *
 * @param <T> the type of the first object.
 * @param <V> the type of the second object.
 */
public class Couple <T,V>{

	private final T object1;
	private final V object2;
	
	/**
	 * Default constructor
	 * @param object1 the first object.
	 * @param object2 the second object.
	 */
	public Couple(T object1,V object2){
		this.object1=object1;
		this.object2=object2;
	}

	/**
	 * The first object to return
	 * @return T the first object.
	 */
	protected T getObject1() {
		return object1;
	}

	/**
	 * The second object to return
	 * @return T the second object.
	 */
	protected V getObject2() {
		return object2;
	}
	
	
}
