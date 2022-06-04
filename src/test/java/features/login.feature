Feature: Validating Login Vita Mojo API
@login
Scenario Outline: Verify user is being Succesfully logged in using loginAPI
	Given login Payload with "<email>"  "<password>"
	When user calls "LoginAPI" with "POST" http request
	Then the API call got success with status code 200
	And "payload.user.email" in response body is "<email>"
	
Examples:
	|email 	        | password   |
	|amar@gmail.com |  amar@1234 |

	 


	

	
	
	
	
	
	

	
	
	