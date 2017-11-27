package com.tobenull.http;

import android.util.Log;

/**
 * Created by tobenull on 11/27/17.
 */

public class NetManager {
	private static NetManager instance = new NetManager();
	private NetManager(){}
	public static NetManager getInstance() {
		return instance;
	}

	public void init() {
		Log.d("null-tobe", "NetManager->init");
	}
}
