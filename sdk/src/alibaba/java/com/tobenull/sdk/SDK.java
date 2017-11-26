package com.tobenull.sdk;

import com.tobenull.base.TLog;
import com.tobenull.gaode.MapManager;

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
	protected String getProductFlavor() {
		return "alibaba";
	}

	@Override
	public void init() {
		super.init();
		initAlibaba();
	}

	private void initAlibaba() {
		TLog.d("SDK->initAlibaba, init alibaba...");
		MapManager.getInstance().init();
	}

	public void buy(String product) {
		TLog.d("SDK->search, you want to buy " + product);
	}

}
