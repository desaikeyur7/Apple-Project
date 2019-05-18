$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/AppleMac/userShouldBeAbleToBuyMacBookPro.feature");
formatter.feature({
  "line": 1,
  "name": "Buying a MacBook Pro on the website",
  "description": "\r\nAs an online customer\r\nI want to choose a MacBook with accessories on the website\r\nSo so that I can buy it online",
  "id": "buying-a-macbook-pro-on-the-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9763064300,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "the url ‘https://www.apple.com/uk/’",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepDefs.the_url_https_www_apple_com_uk()"
});
formatter.result({
  "duration": 452448800,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "A MacBook 15” with accessories can be ordered on the website",
  "description": "",
  "id": "buying-a-macbook-pro-on-the-website;a-macbook-15”-with-accessories-can-be-ordered-on-the-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I go to url",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I choose a MacBook Pro with the following features and accessories",
  "rows": [
    {
      "cells": [
        "Option",
        "Specification"
      ],
      "line": 14
    },
    {
      "cells": [
        "Screen",
        "15’’"
      ],
      "line": 15
    },
    {
      "cells": [
        "Processor",
        "2.9 GHz"
      ],
      "line": 16
    },
    {
      "cells": [
        "Memory RAM",
        "16 GB"
      ],
      "line": 17
    },
    {
      "cells": [
        "Colour",
        "Silver"
      ],
      "line": 18
    },
    {
      "cells": [
        "Software",
        "Logic Pro X"
      ],
      "line": 19
    },
    {
      "cells": [
        "Display adapter",
        "USB-C to USB Adapter"
      ],
      "line": 20
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I can place an order for it",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.i_go_to_url()"
});
formatter.result({
  "duration": 2601655400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.i_choose_a_MacBook_Pro_with_the_following_features_and_accessories(DataTable)"
});
formatter.result({
  "duration": 25649654400,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"[class*\u003d\u0027retail-availability-search-trigger\u0027]\"}\n  (Session info: chrome\u003d74.0.3729.157)\n  (Driver info: chromedriver\u003d74.0.3729.6 (255758eccf3d244491b8a1317aa76e1ce10d57e9-refs/branch-heads/3729@{#29}),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-M4SV04L\u0027, ip: \u0027192.168.0.127\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_211\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 74.0.3729.6 (255758eccf3d24..., userDataDir: C:\\Users\\Admin\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:55122}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 74.0.3729.157, webStorageEnabled: true}\nSession ID: deb5bbfbeb001f2275ec5d6e81b17ec3\n*** Element info: {Using\u003dcss selector, value\u003d[class*\u003d\u0027retail-availability-search-trigger\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:420)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat AppleMac.Utils.elementIsDisplayed(Utils.java:37)\r\n\tat PageObjects.BuyMacBookPro15InchPage.verifyElementsInStickyBoxAtBottomOfPageAreDisplayed(BuyMacBookPro15InchPage.java:64)\r\n\tat AppleMac.MyStepDefs.i_choose_a_MacBook_Pro_with_the_following_features_and_accessories(MyStepDefs.java:46)\r\n\tat ✽.When I choose a MacBook Pro with the following features and accessories(src/test/Resources/AppleMac/userShouldBeAbleToBuyMacBookPro.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MyStepDefs.i_can_place_an_order_for_it()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("!!-----------.......Scenario Failed......----------!! Please see attached screenshot for the error/issue");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1436366700,
  "status": "passed"
});
formatter.before({
  "duration": 5746930400,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "the url ‘https://www.apple.com/uk/’",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepDefs.the_url_https_www_apple_com_uk()"
});
formatter.result({
  "duration": 120500,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "The correct price and VAT are displayed for a MacBook 15” with accessories",
  "description": "",
  "id": "buying-a-macbook-pro-on-the-website;the-correct-price-and-vat-are-displayed-for-a-macbook-15”-with-accessories",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "when I choose the following items:",
  "rows": [
    {
      "cells": [
        "Option",
        "Price in £"
      ],
      "line": 28
    },
    {
      "cells": [
        "MacBook Pro and software",
        "3168.99"
      ],
      "line": 29
    },
    {
      "cells": [
        "Display adapter",
        "19.00"
      ],
      "line": 30
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "I proceed to the checkout",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "a total price of £3187.99 will be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "£531.34 will be listed for VAT.VAT",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDefs.when_I_choose_the_following_items(DataTable)"
});
formatter.result({
  "duration": 28570904500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.i_proceed_to_the_checkout()"
});
formatter.result({
  "duration": 1279494500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3187",
      "offset": 18
    },
    {
      "val": "99",
      "offset": 23
    }
  ],
  "location": "MyStepDefs.a_total_price_of_£_will_be_displayed(int,int)"
});
formatter.result({
  "duration": 80958100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "531",
      "offset": 1
    },
    {
      "val": "34",
      "offset": 5
    }
  ],
  "location": "MyStepDefs.£_will_be_listed_for_VAT_VAT(int,int)"
});
formatter.result({
  "duration": 64276700,
  "status": "passed"
});
formatter.after({
  "duration": 169912600,
  "status": "passed"
});
});