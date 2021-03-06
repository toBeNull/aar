package com.tobenull.multiflavorsdk;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Toast;

import com.tobenull.multiflavorsdk.interfaces.IMainPresenter;
import com.tobenull.multiflavorsdk.interfaces.IMainView;
import com.tobenull.sdk.SDK;

/**
 * Created by tobenull on 12/16/17.
 */

public class MainPresentImpl implements IMainPresenter {

	private Context context;
	private IMainView mainView;
	private BaseAdapter adapter;

	public MainPresentImpl(Context context, IMainView mainView) {
		this.context = context;
		this.mainView = mainView;
		if (adapter == null)
			adapter = new ArrayAdapter<>(context, android.R.layout.simple_list_item_1, new String[] {
					"SDK.getInstance().init();",
					"SDK.getInstance().buy(product);",
			});
	}

	@Override
	public BaseAdapter getAdapter() {
		return adapter;
	}

	@Override
	public void onItemClick(int position) {
		StringBuffer result = new StringBuffer();
		switch (position) {
			case 0:
				SDK.getInstance().init();
				result.append("调用了SDK.getInstance().init();方法");
				break;
			case 1:
				String product = "alibaba debug demo";
				SDK.getInstance().buy(product);
				result.append("调用了SDK.getInstance().buy(product);方法\nproduct = " + product);
				break;
		}
		mainView.showResult(result.toString());
	}
}
