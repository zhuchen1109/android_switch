package com.appscumen.example;

import com.appscumen.example.MySwitch.OnChangeAttemptListener;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;

public class AndroidSwitchDemoActivity extends Activity implements OnChangeAttemptListener, OnCheckedChangeListener {
	MySwitch slideToUnLock;
//	MySwitch publishToggle;
//	TextView yes, no;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       /* slideToUnLock = (MySwitch)findViewById(R.id.switch3);
        publishToggle = (MySwitch)findViewById(R.id.switch4);
        yes = (TextView)findViewById(R.id.Yes);
        no = (TextView)findViewById(R.id.No);*/
//        slideToUnLock.toggle();
//        slideToUnLock.disableClick();
//        slideToUnLock.fixate(true);
//        publishToggle.setOnCheckedChangeListener(this);
//		yes.setEnabled(false);
//		no.setEnabled(true);
		//no.setTextScaleX(1.2f);
        slideToUnLock = (MySwitch)findViewById(R.id.switch1);
        slideToUnLock.setOnChangeAttemptListener(this);
        slideToUnLock.setOnCheckedChangeListener(this);
    }
	@Override
	public void onChangeAttempted(boolean isChecked) {
		Log.i("xxxx", "isChecked="+isChecked);
	}
	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		Log.i("xxxx", "isChecked="+isChecked+",buttonView="+buttonView);
	}
}