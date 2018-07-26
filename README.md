# ViewModelDemo
This project demonstrates the use of Architectural components ViewModel and LiveData.

Here i am using two activities namely LoginActivity and ProjectListActivity.

Username is rohit@gmail.com and password is rohit.

I have used ViewModel and LiveData for the ProjectListActivity

ViewModel is used to provide and manage data for the UI (e.g. Activity or Fragment)

ViewModel is able to live through the configuration changes. It means that even after the activity is destroyed and recreated after phone rotation, you’ll have still the same ViewModel with the same data

To use ViewModel, we need to firstly add proper dependencies into our app/build.gradle file

<B>implementation "android.arch.lifecycle:extensions:1.0.0"

<B>annotationProcessor "android.arch.lifecycle:compiler:1.0.0"

When we have a LiveData object (e.g. list of users), we can add some LifecycleOwner (it can be Activity or Fragment) as an observer to this data updates. Exactly as in the observer pattern, but with respecting lifecycle states. 

An Activity or Fragment will be notified every time the data changes instead of requesting the data each time from ViewModel (so the UI is always updated!)

Add the following dependencies for the LiveData:

<b>implementation "android.arch.lifecycle:extensions:1.0.0"
  
<b>annotationProcessor "android.arch.lifecycle:compiler:1.0.0"

