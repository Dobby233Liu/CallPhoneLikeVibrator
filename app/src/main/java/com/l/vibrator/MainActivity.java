package com.l.vibrator;

import android.app.*;
import android.os.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Vibrator vibrator=(Vibrator)getSystemService(VIBRATOR_SERVICE);
		long pattern []={888,888};
		vibrator.vibrate(pattern,0);
    }

	@Override
	protected void onDestroy()
	{
	// TODO: Implement this method
	super.onDestroy();
	Vibrator vibrator=(Vibrator)getSystemService(VIBRATOR_SERVICE);
	vibrator.cancel();
	}
}
