package com.ground.dating.starter.jdbc;

public abstract class GDAbstractDataService {

	protected GDDaoImpl gdGenericDAO;

	/**
	 * description: This is a abstract method which is implemented in each child
	 * class Basically the implementing method in child class does the following
	 * things: 1.populate input map from input bean 2.execute method of Stored
	 * Procedure class from Spring 3.populate output bean from outputMap
	 * returned by executeSP
	 * 
	 * @param inputAbstractBean
	 * @return Object
	 */
	public abstract Object execute(GDValueBean inputBean) throws Exception;

	/**
	 * Set GDDaoImpl
	 * @param daoImpl
	 */
	public void setBipBatchGenericDAO(GDDaoImpl daoImpl) {
		this.gdGenericDAO = daoImpl;
	}
}