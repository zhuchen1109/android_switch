package com.appscumen.example;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class AndroidSwitchDemoActivity extends Activity implements OnCheckedChangeListener {

	MySwitch slideToUnLock;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		slideToUnLock = (MySwitch) findViewById(R.id.switch1);
		slideToUnLock.setOnCheckedChangeListener(this);
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		Log.i("xxxx", "onCheckedChanged isChecked=" + isChecked + ",buttonView=" + buttonView);
	}
}