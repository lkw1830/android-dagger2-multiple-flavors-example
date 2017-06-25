# android-dagger2-multiple-flavors-example

This is an example to demonstrate how to use dagger2 dependency injection to integerate with multiple product flavors under the same code base.  

It contains two version of apk in, one is a FREE version, and the others is a Premium version. They are both sharing from the same code base, i.e. from src/main.  

It use dependency injection to inject the implementation code for which product flavor is currently selected.  
