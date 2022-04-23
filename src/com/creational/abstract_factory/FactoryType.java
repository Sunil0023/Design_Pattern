package com.creational.abstract_factory;

public interface FactoryType {

	public abstract Price getFactoryOsType(String osType) throws Exception;
}
