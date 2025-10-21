@smoke @atm
Feature: Account Holder withdraws cash
  
Scenario Outline: Account has sufficient funds
  Given the account balance is $<balance>
    And the card is valid
    And the machine contains enough money  
   When the Account Holder requests $<requested>
   Then the ATM should dispense $<dispenced>
    And the account balance should be $<new-balance>
    And the card should be returned
  Examples: 
    | balance | requested | dispensed | new-balance | 
    | 100     | 20        | 20        | 80          | 
  
  