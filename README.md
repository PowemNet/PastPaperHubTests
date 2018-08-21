# PastPaperHubTests
Tests written for PastPaperHub project. Written in Selenium 2, Java, built with Gradle

To run tests locally:
-Run the PastPaperHub project with `firebase serve` in the PastPaperHub root folder.
-Run tests with `gradle test` in the PastPaperHubTests root folder.
(Make sure you have Google Chrome installed)

# Chrome Driver for windows os
Different chrome driver is required for different operating systems. Here is the link for windows os https://sites.google.com/a/chromium.org/chromedriver/downloads .

Download the chrome driver from the link above click on the 'latest realease chrome 2.41'
Open intellij IDEA, go to source page, expand tests, then expand resourses.
Open the folder on which you downloaded the chrome driver
Drag and drop the chrome driver to resources on intelij IDEA. Done!

# Steps to downloading and installing java
Visit the java downloads page by clicking on the link http://www.oracle.com/technetwork/java/javase/downloads/jdk10-downloads-4416644.html 

Once you have selected download, accept the terms of service and chooose the correct OS corresponding for the specifiic JDK. (Windows, mac OS or linux)

Once the download is complete, click on the file to beinging installation of JDK then click run.
When the installation process starts, keep clicking next button to continue. Confirm the last step of installation process by clicking the close button. This will complete the installation process

Then open Command prompt from your PC, then type java then click enter, after it runs, type java -version the click enter.
Done you've installed java in your pc!

# Downloading gradle to your pc
To download gradle, make sure you have installed java jdk. To confirm you have this, open command prompt and type out java -version then press enter, If its not installed you will get an error that javac is not recognised. If you get this error download and install java jdk (Instructions are above)

If java is installed proceed to download gradle using this link https://gradle.org/

Once you have downloaded, extract the gradle download to the program files folder, then add location of your gradle bin folder to your path. To do this open sytem properties, select the advanced tab and the environment variables button then add'C:\Program Files\gradle-94.x\bin” to the end of your “Path” variable under System Properties. 

Be sure to omit any quotation marks around the path even if it contains spaces. Also make sure you separated from previous PATH entries with a semicolon “;”.

In the same dialog, make sure that JAVA_HOME exists in your user variables or in the system variables and it is set to the location of your JDK, e.g. C:\Program Files\Java\jdk1.7.0_06 and that %JAVA_HOME%\bin is in your Path environment variable.
Open a new command prompt (type cmd in Start menu) and run gradle –version to verify that it is correctly installed.
