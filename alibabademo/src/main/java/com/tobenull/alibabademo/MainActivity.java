package com.tobenull.alibabademo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tobenull.sdk.SDK;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.init).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				SDK.getInstance().init();
			}
		});
		findViewById(R.id.buy).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				SDK.getInstance().buy("Clothes");
			}
		});
	}
}
