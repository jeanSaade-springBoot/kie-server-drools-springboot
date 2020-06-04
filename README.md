# Code challenge


# Exercice 2
Write a Java code where a user can issue a card that can be prepaid or credit, in case it’s a prepaid card it will have maximum top up limit, and many loading limits (monthly, weekly, yearly)
If it's a credit card it will also have limits and fees which will be calculated based on the usage of this card. The trick is to use a rule engine (kie server drools) to apply these rules. Try not to use if conditions and have everything run in the rule engine and not hard-coded in java
### This exercie is done using the below technologies:

*  spring boot 
* kies server
* drools
  
  please clone the project from the git and maven dependecies will handle all the configuration
### Step to deploy:
-     run the spring boot project "spring-boot-drools"
-    do this api call that will call the bpmn process: "http://localhost:8080/test/card?type=C" 