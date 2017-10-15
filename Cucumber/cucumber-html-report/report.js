$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Filetest.feature");
formatter.feature({
  "line": 1,
  "name": "The facebook scenario",
  "description": "",
  "id": "the-facebook-scenario",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login with valid credentials",
  "description": "",
  "id": "the-facebook-scenario;login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open Firefox and open the Facebook page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter username and Password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I ahave to be on my home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Facebook_Login.Open_Firefox_and_open_the_Facebook_page1()"
});
formatter.result({
  "duration": 8487141808,
  "status": "passed"
});
formatter.match({
  "location": "Facebook_Login.I_enter_username_and_Password1()"
});
formatter.result({
  "duration": 44906390,
  "error_message": "org.openqa.selenium.InvalidArgumentException: Expected [object Undefined] undefined to be a string\nBuild info: version: \u00273.0.1\u0027, revision: \u00271969d75\u0027, time: \u00272016-10-18 09:49:13 -0700\u0027\nSystem info: host: \u0027Lenovo-PC\u0027, ip: \u0027131.220.205.161\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{moz:profile\u003dC:\\Users\\VENKAT~1\\AppData\\Local\\Temp\\rust_mozprofile.zggZ4rgKyNFT, rotatable\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, pageLoadStrategy\u003dnormal, platform\u003dANY, specificationLevel\u003d0, moz:accessibilityChecks\u003dfalse, acceptInsecureCerts\u003dfalse, browserVersion\u003d54.0.1, platformVersion\u003d6.3, moz:processID\u003d676, browserName\u003dfirefox, platformName\u003dwindows_nt}]\nSession ID: 83d6dd99-c46d-42dd-8b3c-7cd4be19fe7f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:127)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:93)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:42)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:163)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:274)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:98)\r\n\tat selenium_cucumber.Facebook_Login.I_enter_username_and_Password1(Facebook_Login.java:23)\r\n\tat ✽.When I enter username and Password(Filetest.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Facebook_Login.I_ahave_to_be_on_my_home_page()"
});
formatter.result({
  "status": "skipped"
});
});