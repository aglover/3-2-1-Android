# 3-2-1 Android! 

Wanna build a native Android app, but aren't sure where to begin? No problem, I've got you covered! In this workshop, I'll get you up and running with a simple Android app and in the process you'll learn the basics of Android development. You'll learn how to define views and the activities behind them, how to implement gestures, icons, menus and more! You'll leave the session with enough Android development experience that'll enable you to create the next killer app! 

## Let's get started! 

This workshop is organized into 3 labs. We don't have a lot of time, so I strongly suggest you pair with someone. People with OSX, please volunteer to be pairing partners as it'll reduce friction because I'm also on OSX. That is, if you have Windows or Linux and someone near you is on a MacBook, then you should probably ask to pair with that person as my directions are tailored to OSX. 

### Lab #1

In [lab #1](/labs/lab_1/README.md), you'll be installing the Android SDK, downloading some API versions, creating an emulator, and finally building an App. 

### Lab #2

In [lab #2](/labs/lab_2/README.md), you'll learn about Layouts, Activities, and Gestures. You will need to [import lab #2 into Eclipse](#how-to-import-a-lab-into-eclipse). 

### Lab #3

In [lab #3](/labs/lab_3/README.md), you learn about building Android apps, signing them for distribution, and deploying them to devices. You will need to [import lab #3 into Eclipse](#how-to-import-a-lab-into-eclipse).

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

This workshop has separate Android app instances for each lab. You will need to import each lab (which is really and Android app) into Eclipse. This is easily done, provided you've either cloned this repository or downloaded a tar/zip file. Once you've done that, please follow the directs below.

First, select __File__ and then __Import__.

![Importing a project](/docs/imgs/step1.png?raw=true)

Next, select the __Existing Android Code Into Workspace__ option in the Android folder.

![Select Existing Android code](/docs/imgs/step2.png?raw=true)

You will need to find the directory where you cloned or unzipped/untarred this project -- each lab is intended to be imported separately or all together -- if you want to import each lab, select a particular lab directory, such as `lab_2`. Otherwise, you can select the root directory of all the labs: `labs`. 

![Find each lab in the labs directory](/docs/imgs/step3.png?raw=true)

Finally, you should see a dialog that lists one or more projects (depending on which option you selected previously) -- hit the __Finish__ button and you should be good to go!

![You should see a project named wordz](/docs/imgs/step4.png?raw=true)

Now you're ready to roll!