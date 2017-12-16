package com.tobenull.sdk;

import com.tobenull.base.TLog;

/**
 * Created by tobenull on 11/26/17.
 */

public class SDK extends BaseSDK {

	private static SDK mInstance = new SDK();
	private SDK() {}
	public static SDK getInstance() {
		return mInstance;
	}

	@Override
	public void init() {
		TLog.d("SDK->init, _a_BUILD_TIME:");
		super.init();
		initBaidu();
	}

	private void initBaidu() {
		TLog.d("SDK->initBaidu, init baidu...");
	}

	@Override
	protected String getProductFlavor() {
		return "baidu";
	}

	public void search(String key) {
		TLog.d("SDK->search, you want to search " + key);
	}
}
