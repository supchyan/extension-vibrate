package com.defold.android.vibrate;

import android.util.Log;
import android.os.Vibrator;
import android.os.VibrationEffect;
import android.os.Build;
import android.app.Activity;
import android.content.Context;
import java.lang.Runnable;

class VibrateExtension {
	private static final String TAG = "vibrate";

	public static void Vibrate(final Activity activity) {
		activity.runOnUiThread(new Runnable() {
			@Override
			public void run() {
		                // API 29+
		                final VibrationEffect vEffect;
		              
				Vibrator vibrator = (Vibrator)activity.getSystemService(Context.VIBRATOR_SERVICE);
		
		                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q)
		                {
		                    vEffect = VibrationEffect.createPredefined(VibrationEffect.EFFECT_CLICK);
		                    vibrator.cancel();
		                    vibrator.vibrate(vEffect);
		                }
			}
		});
	}
}
