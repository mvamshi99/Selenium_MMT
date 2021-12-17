Feature: Verify Login Screen

@FaceBook
Scenario: Login with valid credentials to Gmail.com
Given User enters "mvamshi99@gmail.com" and "Test@123"
Then Click on the "Log In" Button


@Naukri
Scenario: Capture Window handles and close them
Given Go to "https://www.naukri.com/" website
Then Capture Windows and close them

@Zomato
Scenario: Zomato validations
Given Enter "https://www.zomato.com/" website
Then Click on the "Log in" button
Then Enter username as "8074307046"
Then Click on the login button.


@Loginm
Scenario: mmt Login validations
Given Go to "https://www.makemytrip.com/" websites
Then Click on "Login" button
Then Enter mobile number as "8074307046"
Then Click on the CONTINUE button

@Fblogin
Scenario:Fb login validations
Given User enters "mvamshi99@gmail.com" and "Test@123"
Then Click on the "Log In" Button


@Tsrtc
Scenario: Tsrtc Login
Given Go to Tsrtc website
Then Click on "Log in" 
Then enter "Username" and "Password"




