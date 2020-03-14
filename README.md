## Instructions

* Download and extract project zip file to your computer
* 3 versions of Selenium drivers (ChromeDriver 81.0.4044.20) are included to the project: Linux, Windows and Mac
* Set system property in `src/test/java/com/herokuapp/raamatukogu/test/FunctionalTest.java` file, depending on your operation system. Just comment / uncomment line. If you are a windows user, skip this point 
* Please note that you might need to configure TestNG to see the report output folder. IntelliJ IDEA example: 
    * Run -> Edit Configuration -> Listeners -> `Use default reporters` should be checked
    * Output directory should be set correctly: for example project root path + folder name (e.g. test-output)
    * Click `Apply` and `Ok`
* Run the `testng.xml` file in a root folder to execute the test cases. Alternatively you can run `BookTest.java`
* You can find test results at `test-output` folder (if TestNG is configuration is correct) by copying and pasting absolute path of `index.html` file in a browser or just open XML file at `junitreports` folder