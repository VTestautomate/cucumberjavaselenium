# cucumberjavaselenium
1. Attaching the library in the email, please have the libraries from the attachment added to the project
2. Place the chromedriver in any location and goto src/Utils/DriverSetup.java and add the path of chrome driver in this line
System.setProperty("webdriver.chrome.driver", "<chrome_driver_path>");  - I have not included chrome driver within the project itself, due to time crunch. Including with the project path would be ideal for project sharing.
3. Only implement for Chrome for now.
4. Run Runner.java to execute all the scenarios
5. Reports.cucumberHTMLReport folder has index.html -> Cucumber report in HTML format. open index.html in any browser to see the execution report
6. One place i have used Selenium WaitfForELement method, rest all other places used Thread.sleep() just to get things done in short amount of time
