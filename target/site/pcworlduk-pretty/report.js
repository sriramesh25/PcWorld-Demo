$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature.feature");
formatter.feature({
  "line": 1,
  "name": "E-Commerce Application",
  "description": "",
  "id": "e-commerce-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7478862155,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Add Product to Bag",
  "description": "",
  "id": "e-commerce-application;add-product-to-bag",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Iam in the PcWorld Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I search for \"lenovo\"laptop",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I select the Laptop from the List",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click Add to Basket the item updated on the Basket",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.iamInThePcWorldHomePage()"
});
formatter.result({
  "duration": 16362874333,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lenovo",
      "offset": 14
    }
  ],
  "location": "MyStepdefs.iSearchForLaptop(String)"
});
formatter.result({
  "duration": 6866607183,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectTheLaptopFromTheList()"
});
formatter.result({
  "duration": 8987277000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickAddToBasketTheItemUpdatedOnTheBasket()"
});
formatter.result({
  "duration": 2014395019,
  "status": "passed"
});
formatter.after({
  "duration": 189487,
  "status": "passed"
});
formatter.before({
  "duration": 5003823530,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Remove Item from the Basket",
  "description": "",
  "id": "e-commerce-application;remove-item-from-the-basket",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "Iam in the PcWorld",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I search for \"Lenovo\" laptop",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select item from the list",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I add item to the shopping Basket",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Ima in the Basket",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click remove to empty the Basket",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.iamInThePcWorld()"
});
formatter.result({
  "duration": 12840531556,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lenovo",
      "offset": 14
    }
  ],
  "location": "MyStepdefs.iSearchForLaptops(String)"
});
formatter.result({
  "duration": 6351381929,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectItemFromTheList()"
});
formatter.result({
  "duration": 11669456502,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iAddItemToTheShoppingBasket()"
});
formatter.result({
  "duration": 7258359667,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.imaInTheBasket()"
});
formatter.result({
  "duration": 37046739542,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickRemoveToEmptyTheBasket()"
});
formatter.result({
  "duration": 1987540485,
  "status": "passed"
});
formatter.after({
  "duration": 303265,
  "status": "passed"
});
});