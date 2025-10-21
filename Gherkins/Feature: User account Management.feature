Feature: User account Management
Scenario: Creating a new user successfully
Given the system already accept new orders
When I send a POST request to "/users" with the following body
''''''
{
"name":"Tim",
"email" : "tim@example.com",
"password" : "securepassword123"
}
''''''
the