package com.tobenull.multiflavorsdk;

import android.app.Application;

import com.tobenull.sdk.SDK;

/**
 * Created by tobenull on 11/25/17.
 */

public class App extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		SDK.getInstance().init();
	}
}
