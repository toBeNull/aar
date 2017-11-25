package com.tobenull.base;

/**
 * Created by tobenull on 11/25/17.
 */

public class BaseManager {
	private static BaseManager instance = new BaseManager();
	private BaseManager(){}
	public static BaseManager getInstance() {
		return instance;
	}

	public void init() {
		TLog.d("BaseManager->init");
	}
}
