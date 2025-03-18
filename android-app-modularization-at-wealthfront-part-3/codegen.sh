➜  wf-android git:(master) ./codegen.sh

Loading codegen...

Code generator for wf-android

Do you want to generate a screen or module?
  1. Screen (S)
  2. Module (M)

Please select one of the above options (Eg. S or M): M

Please enter the properly cased name of the gradle module (Eg. Legacy): NewModule

What's the type of module?
  1. Java (J)
  2. Android-Infra (I)
  3. Android-Feature (F)
Please select one of the above options (Eg. J or I or F): F
Codegen successful!!!                                                                                             
➜  wf-android git:(master) ✗ git status
On branch master
Your branch is up to date with 'origin/master'.
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)
	modified:   app/build.gradle
	modified:   app/src/main/java/com/wealthfront/AppComponent.kt
	modified:   app/src/main/java/com/wealthfront/WealthfrontApp.kt
	modified:   app/src/main/java/com/wealthfront/navigation/NavigationPortalModule.kt
	modified:   app/src/test/java/com/wealthfront/TestAppComponent.kt
	modified:   app/src/test/java/com/wealthfront/TestAppModule.java
	modified:   settings.gradle
Untracked files:
  (use "git add <file>..." to include in what will be committed)
	features/newmodule/
	infra/navigation/src/main/java/com/wealthfront/navigation/NewModulePortal.kt
no changes added to commit (use "git add" and/or "git commit -a")
