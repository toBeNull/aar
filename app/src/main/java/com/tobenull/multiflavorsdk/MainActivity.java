package com.tobenull.multiflavorsdk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.tobenull.multiflavorsdk.interfaces.IMainPresenter;
import com.tobenull.multiflavorsdk.interfaces.IMainView;

public class MainActivity extends AppCompatActivity implements IMainView {

	private IMainPresenter mainPresenter;
	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mainPresenter = new MainPresentImpl(this, this);
		textView = (TextView) findViewById(R.id.textview);
		ListView listView = (ListView) findViewById(R.id.listview);
		listView.setAdapter(mainPresenter.getAdapter());
		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				mainPresenter.onItemClick(position);
			}
		});
	}

	@Override
	public void showResult(String result) {
		textView.setText(result);
	}
}
