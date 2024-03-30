Feature:To validate the login functionality in facebook application 

Scenario:To validate login with valid email and invalid password

Given To launch Edge browser and maximize window
When To launch the Url browser of the facebook application
And To pass valid username in email field
And To pass valid password in password field
And To click the login button
And To check whether navigate to the home or not
Then To close the browser

Scenario Outline:To validate the positive and negative combination of login functionality
Given user has to launch the browser and maximize window
When user has to hit the facebook Url 
And user has to pass the data "<emaildatas>" in email field
And user has to pass the data "<passworddatas>" in password field
And user has to click login button 
Then user has to close the browser

Examples:

|emaildatas                 |passworddatas|
|monishasweety2206@gmail.com|devenmagesh  |
|tamildts@gmail.com         |tamil15      |
|bhavin15@gmail.com         |bhavinwed    |
|monishasaravan@gmail.com   |saravanan    |
|devendran24@gmail.com      |devenn       |
|monigibby@gmail.com        |gibbyprince  |
|gmapple@gmail.com          |gmmettu      |