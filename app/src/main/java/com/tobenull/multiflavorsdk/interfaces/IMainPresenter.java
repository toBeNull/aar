package com.tobenull.multiflavorsdk.interfaces;

import android.widget.BaseAdapter;

/**
 * Created by tobenull on 12/16/17.
 */

public interface IMainPresenter {
	BaseAdapter getAdapter();
	void onItemClick(int position);
}
