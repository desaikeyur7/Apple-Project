$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/AppleMac/userShouldBeAbleToBuyMacBookPro.feature");
formatter.feature({
  "line": 1,
  "name": "Buying a MacBook Pro on the website",
  "description": "\r\nAs an online customer\r\nI want to choose a MacBook with accessories on the website\r\nSo so that I can buy it online",
  "id": "buying-a-macbook-pro-on-the-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10434478600,
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
  "duration": 239777100,
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
  "duration": 2503391500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.i_choose_a_MacBook_Pro_with_the_following_features_and_accessories(DataTable)"
});
formatter.result({
  "duration": 27776480300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.i_can_place_an_order_for_it()"
});
formatter.result({
  "duration": 1178831400,
  "status": "passed"
});
formatter.after({
  "duration": 923508300,
  "status": "passed"
});
formatter.before({
  "duration": 5986449600,
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
  "duration": 108100,
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
  "duration": 23980941600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.i_proceed_to_the_checkout()"
});
formatter.result({
  "duration": 648097400,
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
  "duration": 38140400,
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
  "duration": 37797100,
  "status": "passed"
});
formatter.after({
  "duration": 841577400,
  "status": "passed"
});
});