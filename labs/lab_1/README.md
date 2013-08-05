# Lab #1

Before you can start rockin' it with Android, you'll need to install the SDK, download some API versions, and create at least one emulator instance. 

Once you've done that, you can then create an app. In lab #1, we'll create everyone's favorite app: Hello World! 

## Installing the SDK and downloading required APIs

You'll need to [download the Android SDK](http://developer.android.com/sdk/index.html) for your platform (i.e. OSX, Windows, etc). Included in the SDK is a version of Eclipse containing the Android Development Toolkit (or ADT), which you can use for this workshop.

Once you've installed the SDK, you've not quite done yet -- you'll need to fire up the SDK Manager. You can do this via the command line. For example, open up a terminal, change directories to where you installed the SDK, go into the tools directory, and type:

```
/Development/tools/android/android-sdk-mac_x86/tools$>./android
```

This'll bring up a dialog that allows you to install various versions of Android as well emulators.

![Android SDK Manager](http://www.ibm.com/developerworks/java/library/j-mobileforthemasses1/mobile-for-the-masses-fig1.jpg)

Next, you'll need to download a few things: namely, Tools (if there is an updated version of it), Android 4.2 (API 17), Android 4.0 (API 14) and Android 2.3 (API 10). You are free to download more API versions, but for now, all labs will assume at least API 10. 

![Android downloads](http://www.ibm.com/developerworks/java/library/j-mobileforthemasses1/mobile-for-the-masses-fig2.jpg)

## Creating an AVD (or emulator)

Emulators must target a particular version of Android, so you'll need to at least create an emulator instance that runs Android 4.2.

Start your SDK Manager again if you closed it. If the Android SDK tools or platform tools were updated, restart the SDK Manager. In the top-level menu of the SDK Manager, select __Tools__ then __Manage AVDs__ to open a new dialog for the Android Virtual Device Manager.

![Android Virtual Device Manager](http://www.ibm.com/developerworks/java/library/j-mobileforthemasses1/mobile-for-the-masses-fig3.jpg)

Click __New__ to open the Create a new Android Virtual Device (AVD) dialog in which you can define an emulator. In the Target drop-down list, select Android version 4.2. In the AVD Name field, give your emulator a name. I usually name my emulators for the API version they target. This name is also how you fire up emulators from the command line or how you select them from a list in Eclipse.

![Creating a new Android virtual Device](http://www.ibm.com/developerworks/java/library/j-mobileforthemasses1/mobile-for-the-masses-fig4.jpg)

Click __OK__ to see your new virtual device that is listed in the AVD dialog. Select it and click __Start__ to open another dialog with launch options. For now, keep the defaults and click __Launch__. 

### Hello World!

These steps assume you are using the Eclipse instance that comes bundled with the Android SDK Download. If you are using a different Eclipse instance (such as one you've previously installed) you will need to install the [Eclipse ADT Bundle](http://developer.android.com/sdk/installing/bundle.html).

To create the world's simplest app, from within Eclipse, select __File__ then __New__ and then select the __Android Application Project__ option.

![Creating a new Android project](http://www.ibm.com/developerworks/java/library/j-mobileforthemasses1/mobile-for-the-masses-fig7.jpg)

The dialog that pops up is quite important so follow these steps closely: 
  1. In the Target SDK drop-down list, select API 17: Android 4.2 (Jelly Bean), then click __Next__.
  1. In the next dialog, keep the default settings, although you can place the resulting code in any location. Click __Next__.
  1. Keep the defaults in the Configure Launcher Icon dialog and click __Next__.
  1. Also, keep the defaults in the Create Activity dialog and in the final dialog, which is used to select your application's activity. Click __Finish__.







