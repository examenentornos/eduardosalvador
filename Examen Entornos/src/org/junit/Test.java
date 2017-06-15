package org.junit;

public @interface Test {

	Class<Exception> expected();

}
