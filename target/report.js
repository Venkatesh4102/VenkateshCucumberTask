$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/scenerio.feature");
formatter.feature({
  "name": "generate customer ID",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "To generate the customer id",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "user should launch browser and load url",
  "keyword": "Given "
});
formatter.match({
  "location": "CusId.user_should_launch_browser_and_load_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should give valid detail",
  "keyword": "When "
});
formatter.match({
  "location": "CusId.user_should_give_valid_detail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Display customer id",
  "keyword": "Then "
});
formatter.match({
  "location": "CusId.display_customer_id()"
});
formatter.result({
  "status": "passed"
});
});