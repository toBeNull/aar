package com.tobenull.sdk;

import com.tobenull.base.BaseManager;
import com.tobenull.base.TLog;

/**
 * Created by tobenull on 11/26/17.
 */

public abstract class BaseSDK {

	protected abstract String getProductFlavor();

	protected void init() {
		TLog.d("BaseSDK->init, " + getProductFlavor());
		BaseManager.getInstance().init();
	}
}
