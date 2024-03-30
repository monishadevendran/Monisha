Feature:To validate the login functionality of facebook Application

#background keyword we can use both of the scenerio and sceneriooutline common steps(Given)

Background: To Launch the chrome browser and maximize window

Scenario:To validate login with valid username and Invalid password
#Given To Launch the chrome browser and maximize window
When To Launch the url of the facebook application
And To pass valid username in email field
And To pass valid password in password field
And To click the login button
And To check whether navigate to the home or not
Then To close the browser

Scenario Outline:To validate the positive and negative combination of login functionality
#Given To Launch the chrome browser and maximize window
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
|monishamoni@gmail.com      |9877678      |


