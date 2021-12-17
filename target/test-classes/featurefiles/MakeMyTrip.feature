Feature:Verify MakeMyTrip validations

@SelectFlight
Scenario:Select flights from mmt
Given Go to "https://www.makemytrip.com/" websites
Then Select "From" city 
Then Select "To" city
Then Click on "Search" button

@Farecheck
Scenario:Select flight from mmt and capture lowest fare
Given Go to "https://www.makemytrip.com/" websites
Then Select "From" city 
Then Select "To" city
Then Click on "Search" button
Then Click on "View Prices" button
Then Capture Lowestprice in list
Then Click on "Book Now" button
Then Capture the Finalprice and check it should be same with viewprice



  