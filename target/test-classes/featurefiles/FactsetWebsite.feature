
Feature: Validate Factset Website
  
@FactsetWeb
Scenario:Validate dropdown options under services
Given Launch Browser and open Factset website
Then Hover over Services dropdown and capture values under it
And Compare captured and actual dropdown values