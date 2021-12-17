$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featurefiles/Guru99.feature");
formatter.feature({
  "name": "Validate Guru99 Website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate dropdown options under AI",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Guru99Web"
    }
  ]
});
formatter.step({
  "name": "Launch Browser and open Guru99 Website",
  "keyword": "Given "
});
formatter.match({
  "location": "testcases.Guru99Web.launch_Browser_and_open_Guru99_Website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click over AI dropdown and capture values under it",
  "keyword": "Then "
});
formatter.match({
  "location": "testcases.Guru99Web.click_over_AI_dropdown_and_capture_values_under_it()"
});
formatter.result({
  "status": "passed"
});
});