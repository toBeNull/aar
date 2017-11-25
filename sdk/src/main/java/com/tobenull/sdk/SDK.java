package com.tobenull.sdk;

import com.tobenull.base.BaseManager;
import com.tobenull.base.TLog;

/**
 * Created by tobenull on 11/25/17.
 */

public class SDK {
	private static SDK mInstance = new SDK();
	private SDK() {}
	public static SDK getInstance() {
		return mInstance;
	}

	public void init() {
		TLog.d("SDK->init");
		BaseManager.getInstance().init();
	}

}
