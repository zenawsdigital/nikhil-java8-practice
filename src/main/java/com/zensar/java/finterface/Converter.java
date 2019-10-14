package com.zensar.java.finterface;

@FunctionalInterface
public interface Converter<T,F> {

	T convert(F from);
	
//	T convert2(F from);
}
