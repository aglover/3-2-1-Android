package com.b50.overheard;

import android.app.Activity;
import android.util.Log;

public class DefaultActivity extends Activity {
	protected static final String APP = "overheardword";
	
	@Override
	protected void onResume() {
		super.onResume();
		Log.d(APP, "onResume Invoked");
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d(APP, "onStart Invoked");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d(APP, "onPause Invoked");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d(APP, "onRestart Invoked");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d(APP, "onStop Invoked");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(APP, "onDestroy Invoked");
	}
}
