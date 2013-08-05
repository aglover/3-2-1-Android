# 3-2-1 Android! 

Wanna build a native Android app, but aren't sure where to begin? No problem, I've got you covered! In this workshop, I'll get you up and running with a simple Android app and in the process you'll learn the basics of Android development. You'll learn how to define views and the activities behind them, how to implement gestures, icons, menus and more! You'll leave the session with enough Android development experience that'll enable you to create the next killer app! 

## Requirements

Before you can start rockin' it with Android, you'll need to install the SDK, download some API versions, and create at least one emulator instance. 

### Installing the SDK and downloading required APIs

You'll need to [download the Android SDK](http://developer.android.com/sdk/index.html) for your platform (i.e. OSX, Windows, etc). Included in the SDK is a version of Eclipse containing the Android Development Toolkit (or ADT), which you can use for this workshop.

Once you've installed the SDK, you've not quite done yet -- you'll need to fire up the SDK Manager. You can do this via the command line. For example, open up a terminal, change directories to where you installed the SDK and type:

```
/Development/tools/android/android-sdk-mac_x86/tools$>./android
```

This'll bring up a dialog that allows you to install various versions of Android as well emulators.

![Android SDK Manager](http://www.ibm.com/developerworks/java/library/j-mobileforthemasses1/mobile-for-the-masses-fig1.jpg)

Next, you'll need to download a few things: namely, Tools (if there is an updated version of it), Android 4.2 (API 17), Android 4.0 (API 14) and Android 2.3 (API 10). You are free to download more API versions, but for now, all labs will assume at least API 10. 

![Android downloads](http://www.ibm.com/developerworks/java/library/j-mobileforthemasses1/mobile-for-the-masses-fig2.jpg)


### Creating an AVD (or emulator)

Emulators must target a particular version of Android, so you'll need to at least create an emulator instance that runs Android 4.2.

Start your SDK Manager again if you closed it. If the Android SDK tools or platform tools were updated, restart the SDK Manager. In the top-level menu of the SDK Manager, select Tools the Manage AVDs to open a new dialog for the Android Virtual Device Manager.

![Android Virtual Device Manager](http://www.ibm.com/developerworks/java/library/j-mobileforthemasses1/mobile-for-the-masses-fig3.jpg)

Click New to open the Create a new Android Virtual Device (AVD) dialog in which you can define an emulator. In the Target drop-down list, select Android version 4.2. In the AVD Name field, give your emulator a name. I usually name my emulators for the API version they target. This name is also how you fire up emulators from the command line or how you select them from a list in Eclipse.

![Creating a new Android virtual Device](http://www.ibm.com/developerworks/java/library/j-mobileforthemasses1/mobile-for-the-masses-fig4.jpg)

Click OK to see your new virtual device that is listed in the AVD dialog. Select it and click Start to open another dialog with launch options. For now, keep the defaults and click Launch. 

## Helpful Resources
  
  * [Mobile for the masses](http://www.ibm.com/developerworks/views/java/libraryview.jsp?site_id=1&contentarea_by=Java&sort_by=Date&sort_order=2&start=1&end=4&topic_by=&product_by=&type_by=All%20Types&show_abstract=true&search_by=mobile%20for%20the%20masses&industry_by=&series_title_by=) series:
    * [A gentle introduction to Android](http://www.ibm.com/developerworks/java/library/j-mobileforthemasses1/index.html)
    * [Take a swipe at it! Programming gestures in Android](http://www.ibm.com/developerworks/java/library/j-mobileforthemasses2/index.html)
    * [Activities and icons in your Android application lifecycle](http://www.ibm.com/developerworks/java/library/j-mobileforthemasses3/index.html)
    * [Words and gestures with Overheard Word](http://www.ibm.com/developerworks/java/library/j-mobileforthemasses4/index.html)
  * [developer.android.com](http://developer.android.com/index.html)
  * [Building your first app](http://developer.android.com/training/basics/firstapp/index.html) from the folks at developer.android.com
  * [Getting started](http://developer.android.com/training/index.html) with Android (also from the good folks at developer.android.com)
  * [Android Development Tutorial](http://www.vogella.com/articles/Android/article.html) from vogella.com -- an excellent resource that I use from time to time


## How to import a lab into Eclipse

![Importing a project](/docs/imgs/step1.png?raw=true)

blah

![Select Existing Android code](/docs/imgs/step2.png?raw=true)

blah

![Find each lab in the labs directory](/docs/imgs/step3.png?raw=true)

blah

![You should see a project named wordz](/docs/imgs/step4.png?raw=true)