#include <dmsdk/sdk.h>
#include "vibrate_private.h"

#if defined(DM_PLATFORM_IOS)

#include "AudioToolbox/AudioServices.h"

int VibratePlatform_Trigger()
{
    	// TODO:
    	// https://stackoverflow.com/questions/26455880/how-to-make-iphone-vibrate-using-swift
    	// .light = 3 
    	// UIImpactFeedbackGenerator(style: .light).impactOccurred() ???

    	// legacy vibration (shit)
	// AudioServicesPlaySystemSound(kSystemSoundID_Vibrate);
	return 1;
}

#endif
